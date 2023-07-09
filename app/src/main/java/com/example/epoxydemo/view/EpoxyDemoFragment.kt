package com.example.epoxydemo.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.example.epoxydemo.R
import com.example.epoxydemo.controller.EpoxyDemoController
import com.example.epoxydemo.databinding.FragmentEpoxyDemoBinding
import com.example.epoxydemo.viewModel.EpoxyDemoViewModel

class EpoxyDemoFragment : Fragment() {
        private lateinit var binding: FragmentEpoxyDemoBinding
        private val layoutId = R.layout.fragment_epoxy_demo
        private val viewModel by lazy { EpoxyDemoViewModel() }
        val controller by lazy { EpoxyDemoController(viewModel) }

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            binding = onCreateViewBinding(inflater, container).apply { lifecycleOwner = viewLifecycleOwner }
            return binding.root
        }

        private fun onCreateViewBinding(inflater: LayoutInflater, container: ViewGroup?) : FragmentEpoxyDemoBinding {
            return DataBindingUtil.inflate(inflater, layoutId, container, false)
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            binding.epoxyRecyclerView.setController(controller)
          //  binding.toolbar.callback = viewModel
            observeUI()
        }

        private fun observeUI() {
            viewModel.uiControllerLiveData.observe(viewLifecycleOwner, Observer {
                it?.apply {
                    controller.setData(this)
                }
            })
        }

    }
