# Pragmasoft site

## Build

`mvnw package`

## Run locally

You need JRE v11+ and Tomcat V9

(Tested successfully also on JRE8 and JRE17)

If using VS Code, you can use Community Server Connectors VSCode plugin to download, install run Tomcat and deploy this application as packaged WAR deployment

Without VSCode, simply copy target/pragmasoftSite.war to the running Tomcat's /webapps directory
