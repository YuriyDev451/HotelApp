object Versions {
    const val androidApplication = "8.2.0"
    const val jetbrainsKotlin = "1.9.10"
    const val materialComponents = "1.11.0"
    const val constraintlayoutVersion = "2.1.4"
    const val junitJunit = "4.13.2"
    const val testExtJunit = "1.1.5"
    const val testEspresso = "3.5.1"
    const val navigation = "2.7.6"
    const val core = "1.12.0"
    const val compat = "1.6.1"

    const val hilt = "2.46"

    const val retrofit = "2.9.0"
    const val okhttpLogging = "4.10.0"
    const val okhttp = "5.0.0-alpha.3"
    const val gson = "2.10.1"

    const val glide = "4.12.0"
    const val glideCompiler = "4.12.0"

    const val nav = "2.7.6"
    const val coroutine = "1.7.1"

}


//implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")


object Libs {
    object Coroutine{
        const val kotlinCoroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}"
    }

    object Glide{
        const val glideGlide = "com.github.bumptech.glide:glide:${Versions.glide}"
        const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glideCompiler}"
    }
    object UI {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.compat}"
        const val material = "com.google.android.material:material:${Versions.materialComponents}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayoutVersion}"
    }
    object KotlinEx{
        const val coreCore = "androidx.core:core-ktx:${Versions.core}"
    }
    object Test {
        const val junitTest = "junit:junit:${Versions.junitJunit}"
        const val extJunitTest = "androidx.test.ext:junit:${Versions.testExtJunit}"
        const val espressoTest = "androidx.test.espresso:espresso-core:${Versions.testEspresso}"
    }

    object Api {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLogging}"
        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
        const val gson = "com.google.code.gson:gson:${Versions.gson}"
    }


    object Navigation {
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
        const val navigation = "androidx.navigation:navigation-fragment-ktx:${Versions.nav}"
    }

    object Hilt {
        const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltKapt = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    }
}





object Plugins {

    const val androidApplication = "com.android.application"
    const val  jetbrainsKotlin = "org.jetbrains.kotlin.android"
    const val androidLibrary = "com.android.library"
    const val kotlinKapt = "kotlin-kapt"
    const val parcelize = "kotlin-parcelize"

    const val hilt = "dagger.hilt.android.plugin"

}

object Classpath {
    const val hilt = "com.google.dagger.hilt.android"
}