plugins {
    id(Plugins.androidApplication)
    id(Plugins.jetbrainsKotlin)
    id(Plugins.kotlinKapt)
    id(Plugins.hilt)

}

android {
    namespace = "com.example.hotelapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.hotelapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {
    implementation(Libs.UI.material)
    implementation(Libs.UI.constraintLayout)
    implementation(Libs.UI.appCompat)
    implementation(Libs.KotlinEx.coreCore)
    implementation(Libs.Navigation.navigationFragment)
    implementation(Libs.Navigation.navigationUi)
    testImplementation(Libs.Test.junitTest)
    androidTestImplementation(Libs.Test.extJunitTest)
    androidTestImplementation(Libs.Test.espressoTest)

    implementation(Libs.Hilt.hilt)
    kapt(Libs.Hilt.hiltKapt)

    implementation(project(":features:hotels"))
    implementation(project(":features:favorite"))
    implementation(project(":common"))

    //implementation("androidx.core:core-ktx:1.12.0")
    //implementation("androidx.appcompat:appcompat:1.6.1")
    //implementation("com.google.android.material:material:1.11.0")
    //implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    //testImplementation("junit:junit:4.13.2")
    //androidTestImplementation("androidx.test.ext:junit:1.1.5")
    //androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}