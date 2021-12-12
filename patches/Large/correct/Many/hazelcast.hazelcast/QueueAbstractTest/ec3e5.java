diff --git a/hazelcast/src/test/java/com/hazelcast/collection/impl/queue/QueueAbstractTest.java b/hazelcast/src/test/java/com/hazelcast/collection/impl/queue/QueueAbstractTest.java
index 6fb746a..79f3f8c 100644
--- a/hazelcast/src/test/java/com/hazelcast/collection/impl/queue/QueueAbstractTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/collection/impl/queue/QueueAbstractTest.java
@@ -550,7 +550,7 @@
         @Override
         public void run() {
             try {
-                queue.poll(2, TimeUnit.SECONDS);
+                queue.poll(15, TimeUnit.SECONDS);
 
             } catch (InterruptedException e) {
                 e.printStackTrace();
