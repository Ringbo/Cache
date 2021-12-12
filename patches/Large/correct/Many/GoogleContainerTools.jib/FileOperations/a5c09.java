diff --git a/jib-core/src/main/java/com/google/cloud/tools/jib/filesystem/FileOperations.java b/jib-core/src/main/java/com/google/cloud/tools/jib/filesystem/FileOperations.java
index 933bba0..2f93e55 100644
--- a/jib-core/src/main/java/com/google/cloud/tools/jib/filesystem/FileOperations.java
+++ b/jib-core/src/main/java/com/google/cloud/tools/jib/filesystem/FileOperations.java
@@ -38,7 +38,7 @@
             // Creates the same path in the destDir.
             Path destPath = destDir.resolve(sourceFile.getParent().relativize(path));
             if (Files.isDirectory(path)) {
-              Files.createDirectory(destPath);
+              Files.createDirectories(destPath);
             } else {
               Files.copy(path, destPath);
             }
