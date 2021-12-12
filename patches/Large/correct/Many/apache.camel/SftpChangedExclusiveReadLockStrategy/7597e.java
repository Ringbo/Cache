diff --git a/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/strategy/SftpChangedExclusiveReadLockStrategy.java b/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/strategy/SftpChangedExclusiveReadLockStrategy.java
index 7ac91c1..1efe642 100644
--- a/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/strategy/SftpChangedExclusiveReadLockStrategy.java
+++ b/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/strategy/SftpChangedExclusiveReadLockStrategy.java
@@ -90,7 +90,7 @@
                     match = f.getFilename().equals(file.getFileNameOnly());
                 }
                 if (match) {
-                    newLastModified = f.getAttrs().getMTime() * 1000;
+                    newLastModified = f.getAttrs().getMTime() * 1000L;
                     newLength = f.getAttrs().getSize();
                 }
             }
