plugins {
    `java-library`
}

applyPlatformAndCoreConfiguration()

dependencies {
    api(project(":BanManagerWebEnhancerLibs"))

    api("me.confuser.banmanager:BanManagerCommon:7.10.0-SNAPSHOT")
    api("me.confuser.banmanager.BanManagerLibs:BanManagerLibs:7.10.0-SNAPSHOT")
}

tasks.withType<Test>().configureEach {
    useJUnit()
}
