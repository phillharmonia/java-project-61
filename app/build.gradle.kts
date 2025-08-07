plugins {
    id("application")
    id("com.github.ben-manes.versions") version "0.51.0"
    checkstyle
    id("org.sonarqube") version "6.2.0.5505"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
tasks.withType<JavaCompile> {
    options.compilerArgs.add("--enable-preview")
}

tasks.withType<JavaExec> {
    jvmArgs("--enable-preview")
}

tasks.withType<Test> {
    jvmArgs("--enable-preview")
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
the<JavaApplication>().mainClass.set("hexlet.code.App")

checkstyle {
    toolVersion = "10.12.1" // например
    configFile = file("config/checkstyle/checkstyle.xml")
}
sonar {
    properties {
        property("sonar.projectKey", "phillharmonia_java-project-61")
        property("sonar.organization", "phillharmonia")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}