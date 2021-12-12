diff --git a/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/SftpOperations.java b/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/SftpOperations.java
index daf64ea..110e398 100644
--- a/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/SftpOperations.java
+++ b/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/SftpOperations.java
@@ -383,8 +383,9 @@
             return;
         }
 
-        // must compact path so FTP server can traverse correctly
-        path = FileUtil.compactPath(path);
+        // must compact path so SFTP server can traverse correctly, make use of the '/'
+        // separator because JSch expects this as the file separator even on Windows
+        path = FileUtil.compactPath(path, '/');
 
         // not stepwise should change directory in one operation
         if (!endpoint.getConfiguration().isStepwise()) {
