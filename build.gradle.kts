// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false

    // ksp
    id("com.google.devtools.ksp") version "2.0.21-1.0.27" apply false

    // serialization
    kotlin("jvm") version "2.1.10"
    kotlin("plugin.serialization") version "2.1.10"

    // dagger hilt (finally i use this library after a long time)
    id("com.google.dagger.hilt.android") version "2.51.1" apply false

}