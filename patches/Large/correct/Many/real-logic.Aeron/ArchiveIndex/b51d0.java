diff --git a/aeron-archiver/src/main/java/io/aeron/archiver/ArchiveIndex.java b/aeron-archiver/src/main/java/io/aeron/archiver/ArchiveIndex.java
index 217ffd0..9d4eb35 100644
--- a/aeron-archiver/src/main/java/io/aeron/archiver/ArchiveIndex.java
+++ b/aeron-archiver/src/main/java/io/aeron/archiver/ArchiveIndex.java
@@ -58,7 +58,7 @@
         try
         {
             final File indexFile = new File(archiveFolder, INDEX_FILE_NAME);
-            channel = FileChannel.open(indexFile.toPath(), CREATE, READ, WRITE, DSYNC);
+            channel = FileChannel.open(indexFile.toPath(), CREATE, READ, WRITE);
             final ArchiveDescriptorDecoder decoder = new ArchiveDescriptorDecoder();
 
             while (channel.read(byteBuffer) != -1)
