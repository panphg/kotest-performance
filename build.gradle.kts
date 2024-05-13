plugins {
    kotlin("jvm") version "1.9.23"
    id("idea")
}

group = "com.example"
version = "0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    val kotestVersion = System.getProperty("version") ?: "5.9.0"
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
    testImplementation("io.kotest:kotest-property:$kotestVersion")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}

tasks {
    wrapper {
        gradleVersion = "8.7"
    }
}
