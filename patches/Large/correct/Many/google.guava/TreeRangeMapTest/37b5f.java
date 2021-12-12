diff --git a/guava-tests/test/com/google/common/collect/TreeRangeMapTest.java b/guava-tests/test/com/google/common/collect/TreeRangeMapTest.java
index d1b77ab..a1fb21f 100644
--- a/guava-tests/test/com/google/common/collect/TreeRangeMapTest.java
+++ b/guava-tests/test/com/google/common/collect/TreeRangeMapTest.java
@@ -573,7 +573,7 @@
     }
   }
 
-  private void putModel(Map<Integer, Integer> model, Range<Integer> range, int value) {
+  private static void putModel(Map<Integer, Integer> model, Range<Integer> range, int value) {
     for (int i = MIN_BOUND - 1; i <= MAX_BOUND + 1; i++) {
       if (range.contains(i)) {
         model.put(i, value);
@@ -581,7 +581,7 @@
     }
   }
 
-  private void removeModel(Map<Integer, Integer> model, Range<Integer> range) {
+  private static void removeModel(Map<Integer, Integer> model, Range<Integer> range) {
     for (int i = MIN_BOUND - 1; i <= MAX_BOUND + 1; i++) {
       if (range.contains(i)) {
         model.remove(i);
