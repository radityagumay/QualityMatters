pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        jcenter()
        mavenCentral()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "com.android") {
                useModule("com.android.tools.build:gradle:7.0.0-alpha02")
            }
        }
    }
}
rootProject.name = "QualityMatters"


include(":androidApp")
include(":shared")

