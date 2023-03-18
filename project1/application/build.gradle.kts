plugins {
    kotlin("jvm") version "1.8.0"
    application
    jacoco
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
