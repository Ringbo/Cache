diff --git a/library/src/main/java/com/liulishuo/filedownloader/FileDownloader.java b/library/src/main/java/com/liulishuo/filedownloader/FileDownloader.java
index b5db19c..477d8ae 100644
--- a/library/src/main/java/com/liulishuo/filedownloader/FileDownloader.java
+++ b/library/src/main/java/com/liulishuo/filedownloader/FileDownloader.java
@@ -100,7 +100,7 @@
         if (context == null)
             throw new IllegalArgumentException("the provided context must not be null!");
 
-        init(context, null);
+        setup(context);
     }
 
 
