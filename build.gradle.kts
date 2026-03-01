plugins {
    kotlin("jvm") version "2.3.0"
}

group = "r54-nsk.ru"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jsoup:jsoup:1.22.1")

}

kotlin {
    jvmToolchain(25)
}

tasks.test {
    useJUnitPlatform()
}