diff --git a/hazelcast/src/test/java/com/hazelcast/impl/ClusterTest.java b/hazelcast/src/test/java/com/hazelcast/impl/ClusterTest.java
index bfda127..1351da0 100644
--- a/hazelcast/src/test/java/com/hazelcast/impl/ClusterTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/impl/ClusterTest.java
@@ -1394,7 +1394,7 @@
         latch.await();
         es.shutdown();
         assertTrue(es.awaitTermination(5, TimeUnit.SECONDS));
-        for (int i = 0; i < 50; i++) {
+        for (int i = 0; i < 100; i++) {
             sleep(1000);
             Runtime.getRuntime().gc();
             long usedMemoryEnd = getUsedMemoryAsMB();
@@ -1446,7 +1446,7 @@
         latch.await();
         es.shutdown();
         assertTrue(es.awaitTermination(5, TimeUnit.SECONDS));
-        for (int i = 0; i < 50; i++) {
+        for (int i = 0; i < 100; i++) {
             sleep(1000);
             Runtime.getRuntime().gc();
             long usedMemoryEnd = getUsedMemoryAsMB();
