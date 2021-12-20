/*
 * Copyright (c) 2020, Dropbox, Inc. All rights reserved.
 */
plugins {
    kotlin("jvm") version "1.6.0"
    `java-gradle-plugin`
}

repositories {
    google()
    jcenter()
    mavenLocal()
}

dependencies {
    api("com.dropbox.affectedmoduledetector:affectedmoduledetector:0.1.3-SNAPSHOT")
    testImplementation("junit:junit:4.13.1")
    testImplementation("com.nhaarman:mockito-kotlin:1.5.0")
    testImplementation("com.google.truth:truth:1.0.1")
}