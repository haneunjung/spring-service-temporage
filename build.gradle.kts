plugins {
    kotlin("jvm") version "1.5.31"
}

allprojects {
    group = "com.parkju"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}