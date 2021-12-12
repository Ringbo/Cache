diff --git a/guava-tests/test/com/google/common/collect/MinMaxPriorityQueueTest.java b/guava-tests/test/com/google/common/collect/MinMaxPriorityQueueTest.java
index fa1ea97..9634d62 100644
--- a/guava-tests/test/com/google/common/collect/MinMaxPriorityQueueTest.java
+++ b/guava-tests/test/com/google/common/collect/MinMaxPriorityQueueTest.java
@@ -752,8 +752,8 @@
     return seed;
   }
 
-  private void insertRandomly(ArrayList<Integer> elements, MinMaxPriorityQueue<Integer> q,
-      Random random) {
+  private static void insertRandomly(
+      ArrayList<Integer> elements, MinMaxPriorityQueue<Integer> q, Random random) {
     while (!elements.isEmpty()) {
       int selectedIndex = random.nextInt(elements.size());
       q.offer(elements.remove(selectedIndex));
