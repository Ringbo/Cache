diff --git a/dbsync/src/test/java/com/taobao/tddl/dbsync/binlog/BaseLogFetcherTest.java b/dbsync/src/test/java/com/taobao/tddl/dbsync/binlog/BaseLogFetcherTest.java
index d0c6746..27ecf3d 100644
--- a/dbsync/src/test/java/com/taobao/tddl/dbsync/binlog/BaseLogFetcherTest.java
+++ b/dbsync/src/test/java/com/taobao/tddl/dbsync/binlog/BaseLogFetcherTest.java
@@ -68,7 +68,7 @@
                     // update需要处理before/after
                     System.out.println("-------> before");
                     parseOneRow(event, buffer, columns, false);
-                    if (!buffer.nextOneRow(changeColumns)) {
+                    if (!buffer.nextOneRow(changeColumns, true)) {
                         break;
                     }
                     System.out.println("-------> after");
@@ -97,7 +97,7 @@
             }
 
             ColumnInfo info = columnInfo[i];
-            buffer.nextValue(info.type, info.meta);
+            buffer.nextValue(null , i ,info.type, info.meta);
 
             if (buffer.isNull()) {
                 //
