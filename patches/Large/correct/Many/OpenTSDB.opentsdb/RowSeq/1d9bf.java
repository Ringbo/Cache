diff --git a/src/core/RowSeq.java b/src/core/RowSeq.java
index 2e22170..6d37921 100644
--- a/src/core/RowSeq.java
+++ b/src/core/RowSeq.java
@@ -139,8 +139,8 @@
       qualifiers[index] = qualifier;
       values[index] = extractLValue(qualifier, kv);
       if (index > 0 && timestamp(index - 1) >= timestamp(index)) {
-        LOG.error("new timestamp = " + timestamp(index)
-                  + " is < previous=" + timestamp(index -1)
+        LOG.error("new timestamp = " + timestamp(index) + " (index=" + index
+                  + ") is < previous=" + timestamp(index - 1)
                   + " in addRow with kv=" + kv + " in row=" + row);
         // Undo what we've done so far.
         qualifiers = old_qualifiers;
@@ -160,7 +160,7 @@
    * different {@link RowSeq} instances.
    */
   static boolean canTimeDeltaFit(final long time_delta) {
-    return time_delta <= 1 << (Short.SIZE - Const.FLAG_BITS);
+    return time_delta < 1 << (Short.SIZE - Const.FLAG_BITS);
   }
 
   /**
