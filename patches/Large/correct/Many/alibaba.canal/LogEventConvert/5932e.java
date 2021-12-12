diff --git a/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/dbsync/LogEventConvert.java b/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/dbsync/LogEventConvert.java
index 37ea0d0..e066dd9 100644
--- a/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/dbsync/LogEventConvert.java
+++ b/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/dbsync/LogEventConvert.java
@@ -350,7 +350,7 @@
             rowChangeBuider.setEventType(eventType);
             RowsLogBuffer buffer = event.getRowsBuf(charset.name());
             BitSet columns = event.getColumns();
-            BitSet changeColumns = event.getColumns();
+            BitSet changeColumns = event.getChangeColumns();
             boolean tableError = false;
             TableMeta tableMeta = null;
             if (tableMetaCache != null) {// 入错存在table meta cache
@@ -380,7 +380,7 @@
                         break;
                     }
 
-                    tableError |= parseOneRow(rowDataBuilder, event, buffer, event.getChangeColumns(), true, tableMeta);
+                    tableError |= parseOneRow(rowDataBuilder, event, buffer, changeColumns, true, tableMeta);
                 }
 
                 rowChangeBuider.addRowDatas(rowDataBuilder.build());
