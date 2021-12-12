diff --git a/src/main/java/com/spotify/docker/BuildMojo.java b/src/main/java/com/spotify/docker/BuildMojo.java
index 9f537bc..bca7edf 100644
--- a/src/main/java/com/spotify/docker/BuildMojo.java
+++ b/src/main/java/com/spotify/docker/BuildMojo.java
@@ -565,7 +565,7 @@
         // ensure all directories exist because copy operation will fail if they don't
         Files.createDirectories(destPath.getParent());
         Files.copy(sourcePath, destPath, StandardCopyOption.REPLACE_EXISTING);
-        Files.setLastModifiedTime(destPath, FileTime.fromMillis(0));
+        Files.setLastModifiedTime(destPath, FileTime.fromMillis(1));
         // file location relative to docker directory, used later to generate Dockerfile
         final Path relativePath = Paths.get(targetPath, included);
         copiedPaths.add(relativePath.toString());
