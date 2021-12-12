diff --git a/subprojects/core/src/main/groovy/org/gradle/api/internal/file/copy/LineFilter.java b/subprojects/core/src/main/groovy/org/gradle/api/internal/file/copy/LineFilter.java
index 7766e84..6ded04c 100644
--- a/subprojects/core/src/main/groovy/org/gradle/api/internal/file/copy/LineFilter.java
+++ b/subprojects/core/src/main/groovy/org/gradle/api/internal/file/copy/LineFilter.java
@@ -81,7 +81,7 @@
     @Override
     public int read() throws IOException {
         ensureData();
-        if (transformedLine == null) {
+        if (transformedLine == null || transformedLine.isEmpty()) {
             return -1;
         }
         return transformedLine.charAt(transformedIndex++);
