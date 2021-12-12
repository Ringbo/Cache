diff --git a/subprojects/core/src/main/groovy/org/gradle/plugin/resolve/internal/TomcatPluginMapper.java b/subprojects/core/src/main/groovy/org/gradle/plugin/resolve/internal/TomcatPluginMapper.java
index dbb1541..446e6a0 100644
--- a/subprojects/core/src/main/groovy/org/gradle/plugin/resolve/internal/TomcatPluginMapper.java
+++ b/subprojects/core/src/main/groovy/org/gradle/plugin/resolve/internal/TomcatPluginMapper.java
@@ -23,7 +23,7 @@
     public Dependency map(PluginRequest request, DependencyHandler dependencyHandler) {
         if (request.getId().equals("tomcat")) {
             if (request.getVersion() == null) {
-                throw new InvalidPluginRequest("A version must be specified for the tomcat plugin");
+                throw new InvalidPluginRequestException("A version must be specified for the tomcat plugin");
             }
             String version = request.getVersion();
             return dependencyHandler.create("org.gradle.api.plugins:gradle-tomcat-plugin:" + version);
