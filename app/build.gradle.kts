plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.belajar.pagination"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.belajar.pagination"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // KotlinX Serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.0")

    // Retrofit
    implementation("com.squareup.retrofit:retrofit:2.9.0")
    implementation("com.squareup.retrofit:converter-gson:2.9.0")
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:1.0.0")

    // Room Db
    val room_version = "2.6.1"
    implementation("androidx.room:room-runtime:$room_version")
//    ksp("androidx.room:room-compiler:$room_version")
    annotationProcessor("androidx.room:room-compiler:$room_version")
    implementation("androidx.room:room-ktx:$room_version")
    implementation("androidx.room:room-paging:$room_version")

    // Dagger Hilt
    val dagger_version = "2.51.1"
    implementation("com.google.dagger:hilt-android:$dagger_version")
    ksp("com.google.dagger:hilt-android-compiler:$dagger_version")
    ksp("androidx.hilt:hilt-compiler:1.0.0")
    implementation("androidx.hilt:hilt-navigation-fragment:1.0.0")

    // Coroutines
    val coroutines_version = "1.3.9"
    implementation("androidx.room:room-ktx:$room_version")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_version")

    // Navigation Compose
    val nav_version = "2.8.5"
    implementation("androidx.navigation:navigation-compose:$nav_version")

    // Paging 3
    implementation("androidx.paging:paging-compose:3.3.2")

    // Coil Library
    implementation("io.coil-kt.coil3:coil-compose:3.0.4")

}