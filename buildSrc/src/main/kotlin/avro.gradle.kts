plugins {
    id("io.github.androa.gradle.plugin.avro")
}

generateAvro {
    // Set noSetters to the a different value
    noSetters = true
}