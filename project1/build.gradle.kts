plugins {
    kotlin("jvm") version "1.8.0"
    id("jacoco-report-aggregation")
}

group = "org.example"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }
}

dependencies {
    subprojects.forEach {
        println(it)
        jacocoAggregation(project(it.path))
    }
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

