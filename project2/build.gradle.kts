plugins {
    kotlin("jvm") version "1.8.0"
}

group = "org.example.driver.project2"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }
}


dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}
