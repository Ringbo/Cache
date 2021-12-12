diff --git a/activemq-core/src/main/java/org/apache/activemq/store/amq/AMQMessageStore.java b/activemq-core/src/main/java/org/apache/activemq/store/amq/AMQMessageStore.java
index d3d90bc..50422c0 100644
--- a/activemq-core/src/main/java/org/apache/activemq/store/amq/AMQMessageStore.java
+++ b/activemq-core/src/main/java/org/apache/activemq/store/amq/AMQMessageStore.java
@@ -328,7 +328,7 @@
      * @return
      * @throws IOException
      */
-    void asyncWrite() {
+    synchronized void asyncWrite() {
         try {
             CountDownLatch countDown;
             lock.lock();
