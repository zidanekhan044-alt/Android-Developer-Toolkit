
plugins {
    kotlin("jvm") version "2.0.21"
}

group = "dev.tarshid"
version = "0.1.0"

kotlin {
    jvmToolchain(17)
}

dependencies {
    testImplementation(kotlin("test-junit5"))
    testRuntimeOnly(
        "org.junit.jupiter:junit-jupiter-engine:5.10.2"
    )
}

tasks.test {
    useJUnitPlatform()
}
