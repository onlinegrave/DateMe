buildscript {
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.43.2")
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.3.1" apply false
    id("com.android.library") version "7.3.1" apply false
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
    id("org.jlleitschuh.gradle.ktlint") version "11.0.0"
}

task<Delete>("clean") {
    delete = setOf(rootProject.buildDir)
}
