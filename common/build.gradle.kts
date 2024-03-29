plugins {
    id(Plugins.androidLibrary)
    id(Plugins.jetbrainsKotlin)

}

android {
    namespace = "com.example.common"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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

    implementation(Libs.Navigation.navigation)
    implementation(Libs.Navigation.navigationUi)
    implementation(Libs.Navigation.navigationFragment)

    implementation(Libs.KotlinEx.coreCore)
    implementation(Libs.UI.appCompat)
    implementation(Libs.UI.material)
    testImplementation(Libs.Test.junitTest)
    androidTestImplementation(Libs.Test.extJunitTest)
    androidTestImplementation(Libs.Test.espressoTest)


    //implementation("androidx.core:core-ktx:1.12.0")
    //implementation("androidx.appcompat:appcompat:1.6.1")
    //implementation("com.google.android.material:material:1.11.0")
    //testImplementation("junit:junit:4.13.2")
    //androidTestImplementation("androidx.test.ext:junit:1.1.5")
    //androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}