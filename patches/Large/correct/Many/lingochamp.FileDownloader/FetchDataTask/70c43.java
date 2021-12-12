diff --git a/library/src/main/java/com/liulishuo/filedownloader/download/FetchDataTask.java b/library/src/main/java/com/liulishuo/filedownloader/download/FetchDataTask.java
index a909295..a9de4a1 100644
--- a/library/src/main/java/com/liulishuo/filedownloader/download/FetchDataTask.java
+++ b/library/src/main/java/com/liulishuo/filedownloader/download/FetchDataTask.java
@@ -197,7 +197,7 @@
 
 
             lastSyncBytes = currentOffset;
-            lastSyncTimestamp = currentOffset;
+            lastSyncTimestamp = now;
         }
     }
 
