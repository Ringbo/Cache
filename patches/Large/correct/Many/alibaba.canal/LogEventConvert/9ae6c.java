diff --git a/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/dbsync/LogEventConvert.java b/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/dbsync/LogEventConvert.java
index 67332cf..b299165 100644
--- a/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/dbsync/LogEventConvert.java
+++ b/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/dbsync/LogEventConvert.java
@@ -267,7 +267,8 @@
 
             Header header = createHeader(binlogFileName, event.getHeader(), schemaName, tableName, type);
             RowChange.Builder rowChangeBuider = RowChange.newBuilder();
-            if (type != EventType.QUERY) {
+            if (type != EventType.QUERY && type != EventType.INSERT && type != EventType.UPDATE
+                && type != EventType.DELETE) {
                 rowChangeBuider.setIsDdl(true);
             }
             rowChangeBuider.setSql(queryString);
