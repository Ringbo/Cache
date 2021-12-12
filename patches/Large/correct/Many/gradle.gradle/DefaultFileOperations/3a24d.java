diff --git a/subprojects/core/src/main/groovy/org/gradle/api/internal/file/DefaultFileOperations.java b/subprojects/core/src/main/groovy/org/gradle/api/internal/file/DefaultFileOperations.java
index edcbe95..94b5f8a 100755
--- a/subprojects/core/src/main/groovy/org/gradle/api/internal/file/DefaultFileOperations.java
+++ b/subprojects/core/src/main/groovy/org/gradle/api/internal/file/DefaultFileOperations.java
@@ -103,9 +103,9 @@
             resource = (ReadableResource) tarPath;
         } else {
             tarFile = file(tarPath);
-            resource = new FileResource(tarFile);
+            resource = new MaybeCompressedFileResource(new FileResource(tarFile));
         }
-        TarFileTree tarTree = new TarFileTree(tarFile, new MaybeCompressedFileResource(resource), getExpandDir(), fileSystem);
+        TarFileTree tarTree = new TarFileTree(tarFile, resource, getExpandDir(), fileSystem);
         return new FileTreeAdapter(tarTree);
     }
 
