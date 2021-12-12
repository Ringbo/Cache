diff --git a/subprojects/test-kit/src/main/java/org/gradle/testkit/runner/internal/PluginUnderTestMetadataReading.java b/subprojects/test-kit/src/main/java/org/gradle/testkit/runner/internal/PluginUnderTestMetadataReading.java
index 6dc19ab..3d0cdae 100644
--- a/subprojects/test-kit/src/main/java/org/gradle/testkit/runner/internal/PluginUnderTestMetadataReading.java
+++ b/subprojects/test-kit/src/main/java/org/gradle/testkit/runner/internal/PluginUnderTestMetadataReading.java
@@ -48,7 +48,7 @@
     }
 
     public static List<File> readImplementationClasspath(URL pluginClasspathUrl) {
-        return readImplementationClasspath(pluginClasspathUrl.getFile(), GUtil.loadProperties(pluginClasspathUrl));
+        return readImplementationClasspath(pluginClasspathUrl.toString(), GUtil.loadProperties(pluginClasspathUrl));
     }
 
     public static List<File> readImplementationClasspath(String description, Properties properties) {
