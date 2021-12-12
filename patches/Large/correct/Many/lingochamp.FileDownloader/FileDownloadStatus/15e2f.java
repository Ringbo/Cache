diff --git a/library/src/main/java/com/liulishuo/filedownloader/model/FileDownloadStatus.java b/library/src/main/java/com/liulishuo/filedownloader/model/FileDownloadStatus.java
index a45f8c9..2bd319f 100644
--- a/library/src/main/java/com/liulishuo/filedownloader/model/FileDownloadStatus.java
+++ b/library/src/main/java/com/liulishuo/filedownloader/model/FileDownloadStatus.java
@@ -43,6 +43,6 @@
     }
 
     public static boolean isIng(final int status) {
-        return status >= pending && status <= retry;
+        return status >= pending && status <= started;
     }
 }
