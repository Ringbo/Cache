diff --git a/h2/src/main/org/h2/command/dml/Select.java b/h2/src/main/org/h2/command/dml/Select.java
index ea0dca8..a09eaa9 100644
--- a/h2/src/main/org/h2/command/dml/Select.java
+++ b/h2/src/main/org/h2/command/dml/Select.java
@@ -639,7 +639,7 @@
 
     private LazyResult queryFlat(int columnCount, ResultTarget result, long offset, long limitRows, boolean withTies,
             boolean quickOffset) {
-        if (limitRows > 0 && offset > 0) {
+        if (limitRows > 0 && offset > 0 && !quickOffset) {
             limitRows += offset;
             if (limitRows < 0) {
                 // Overflow
@@ -654,7 +654,7 @@
         if (result == null) {
             return lazyResult;
         }
-        if (sort != null && !sortUsingIndex || limitRows <= 0 || withTies) {
+        if (sort != null && !sortUsingIndex || limitRows < 0 || withTies) {
             limitRows = Long.MAX_VALUE;
         }
         while (result.getRowCount() < limitRows && lazyResult.next()) {
@@ -726,6 +726,7 @@
                 !session.getDatabase().getSettings().optimizeInsertFromSelect)) {
             result = createLocalResult(result);
         }
+        // Do not add rows before OFFSET to result if possible
         boolean quickOffset = true;
         if (sort != null && (!sortUsingIndex || isAnyDistinct() || withTies)) {
             result = createLocalResult(result);
