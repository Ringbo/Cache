diff --git a/h2/src/main/org/h2/command/dml/Select.java b/h2/src/main/org/h2/command/dml/Select.java
index 8f5c449..4fbfb1b 100644
--- a/h2/src/main/org/h2/command/dml/Select.java
+++ b/h2/src/main/org/h2/command/dml/Select.java
@@ -193,12 +193,12 @@
      */
     public void setCurrentGroupExprData(Expression expr, Object obj) {
         if (cachedLookup == expr) {
-            assert currentGroupByExprData[cachedLookupIndex] != null;
+            assert currentGroupByExprData[cachedLookupIndex] == null;
             currentGroupByExprData[cachedLookupIndex] = obj;
         }
         Integer index = exprToIndexInGroupByData.get(expr);
         if (index != null) {
-            assert currentGroupByExprData[index] != null;
+            assert currentGroupByExprData[index] == null;
             currentGroupByExprData[index] = obj;
             return;
         }
