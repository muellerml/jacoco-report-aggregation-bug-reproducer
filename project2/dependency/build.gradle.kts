plugins {
    kotlin("jvm") version "1.8.0"
    jacoco
    java
}

group = "org.example.driver.project2"

tasks.test {
    useJUnitPlatform()
}
dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation(kotlin("test"))
}
repositories {
    mavenCentral()
}
kotlin {
    jvmToolchain(8)
}
