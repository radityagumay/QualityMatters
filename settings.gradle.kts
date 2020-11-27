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
                useModule("com.android.tools.build:gradle:4.2.0-alpha16")
            }
        }
    }
}
rootProject.name = "QualityMatters"


include(":androidApp")
include(":shared")

