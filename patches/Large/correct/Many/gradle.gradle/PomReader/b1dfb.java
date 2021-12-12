diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/parser/PomReader.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/parser/PomReader.java
index a2d3e98..597b306 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/parser/PomReader.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/parser/PomReader.java
@@ -273,7 +273,7 @@
     private void checkNotNull(String value, String name, String element) {
         if (value == null) {
             String attributeName = element == null ? name : element + " " + name;
-            throw new IllegalArgumentException("Missing required attribute: " + attributeName);
+            throw new RuntimeException("Missing required attribute: " + attributeName);
         }
     }
 
