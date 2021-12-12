diff --git a/subprojects/platform-base/src/main/java/org/gradle/platform/base/internal/DefaultBinaryNamingScheme.java b/subprojects/platform-base/src/main/java/org/gradle/platform/base/internal/DefaultBinaryNamingScheme.java
index 2f31cd6..89ea0c6 100644
--- a/subprojects/platform-base/src/main/java/org/gradle/platform/base/internal/DefaultBinaryNamingScheme.java
+++ b/subprojects/platform-base/src/main/java/org/gradle/platform/base/internal/DefaultBinaryNamingScheme.java
@@ -155,7 +155,7 @@
     }
 
     public String getTaskName(@Nullable String verb, @Nullable String target) {
-        return makeName(verb, dimensionPrefix, parentName, binaryType, target);
+        return makeName(verb, parentName, dimensionPrefix, binaryType, target);
     }
 
     public String makeName(String... words) {
