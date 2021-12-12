diff --git a/hazelcast/src/test/java/com/hazelcast/impl/RedoNoConnectionTest.java b/hazelcast/src/test/java/com/hazelcast/impl/RedoNoConnectionTest.java
index 3d472d9..1b29b8d 100644
--- a/hazelcast/src/test/java/com/hazelcast/impl/RedoNoConnectionTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/impl/RedoNoConnectionTest.java
@@ -100,7 +100,7 @@
         config.setProperty(GroupProperties.PROP_HEARTBEAT_INTERVAL_SECONDS, "6");
         final HazelcastInstance h1 = Hazelcast.newHazelcastInstance(config);
         final HazelcastInstance h2 = Hazelcast.newHazelcastInstance(config);
-        BeforeAfterTester t = new BeforeAfterTester(
+        Runnable t = new RunAfterTester(
                 new DisconnectionBehavior(h1, h2),
                 new MultiCallBuilder(h1));
         t.run();
@@ -112,7 +112,7 @@
         config.setProperty(GroupProperties.PROP_HEARTBEAT_INTERVAL_SECONDS, "6");
         final HazelcastInstance h1 = Hazelcast.newHazelcastInstance(config);
         final HazelcastInstance h2 = Hazelcast.newHazelcastInstance(config);
-        BeforeAfterTester t = new BeforeAfterTester(
+        Runnable t = new RunAfterTester(
                 new DisconnectionBehavior(h2, h1),
                 new MultiCallBuilder(h2));
         t.run();
@@ -139,7 +139,7 @@
         config.setProperty(GroupProperties.PROP_HEARTBEAT_INTERVAL_SECONDS, "6");
         final HazelcastInstance h1 = Hazelcast.newHazelcastInstance(config);
         final HazelcastInstance h2 = Hazelcast.newHazelcastInstance(config);
-        BeforeAfterTester t = new BeforeAfterTester(
+        Runnable t = new RunAfterTester(
                 new DisconnectionBehavior(h2, h1),
                 new QueueCallBuilder(h2));
         t.run();
