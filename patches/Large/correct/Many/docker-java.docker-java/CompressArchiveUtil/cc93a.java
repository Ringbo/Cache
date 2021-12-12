diff --git a/src/main/java/com/github/dockerjava/core/util/CompressArchiveUtil.java b/src/main/java/com/github/dockerjava/core/util/CompressArchiveUtil.java
index a461651..2e75bcc 100644
--- a/src/main/java/com/github/dockerjava/core/util/CompressArchiveUtil.java
+++ b/src/main/java/com/github/dockerjava/core/util/CompressArchiveUtil.java
@@ -68,7 +68,7 @@
         try (TarArchiveOutputStream tarArchiveOutputStream = buildTarStream(outputPath, gZipped)) {
             if (!Files.isDirectory(inputPath)) {
                 TarArchiveEntry tarEntry = new TarArchiveEntry(inputPath.getFileName().toString());
-                if (filePath.toFile().canExecute()) {
+                if (inputPath.toFile().canExecute()) {
                     tarEntry.setMode(tarEntry.getMode() | 0755);
                 }
                 putTarEntry(tarArchiveOutputStream, tarEntry, inputPath);
