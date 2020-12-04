package plugin

import Versions
import com.android.build.gradle.BaseExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

//See more in https://foso.github.io/Jetpack-Compose-Playground/general/getting_started/
class JetpackComposePlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.tasks.withType<KotlinCompile>().configureEach {
            kotlinOptions {
                jvmTarget = JavaVersion.VERSION_1_8.toString()
                freeCompilerArgs = freeCompilerArgs + listOf(
                    "-Xallow-jvm-ir-dependencies",
                    "-Xskip-prerelease-check",
                    "-Xuse-experimental=androidx.compose.animation.ExperimentalAnimationApi"
                )
            }
        }
        project.extensions.getByType<BaseExtension>().run {
            buildFeatures.compose = true
            composeOptions {
                kotlinCompilerVersion = Versions.kotlin
                kotlinCompilerExtensionVersion = Versions.compose
            }
        }

        project.dependencies.run {
            addImplementation("androidx.compose.animation:animation:${Versions.compose}")
            addImplementation("androidx.compose.foundation:foundation:${Versions.compose}")
            addImplementation("androidx.compose.foundation:foundation-layout:${Versions.compose}")
            addImplementation("androidx.compose.material:material:${Versions.compose}")
            addImplementation("androidx.compose.material:material-icons-extended:${Versions.compose}")
            addImplementation("androidx.compose.runtime:runtime:${Versions.compose}")
            addImplementation("androidx.compose.ui:ui:${Versions.compose}")
            addImplementation("androidx.ui:ui-tooling:${Versions.compose}")
            addImplementation("androidx.navigation:navigation-compose:${Versions.composeNav}")
            addImplementation("androidx.paging:paging-compose:${Versions.composePaging}")

            addImplementation("dev.chrisbanes.accompanist:accompanist-coil:${Versions.composeAppComponist}")
        }

    }
}