diff --git a/dbsync/src/main/java/com/taobao/tddl/dbsync/binlog/event/RowsLogBuffer.java b/dbsync/src/main/java/com/taobao/tddl/dbsync/binlog/event/RowsLogBuffer.java
index c1b96c3..9fe2282 100644
--- a/dbsync/src/main/java/com/taobao/tddl/dbsync/binlog/event/RowsLogBuffer.java
+++ b/dbsync/src/main/java/com/taobao/tddl/dbsync/binlog/event/RowsLogBuffer.java
@@ -859,7 +859,7 @@
                     // 转化为unsign long
                     switch (len) {
                         case 1:
-                            value = buffer.getInt8();
+                            value = buffer.getUint8();
                             break;
                         case 2:
                             value = buffer.getUint16();
