diff --git a/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/strategy/SftpChangedExclusiveReadLockStrategy.java b/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/strategy/SftpChangedExclusiveReadLockStrategy.java
index 8f2dc8f..31bb0ce 100644
--- a/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/strategy/SftpChangedExclusiveReadLockStrategy.java
+++ b/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/strategy/SftpChangedExclusiveReadLockStrategy.java
@@ -64,7 +64,7 @@
                 List<ChannelSftp.LsEntry> files = operations.listFiles(file.getParent());
                 for (ChannelSftp.LsEntry f : files) {
                     if (f.getFilename().equals(file.getFileName())) {
-                        newLastModified = f.getAttrs().getATime();
+                        newLastModified = f.getAttrs().getMTime();
                         newLength = f.getAttrs().getSize();
                     }
                 }
