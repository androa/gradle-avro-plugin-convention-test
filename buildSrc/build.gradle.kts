plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(kotlin("gradle-plugin"))
    implementation("io.github.androa.gradle.plugin.avro:io.github.androa.gradle.plugin.avro.gradle.plugin:0.0.12")
}

repositories {
    gradlePluginPortal()
}
