package com.meli.motivationapp.infra

import android.content.Context
import android.content.SharedPreferences


class SecurityPreferences(context: Context) {

    private val security: SharedPreferences =
        context.getSharedPreferences("Motivation", Context.MODE_PRIVATE)

    fun storeString(key: String, str: String) {
        security.edit().putString(key, str).apply()
    } //Salva o valor

    fun getString(key: String): String {
        return security.getString(key, "") ?: ""
    } //Pega o valor sendo nulo ou não
}