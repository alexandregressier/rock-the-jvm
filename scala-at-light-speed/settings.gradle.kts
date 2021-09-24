plugins {
    id("de.fayard.refreshVersions") version "0.21.0"
}

refreshVersions {
    rejectVersionIf {
        candidate.stabilityLevel.isLessStableThan(current.stabilityLevel)
    }
}

rootProject.name = "scala-at-light-speed"