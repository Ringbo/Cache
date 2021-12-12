diff --git a/subprojects/core-api/src/main/java/org/gradle/internal/deprecation/LoggingDeprecatable.java b/subprojects/core-api/src/main/java/org/gradle/internal/deprecation/LoggingDeprecatable.java
index 2445ad0..8483d36 100644
--- a/subprojects/core-api/src/main/java/org/gradle/internal/deprecation/LoggingDeprecatable.java
+++ b/subprojects/core-api/src/main/java/org/gradle/internal/deprecation/LoggingDeprecatable.java
@@ -40,7 +40,7 @@
     public void checkDeprecation() {
         String suffix = LoggingDeprecatedFeatureHandler.getRemovalDetails();
         for (String deprecation : deprecations) {
-            DeprecationLogger.nagUserWithDeprecatedBuildInvocationFeature(deprecation, String.format("This %s", suffix));
+            DeprecationLogger.nagUserWithDeprecatedBuildInvocationFeature(deprecation, String.format("This %s", suffix), null);
         }
     }
 
