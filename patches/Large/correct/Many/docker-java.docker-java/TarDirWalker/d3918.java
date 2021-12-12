diff --git a/src/main/java/com/github/dockerjava/core/util/TarDirWalker.java b/src/main/java/com/github/dockerjava/core/util/TarDirWalker.java
index 3c5336a..bbe834e 100644
--- a/src/main/java/com/github/dockerjava/core/util/TarDirWalker.java
+++ b/src/main/java/com/github/dockerjava/core/util/TarDirWalker.java
@@ -34,7 +34,7 @@
     @Override
     public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
         TarArchiveEntry tarEntry = new TarArchiveEntry(FilePathUtil.relativize(basePath, file));
-        if (filePath.toFile().canExecute()) {
+        if (file.toFile().canExecute()) {
                 tarEntry.setMode(tarEntry.getMode() | 0755);
         }
         CompressArchiveUtil.putTarEntry(tarArchiveOutputStream, tarEntry, file);
