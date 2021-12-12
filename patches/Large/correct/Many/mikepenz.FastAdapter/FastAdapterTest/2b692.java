diff --git a/library/src/test/java/com/mikepenz/fastadapter/FastAdapterTest.java b/library/src/test/java/com/mikepenz/fastadapter/FastAdapterTest.java
index 54c55ce..47d933b 100644
--- a/library/src/test/java/com/mikepenz/fastadapter/FastAdapterTest.java
+++ b/library/src/test/java/com/mikepenz/fastadapter/FastAdapterTest.java
@@ -195,7 +195,7 @@
 
     @Test
     public void testAddPreviouslyFilledAdapterPropagatesPossibleTypesToParentFastAdapter() {
-        final TestItem testItem = new TestItem();
+        final TestItem testItem = new TestItem("example name");
         itemAdapter.add(testItem);
         adapter = new FastAdapter<>();
         adapter.addAdapter(0, itemAdapter);
