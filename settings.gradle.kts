plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "api"

include("api-core")
include("api-domain")
include("api-web")
