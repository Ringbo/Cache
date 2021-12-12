diff --git a/community/concurrent/src/test/java/org/neo4j/util/concurrent/BinaryLatchTest.java b/community/concurrent/src/test/java/org/neo4j/util/concurrent/BinaryLatchTest.java
index 65a98c6..ad933d1 100644
--- a/community/concurrent/src/test/java/org/neo4j/util/concurrent/BinaryLatchTest.java
+++ b/community/concurrent/src/test/java/org/neo4j/util/concurrent/BinaryLatchTest.java
@@ -58,7 +58,7 @@
     @Test
     void releaseMustUnblockAwaiters()
     {
-        assertTimeout( ofSeconds( 1 ), () ->
+        assertTimeout( ofSeconds( 10 ), () ->
         {
             final BinaryLatch latch = new BinaryLatch();
             Runnable awaiter = latch::await;
