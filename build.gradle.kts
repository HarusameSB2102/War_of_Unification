plugins {
    kotlin("jvm") version "2.0.21"
}

group = "com.harusame2102"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.11-R0.1-SNAPSHOT")
    implementation(kotlin("stdlib"))
}

kotlin {
    jvmToolchain(21)
}

tasks.processResources {
    filesMatching("plugin.yml") {
        expand(project.properties)
    }
}