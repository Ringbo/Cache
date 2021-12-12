diff --git a/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/strategy/FtpChangedExclusiveReadLockStrategy.java b/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/strategy/FtpChangedExclusiveReadLockStrategy.java
index a5d16ea..38c7df1 100644
--- a/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/strategy/FtpChangedExclusiveReadLockStrategy.java
+++ b/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/strategy/FtpChangedExclusiveReadLockStrategy.java
@@ -75,7 +75,7 @@
             }
             LOG.trace("List files {} found {} files", file.getAbsoluteFilePath(), files.size());
             for (FTPFile f : files) {
-                if (f.getName().equals(file.getFileName())) {
+                if (f.getName().equals(file.getFileNameOnly())) {
                     newLastModified = f.getTimestamp().getTimeInMillis();
                     newLength = f.getSize();
                 }
