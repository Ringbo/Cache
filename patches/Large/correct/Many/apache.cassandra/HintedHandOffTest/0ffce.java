diff --git a/test/unit/org/apache/cassandra/db/HintedHandOffTest.java b/test/unit/org/apache/cassandra/db/HintedHandOffTest.java
index ad1e6cf..a2b0ae1 100644
--- a/test/unit/org/apache/cassandra/db/HintedHandOffTest.java
+++ b/test/unit/org/apache/cassandra/db/HintedHandOffTest.java
@@ -85,7 +85,7 @@
     public void testHintsMetrics() throws Exception
     {
         for (int i = 0; i < 99; i++)
-            HintedHandOffManager.instance.metrics.incrPastWindow(InetAddress.getLocalHost());
+            HintedHandOffManager.instance.metrics.incrPastWindow(InetAddress.getByName("127.0.0.1"));
         HintedHandOffManager.instance.metrics.log();
 
         UntypedResultSet rows = executeInternal("SELECT hints_dropped FROM system." + SystemKeyspace.PEER_EVENTS_CF);
