package com.example.epoxydemo.view.customView

import android.view.View
import com.airbnb.epoxy.EpoxyHolder
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

abstract class BaseHolder : EpoxyHolder() {

    private lateinit var view: View

    override fun bindView(itemView: View) {
        view = itemView
    }

    protected fun <V : View> bind(id: Int): ReadOnlyProperty<BaseHolder, V> =
            Lazy { holder: BaseHolder, prop ->
                holder.view.findViewById(id) as V?
                        ?: throw IllegalStateException("View ID $id for '${prop.name}' not found.")
            }



    private class Lazy<V>(private val initializer: (BaseHolder, KProperty<*>) -> V)
        : ReadOnlyProperty<BaseHolder, V> {

        private object EMPTY

        private var value: Any? = EMPTY

        override fun getValue(thisRef: BaseHolder, property: KProperty<*>): V {
            if (value == EMPTY) {
                value = initializer(thisRef, property)
            }
            @Suppress("UNCHECKED_CAST")
            return value as V
        }
    }
}
