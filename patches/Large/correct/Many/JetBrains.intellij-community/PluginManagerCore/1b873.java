diff --git a/platform/core-impl/src/com/intellij/ide/plugins/PluginManagerCore.java b/platform/core-impl/src/com/intellij/ide/plugins/PluginManagerCore.java
index 803fb49..101dc09 100644
--- a/platform/core-impl/src/com/intellij/ide/plugins/PluginManagerCore.java
+++ b/platform/core-impl/src/com/intellij/ide/plugins/PluginManagerCore.java
@@ -94,7 +94,7 @@
       if (ourBuildNumber == null) {
         ourBuildNumber = BUILD_NUMBER == null ? null : BuildNumber.fromString(BUILD_NUMBER);
         if (ourBuildNumber == null) {
-          ourBuildNumber = BuildNumber.fallback();
+          ourBuildNumber = BuildNumber.fromString("SNAPSHOT");
         }
       }
       return ourBuildNumber;
