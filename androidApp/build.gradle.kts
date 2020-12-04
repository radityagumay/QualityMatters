//apply<plugin.JetpackComposePlugin>()
plugins {
    id("com.android.application")
    `jetpack-compose-precompile`
    kotlin("android")
    id("kotlin-android-extensions")
}
group = "com.radityalabs.qualitymatter"
version = "1.0-SNAPSHOT"

repositories {
    gradlePluginPortal()
    google()
    jcenter()
    mavenCentral()
}
dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
}
android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "com.radityalabs.qualitymatter.androidApp"
        minSdkVersion(24)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}