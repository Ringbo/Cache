diff --git a/dbsync/src/main/java/com/taobao/tddl/dbsync/binlog/event/RowsLogBuffer.java b/dbsync/src/main/java/com/taobao/tddl/dbsync/binlog/event/RowsLogBuffer.java
index 9fe2282..8cd5733 100644
--- a/dbsync/src/main/java/com/taobao/tddl/dbsync/binlog/event/RowsLogBuffer.java
+++ b/dbsync/src/main/java/com/taobao/tddl/dbsync/binlog/event/RowsLogBuffer.java
@@ -367,7 +367,7 @@
                     // 转化为unsign long
                     switch (len) {
                         case 1:
-                            value = buffer.getInt8();
+                            value = buffer.getUint8();
                             break;
                         case 2:
                             value = buffer.getBeUint16();
