<img width="100" height="100" src="https://github.com/radityagumay/QualityMatters/blob/master/documentation/assets/kotlin.png?raw=true">

<p align="center">
  <img width="32%" src="https://github.com/radityagumay/QualityMatters/blob/master/documentation/assets/android.png?raw=true">
  <img width="31%" src="https://github.com/radityagumay/QualityMatters/blob/master/documentation/assets/ios1.png?raw=true">
  <img width="31%" src="https://github.com/radityagumay/QualityMatters/blob/master/documentation/assets/ios2.png?raw=true">
</p>

QualityMatters is intended to showcases as Proof of Concept for Kotlin Multiplatform Mobile (KMM).

### Architecture
<img width="400" height="400" src="https://github.com/radityagumay/QualityMatters/blob/master/documentation/assets/kotlin-multiplatform.png?raw=true">

Over the last few years we've seen that multiplatfrom has emerging, started from the hybrid platfrom such as: Apache Cordova, PhoneGap, Xamarin, React Native, even a native like Flutter.

On Kotlin multiplatform there are at-least three layers of building block, such as:
1. Enterprise Business Rules
2. Interopable Business Rules
3. Platform Specific Business Rules

#### Enterprise Business Rules (Common Code)
> includes the language, core libraries, and basic tools. Code written in common Kotlin works everywhere on all platforms. With Kotlin Multiplatform libraries, you can reuse the multiplatform logic in common and platform-specific code. Common code can rely on a set of libraries that cover everyday tasks such as HTTP, serialization, and managing coroutines.

#### Interopable Business Rules
> use platform-specific versions of Kotlin. Platform-specific versions of Kotlin (Kotlin/JVM, Kotlin/JS, Kotlin/Native) include extensions to the Kotlin language, and platform-specific libraries and tools.

#### Platform Specific Business Rules
> Here's where your native platform code is manifested. e.g Android ViewModel, or even Jetpack Compose, SwiftUI, and Jetbrains Compose

### Android
- [Jetpack Compose](https://developer.android.com/jetpack/compose) A modern UI toolkit for Android

### IOS
- [Swift UI](https://developer.apple.com/xcode/swiftui/) A modern UI toolkit for IOS

### Foundation
- [SQLDelight](https://github.com/cashapp/sqldelight) for Multiplatform Storage
- [Ktor](https://ktor.io/) for Multiplatform Network
- [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/) for Multiplatform Reactive Patterns
- [Kodein-DI](https://github.com/Kodein-Framework/Kodein-DI) for Multiplatform Dependency Injection


## License

```
Copyright 2019 Raditya Gumay.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```