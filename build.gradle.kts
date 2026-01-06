// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
    id ("com.google.android.libraries.mapsplatform.secrets-gradle-plugin") version "2.0.1"
}
buildscript {
    repositories {
        google()  // Make sure you have this repository added
        mavenCentral()

    }
    dependencies {
        classpath ("com.android.tools.build:gradle:8.8.2")
        classpath("com.google.gms:google-services:4.4.2")

    }
}
val myValue by extra("key0")
