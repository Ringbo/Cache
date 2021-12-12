diff --git a/plugins/gradle/src/org/jetbrains/plugins/gradle/config/GradleScriptType.java b/plugins/gradle/src/org/jetbrains/plugins/gradle/config/GradleScriptType.java
index 2b41961..ad65a83 100644
--- a/plugins/gradle/src/org/jetbrains/plugins/gradle/config/GradleScriptType.java
+++ b/plugins/gradle/src/org/jetbrains/plugins/gradle/config/GradleScriptType.java
@@ -84,7 +84,7 @@
 
   @Override
    public boolean isConfigurationByLocation(@NotNull GroovyScriptRunConfiguration existing, @NotNull Location location) {
-    final String params = existing.getProgramParameters();
+    final String params = existing.getScriptParameters();
     final String s = getTaskTarget(location);
     return s != null && params != null && (params.startsWith(s + " ") || params.equals(s));
   }
