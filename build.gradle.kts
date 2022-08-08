plugins {
	id("java")
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	id("org.springframework.boot") version "2.7.1"
	id("com.adarshr.test-logger") version "1.6.0"
	id("com.diffplug.spotless") version "6.8.0"
}

group = "r.com.rbarbiero"
version = "0.0.1-SNAPSHOT"

repositories {
	mavenCentral()
}

spotless {

	java {
		googleJavaFormat("1.15.0").reflowLongStrings()
		trimTrailingWhitespace()
		endWithNewline()
	}
}

testlogger {
	setTheme("mocha")
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test>{
	useJUnitPlatform()
}
