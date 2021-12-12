diff --git a/library/src/main/java/com/liulishuo/filedownloader/services/DefaultDatabaseImpl.java b/library/src/main/java/com/liulishuo/filedownloader/services/DefaultDatabaseImpl.java
index f67d409..27bb737 100644
--- a/library/src/main/java/com/liulishuo/filedownloader/services/DefaultDatabaseImpl.java
+++ b/library/src/main/java/com/liulishuo/filedownloader/services/DefaultDatabaseImpl.java
@@ -154,7 +154,7 @@
         downloaderModelMap.clear();
 
         db.delete(TABLE_NAME, null, null);
-        db.delete(TABLE_NAME, null, null);
+        db.delete(CONNECTION_TABLE_NAME, null, null);
     }
 
     @Override
