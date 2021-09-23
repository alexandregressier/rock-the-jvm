plugins {
    scala
    application
}

group = "dev.gressier"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:_")
}

application {
    mainClass.set("dev.gressier.app")
}

tasks.wrapper {
    gradleVersion = "${project.extra["version.gradle"]}"
}