import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("com.android.application")
    kotlin("android")
}


android {
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerVersion = Versions.kotlin
        kotlinCompilerExtensionVersion = Versions.compose
    }
}

dependencies {
    implementation("androidx.compose.animation:animation:${Versions.compose}")
    implementation("androidx.compose.compiler:compiler:${Versions.compose}")
    implementation("androidx.compose.foundation:foundation:${Versions.compose}")
    implementation("androidx.compose.material:material:${Versions.compose}")
    implementation("androidx.compose.runtime:runtime:${Versions.compose}")
    implementation("androidx.compose.ui:ui:${Versions.compose}")
    implementation("androidx.compose.ui:ui-tooling:${Versions.compose}")
    androidTestImplementation("androidx.compose.ui:ui-test:${Versions.compose}")
    implementation("dev.chrisbanes.accompanist:accompanist-coil:${Versions.composeAppComponist}")
    implementation("androidx.navigation:navigation-compose:${Versions.composeNav}")
    implementation("androidx.paging:paging-compose:${Versions.composePaging}")
}


tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
        freeCompilerArgs = freeCompilerArgs + listOf(
            "-Xallow-jvm-ir-dependencies", "-Xskip-prerelease-check"
        )
    }
}