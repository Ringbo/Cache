diff --git a/src/be/ibridge/kettle/trans/step/sql/ExecSQL.java b/src/be/ibridge/kettle/trans/step/sql/ExecSQL.java
index 6c7001e..d681dfb 100644
--- a/src/be/ibridge/kettle/trans/step/sql/ExecSQL.java
+++ b/src/be/ibridge/kettle/trans/step/sql/ExecSQL.java
@@ -61,21 +61,21 @@
             row.addValue(rowsUpdated);
         }
 
-        if (upd!=null && upd.length()>0)
+        if (ins!=null && ins.length()>0)
         {
             Value rowsInserted = new Value(ins, result.getNrLinesOutput());
             rowsInserted.setLength(9);
             row.addValue(rowsInserted);
         }
 
-        if (upd!=null && upd.length()>0)
+        if (del!=null && del.length()>0)
         {
             Value rowsDeleted = new Value(del, result.getNrLinesDeleted());
             rowsDeleted.setLength(9);
             row.addValue(rowsDeleted);
         }
 
-        if (upd!=null && upd.length()>0)
+        if (read!=null && read.length()>0)
         {
             Value rowsRead = new Value(read, result.getNrLinesRead());
             rowsRead.setLength(9);
