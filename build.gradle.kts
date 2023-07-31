plugins {
    kotlin("jvm") version "1.8.0"
    id("net.serenity-bdd.serenity-gradle-plugin") version "3.6.7"
}

buildscript{
    repositories{
        mavenLocal()
        gradlePluginPortal()
    }
    dependencies{
        classpath("net.serenity-bdd:serenity-gradle-plugin:3.6.7")
    }
}


// apply(plugin = "net.serenity-bdd.aggregator")
apply(plugin = "net.serenity-bdd.serenity-gradle-plugin")


group = "com.sophossolutions"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))


    testImplementation("net.serenity-bdd:serenity-cucumber:3.9.0")
    implementation("net.serenity-bdd:serenity-core:3.9.0")
    implementation("net.serenity-bdd:serenity-screenplay:3.9.0")
    implementation("net.serenity-bdd:serenity-junit:3.9.0")
    implementation("net.serenity-bdd:serenity-screenplay-webdriver:3.9.0")
    implementation("net.serenity-bdd:serenity-junit:3.9.0")
    //implementation("net.serenity-bdd:serenity-gradle-plugin:2.4.34")
    implementation("net.serenity-bdd:serenity-reports:3.9.0")



    implementation("org.slf4j:slf4j-api:2.0.7")
    testImplementation("org.slf4j:slf4j-simple:2.0.7")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    //testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.4.2")

}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

tasks.test {
    systemProperty("cucumber.options", System.getProperty("cucumber.options"))
}

