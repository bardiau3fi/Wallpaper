plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("kotlin-parcelize")
    id("kotlin-kapt")
    alias(libs.plugins.navigationsafeargs)
    alias(libs.plugins.daggerhiltandroid)




}
android {
    namespace = "com.example.wallpaper"
    compileSdk = 34
buildFeatures{
    viewBinding=true
}
    defaultConfig {
        applicationId = "com.example.wallpaper"
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
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    //Navigation
    implementation (libs.androidx.navigation.fragment.ktx)
    implementation (libs.androidx.navigation.ui.ktx)
//    implementation 'androidx.navigation:navigation-fragment-ktx:2.7.4'
//    implementation 'androidx.navigation:navigation-ui-ktx:2.7.4'
    //Dagger - Hilt
    implementation (libs.hilt.android)
    kapt (libs.hilt.compiler)

// Retrofit
    implementation (libs.retrofit)
    implementation (libs.converter.gson)
// Paging
    implementation (libs.androidx.paging.runtime)

// OkHTTP client
    implementation (libs.okhttp)
    implementation (libs.logging.interceptor)

// Coroutines
    implementation (libs.kotlinx.coroutines.core)
    implementation (libs.kotlinx.coroutines.android)

// Lifecycle
    implementation (libs.androidx.lifecycle.extensions)
    implementation (libs.androidx.lifecycle.runtime.ktx)
    implementation (libs.androidx.lifecycle.viewmodel.ktx)
    implementation (libs.androidx.lifecycle.livedata.ktx)

// Image Loading
    implementation (libs.coil)

// Gson
    implementation (libs.gson)

// Calligraphy
    implementation (libs.calligraphy3)
    implementation (libs.viewpump)

// Other
    implementation (libs.shimmer)
    implementation (libs.shimmer.recyclerview)
    implementation (libs.kenburnsview)
    implementation (libs.dynamicSizes)
    implementation (libs.rotateView)
    implementation (libs.permissionsFlow)

}




