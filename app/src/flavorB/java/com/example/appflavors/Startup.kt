package com.example.appflavors

import android.app.Application

class Startup : Application() {
    companion object {
        const val appType: Int = 2
    }
}