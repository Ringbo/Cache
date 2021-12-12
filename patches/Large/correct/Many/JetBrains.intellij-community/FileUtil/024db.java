diff --git a/platform/util/src/com/intellij/openapi/util/io/FileUtil.java b/platform/util/src/com/intellij/openapi/util/io/FileUtil.java
index f90fac6..580f244 100644
--- a/platform/util/src/com/intellij/openapi/util/io/FileUtil.java
+++ b/platform/util/src/com/intellij/openapi/util/io/FileUtil.java
@@ -662,7 +662,7 @@
 
     for (int i = start; i < path.length(); ++i) {
       final char c = path.charAt(i);
-      if (c == separatorChar) {
+      if (c == separatorChar || c == '/') {
         if (!separator) {
           if (dots == 1) {
           }
