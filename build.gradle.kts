buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
        classpath("com.android.tools.build:gradle:${Versions.androidGradle}")
        classpath("com.android.tools.build:builder:${Versions.androidGradle}")
        classpath("com.android.tools.build:builder-model:${Versions.androidGradle}")
    }
}
group = "com.radityalabs.qualitymatter"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
