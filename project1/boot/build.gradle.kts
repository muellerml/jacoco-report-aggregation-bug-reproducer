plugins {
    kotlin("jvm") version "1.8.0"
    jacoco
}

dependencies {
    implementation("org.example.driver.project2:dependency:1.0-SNAPSHOT")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
