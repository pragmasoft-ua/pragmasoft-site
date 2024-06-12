# Pragmasoft site

## Build

`mvnw package`

## Run locally

You need JRE v11+ and Tomcat V9

(Tested successfully also on JRE8 and JRE17)

If using VS Code, you can use Community Server Connectors VSCode plugin to download, install run Tomcat and deploy this application as packaged WAR deployment

Without VSCode, simply copy target/pragmasoftSite.war to the running Tomcat's /webapps directory

## Docker build using buildpacks

Install [pack](https://buildpacks.io/docs/for-platform-operators/how-to/integrate-ci/pack/) cli for your platform, for example using Chocolatey on Windows

`pack build pragmasoft-site --builder paketobuildpacks/builder-jammy-base`

Run in docker with

`docker run --rm -p 8080:8080 -e PORT=8080 pragmasoft-site`

### Build for arm64 architecture (RPi)

`pack build pragmasoft-site --builder dashaun/builder:base  --platform linux/arm64`
