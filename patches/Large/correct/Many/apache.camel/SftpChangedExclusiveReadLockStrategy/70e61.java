diff --git a/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/strategy/SftpChangedExclusiveReadLockStrategy.java b/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/strategy/SftpChangedExclusiveReadLockStrategy.java
index b98efa3..c7ba94f 100644
--- a/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/strategy/SftpChangedExclusiveReadLockStrategy.java
+++ b/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/strategy/SftpChangedExclusiveReadLockStrategy.java
@@ -75,7 +75,7 @@
             }
             LOG.trace("List files {} found {} files", file.getAbsoluteFilePath(), files.size());
             for (ChannelSftp.LsEntry f : files) {
-                if (f.getFilename().equals(file.getFileName())) {
+                if (f.getFilename().equals(file.getFileNameOnly())) {
                     newLastModified = f.getAttrs().getMTime();
                     newLength = f.getAttrs().getSize();
                 }
