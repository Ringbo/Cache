diff --git a/presto-raptor/src/main/java/com/facebook/presto/raptor/storage/FileStorageService.java b/presto-raptor/src/main/java/com/facebook/presto/raptor/storage/FileStorageService.java
index 71efe1b..bb963b5 100644
--- a/presto-raptor/src/main/java/com/facebook/presto/raptor/storage/FileStorageService.java
+++ b/presto-raptor/src/main/java/com/facebook/presto/raptor/storage/FileStorageService.java
@@ -119,8 +119,8 @@
             throw new IOException("Failed to list directory: " + dir);
         }
         for (File file : files) {
-            Files.delete(file.toPath());
+            Files.deleteIfExists(file.toPath());
         }
-        Files.delete(dir.toPath());
+        Files.deleteIfExists(dir.toPath());
     }
 }
