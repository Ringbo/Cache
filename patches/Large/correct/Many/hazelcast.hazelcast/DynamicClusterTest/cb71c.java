diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/longrunning/DynamicClusterTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/longrunning/DynamicClusterTest.java
index 5dcd49b..60b8a47 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/longrunning/DynamicClusterTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/longrunning/DynamicClusterTest.java
@@ -234,7 +234,7 @@
         final CountDownLatch latch = new CountDownLatch(3);
         final String message = "Hazelcast Rocks!";
         topic.addMessageListener(new MessageListener<String>() {
-            public void onMessage(String msg) {
+            public void onMessage(Message<String> msg) {
                 if (msg.equals(message)) {
                     latch.countDown();
                 }
@@ -1013,7 +1013,7 @@
         HazelcastInstance h2 = Hazelcast.newHazelcastInstance(c2);
         HazelcastClient client2 = HazelcastClient.newHazelcastClient(c2.getGroupConfig().getName(), c2.getGroupConfig().getPassword(), "127.0.0.1:5702");
         client2.getTopic("def").addMessageListener(new MessageListener<Object>() {
-            public void onMessage(Object message) {
+            public void onMessage(Message message) {
             }
         });
         LifecycleCountingListener l = new LifecycleCountingListener();
