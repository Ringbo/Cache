diff --git a/subprojects/core/src/main/groovy/org/gradle/api/internal/file/AbstractFileResolver.java b/subprojects/core/src/main/groovy/org/gradle/api/internal/file/AbstractFileResolver.java
index 781b58d..5eb72fb 100644
--- a/subprojects/core/src/main/groovy/org/gradle/api/internal/file/AbstractFileResolver.java
+++ b/subprojects/core/src/main/groovy/org/gradle/api/internal/file/AbstractFileResolver.java
@@ -62,7 +62,7 @@
         try {
             assert file.isAbsolute() : String.format("Cannot normalize a relative file: '%s'", file);
 
-            if (FileSystems.getDefault().canResolveSymbolicLink()) {
+            if (!FileSystems.getDefault().canResolveSymbolicLink()) {
                 return file.getCanonicalFile();
             }
 
