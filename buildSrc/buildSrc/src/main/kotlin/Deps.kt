object AndroidSdk {
	const val min = 24
	const val compile = 30
	const val target = compile
}

object BuildPlugins {
	const val androidGradle = "com.android.tools.build:gradle:${Versions.androidGradle}"
	const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Libs {
	const val kotlinStd = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
	object Android {
		const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
		const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
	}

	//Coroutine
	object Coroutine {
		const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}"
		const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutine}"
		const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutine}"
	}


}