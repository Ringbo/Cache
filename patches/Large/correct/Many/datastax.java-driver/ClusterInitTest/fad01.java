diff --git a/driver-core/src/test/java/com/datastax/driver/core/ClusterInitTest.java b/driver-core/src/test/java/com/datastax/driver/core/ClusterInitTest.java
index aa9d75c..d25aa7c 100644
--- a/driver-core/src/test/java/com/datastax/driver/core/ClusterInitTest.java
+++ b/driver-core/src/test/java/com/datastax/driver/core/ClusterInitTest.java
@@ -158,7 +158,7 @@
         // Both contact points time out so we're sure we'll try both of them and init will never complete.
         List<FakeHost> hosts = Lists.newArrayList(
             new FakeHost(CCMBridge.ipOfNode(0), 9042, THROWING_CONNECT_TIMEOUTS),
-            new FakeHost(CCMBridge.ipOfNode(0), 9042, THROWING_CONNECT_TIMEOUTS));
+            new FakeHost(CCMBridge.ipOfNode(1), 9042, THROWING_CONNECT_TIMEOUTS));
         // Use a low reconnection interval and keep the default connect timeout (5 seconds). So if a reconnection was scheduled,
         // we would see a call to the reconnection policy.
         CountingReconnectionPolicy reconnectionPolicy = new CountingReconnectionPolicy(new ConstantReconnectionPolicy(100));
