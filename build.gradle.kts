plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

// 👇 Agregamos esto para que Gradle reconozca las carpetas correctamente
sourceSets {
    named("main") {
        java.srcDir("src/main/java")
        resources.srcDir("src/main/resources")
    }
    named("test") {
        java.srcDir("src/test/java")
        resources.srcDir("src/test/resources")
    }
}
