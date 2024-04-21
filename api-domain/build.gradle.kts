dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

    // mysql
    runtimeOnly("com.mysql:mysql-connector-j")
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}