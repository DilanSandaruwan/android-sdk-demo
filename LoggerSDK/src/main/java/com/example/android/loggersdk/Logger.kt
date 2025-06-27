package com.example.android.loggersdk

object Logger {
    private var isLoggingEnabled = true

    fun init(enableLogging: Boolean) {
        isLoggingEnabled = enableLogging
    }

    fun logInfo(tag: String, message: String) {
        if (isLoggingEnabled) {
            android.util.Log.i(tag, message)
        }
    }

    fun logWarning(tag: String, message: String) {
        if (isLoggingEnabled) {
            android.util.Log.w(tag, message)
        }
    }

    fun logError(tag: String, message: String) {
        if (isLoggingEnabled) {
            android.util.Log.e(tag, message)
        }
    }
}