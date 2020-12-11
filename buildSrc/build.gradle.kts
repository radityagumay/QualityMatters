plugins {
    `kotlin-dsl`
//    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    google()
    jcenter()
    gradlePluginPortal()
}


dependencies {
    implementation(BuildPlugins.androidGradle)
    implementation(BuildPlugins.kotlinGradlePlugin)
}

kotlin {
    // Add Deps to compilation, so it will become available in main project
    sourceSets.getByName("main").kotlin.srcDir("buildSrc/src/main/kotlin")
}