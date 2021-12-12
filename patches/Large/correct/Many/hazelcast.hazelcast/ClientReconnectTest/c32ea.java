diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/ClientReconnectTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/ClientReconnectTest.java
index 9a873ab..5a3ef48 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/ClientReconnectTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/ClientReconnectTest.java
@@ -57,7 +57,7 @@
         final HazelcastInstance h1 = Hazelcast.newHazelcastInstance();
         ClientConfig clientConfig = new ClientConfig();
         clientConfig.getNetworkConfig().setConnectionAttemptLimit(Integer.MAX_VALUE);
-        final HazelcastInstance client = HazelcastClient.newHazelcastClient();
+        final HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
         final CountDownLatch connectedLatch = new CountDownLatch(2);
         client.getLifecycleService().addLifecycleListener(new LifecycleListener() {
             @Override
