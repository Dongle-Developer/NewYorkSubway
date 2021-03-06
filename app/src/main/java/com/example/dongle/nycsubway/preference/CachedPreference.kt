package com.example.dongle.nycsubway.preference

import android.content.Context
import android.content.SharedPreferences

/**
 * @author Leopold
 */
@Suppress("unused")
abstract class CachedPreference constructor(private val context: Context, private val name: String) {
    private val cache: MutableMap<String, Any?> = mutableMapOf()

    init {
        preLoad()
    }

    private fun preLoad(): Unit {
        val all: MutableMap<String, *> = getSharedPreferences().all
        all.keys
                .filter { k: String? -> k != null }
                .forEach { k: String -> cache.put(k, all[k]) }
    }

    private fun getSharedPreferences(): SharedPreferences {
        return context.getSharedPreferences(name, Context.MODE_PRIVATE)
    }

    fun get(key: String, defaultValue: Any? = null): Any? {
        if (hasKey(key)) {
            return cache[key]
        } else {
            val all: MutableMap<String, *> = getSharedPreferences().all
            all.keys
                    .filter { k: String? -> all.contains(k) }
                    .forEach { k: String -> cache.put(k, all[k]) }
        }

        return defaultValue
    }

    fun hasKey(key: String): Boolean {
        return cache.containsKey(key)
    }

    fun put(key: String, value: Any?): Unit {
        cache.put(key, value)

        val editor: SharedPreferences.Editor = getSharedPreferences().edit()
        when(value) {
            is Int -> editor.putInt(key, value)
            is Boolean -> editor.putBoolean(key, value)
            is Long -> editor.putLong(key, value)
            is Float -> editor.putFloat(key, value)
            else -> editor.putString(key, value?.toString())
        }

        editor.apply()
    }

    fun clear(): Unit {
        cache.clear()

        val editor: SharedPreferences.Editor = getSharedPreferences().edit()
        editor.clear()
        editor.apply()
    }
}