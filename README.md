# android-sdk-demo - LoggerSDK

A lightweight, plug-and-play logging SDK for Android written in Kotlin.  
Supports logging to Logcat, saving logs to file, and optional server sync.

---

## 🚀 Features

- ✅ Simple `Logger.logInfo(...)` usage
- 📄 Save logs to a local file
- ☁️ Send logs to your server (optional)
- 🔒 Toggle logging on/off

---

## 🛠️ Setup

### Step 1: Add JitPack to your root `settings.gradle.kts`

```kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}
