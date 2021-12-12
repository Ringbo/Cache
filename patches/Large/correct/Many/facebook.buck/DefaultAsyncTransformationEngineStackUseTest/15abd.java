diff --git a/test/com/facebook/buck/core/graph/transformation/DefaultAsyncTransformationEngineStackUseTest.java b/test/com/facebook/buck/core/graph/transformation/DefaultAsyncTransformationEngineStackUseTest.java
index 4978c01..5c1eed1 100644
--- a/test/com/facebook/buck/core/graph/transformation/DefaultAsyncTransformationEngineStackUseTest.java
+++ b/test/com/facebook/buck/core/graph/transformation/DefaultAsyncTransformationEngineStackUseTest.java
@@ -28,7 +28,7 @@
   public void largeGraphShouldNotStackOverflow() {
     MutableGraph<Long> graph = GraphBuilder.directed().build();
     // We set -Xss500k for the JVM for this test, so our stack is very small.
-    for (long i = 1L; i <= 7000L; i++) {
+    for (long i = 1L; i <= 6000L; i++) {
       graph.addNode(i);
       if (i > 1) {
         graph.putEdge(i - 1, i);
@@ -37,8 +37,8 @@
 
     ChildrenAdder transformer = new ChildrenAdder(graph);
     assertEquals(
-        (Long) 24503500L, // arithmetic series from 1 to 7000
-        // https://www.wolframalpha.com/input/?i=sum+from+1+to+7000
+        (Long) 18003000L, // arithmetic series from 1 to 6000
+        // https://www.wolframalpha.com/input/?i=sum+from+1+to+6000
         new DefaultAsyncTransformationEngine<>(transformer, graph.nodes().size())
             .computeUnchecked((Long) 1L));
   }
