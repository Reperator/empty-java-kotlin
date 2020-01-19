import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "de.fabianbonk"
version = "1.0-SNAPSHOT"

plugins {
    application
    java
    id("org.jetbrains.kotlin.jvm") version "1.3.61"
}

application {
    mainClassName = "de.fabianbonk.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
