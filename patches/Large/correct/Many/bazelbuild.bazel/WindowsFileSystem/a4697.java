diff --git a/src/main/java/com/google/devtools/build/lib/windows/WindowsFileSystem.java b/src/main/java/com/google/devtools/build/lib/windows/WindowsFileSystem.java
index 77197d7..c3a9095 100644
--- a/src/main/java/com/google/devtools/build/lib/windows/WindowsFileSystem.java
+++ b/src/main/java/com/google/devtools/build/lib/windows/WindowsFileSystem.java
@@ -347,7 +347,8 @@
     try {
       java.nio.file.Path link = getIoFile(linkPath).toPath();
       java.nio.file.Path target = getIoFile(targetPath).toPath();
-      if (target.toFile().isDirectory()) {
+      // Still Create a dangling junction if the target doesn't exist.
+      if (!target.toFile().exists() || target.toFile().isDirectory()) {
         WindowsFileOperations.createJunction(link.toString(), target.toString());
       } else {
         Files.copy(target, link);
