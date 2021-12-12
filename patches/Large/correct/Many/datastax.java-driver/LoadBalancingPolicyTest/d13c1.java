diff --git a/driver-core/src/test/java/com/datastax/driver/core/LoadBalancingPolicyTest.java b/driver-core/src/test/java/com/datastax/driver/core/LoadBalancingPolicyTest.java
index 187edb3..1d88bd5 100644
--- a/driver-core/src/test/java/com/datastax/driver/core/LoadBalancingPolicyTest.java
+++ b/driver-core/src/test/java/com/datastax/driver/core/LoadBalancingPolicyTest.java
@@ -46,7 +46,7 @@
             resetCoordinators();
             c.cassandraCluster.bootstrapNode(3);
             waitFor(CCMBridge.IP_PREFIX + '3', c.cluster);
-            Thread.sleep(30000);
+            Thread.sleep(40000);
 
             query(c, 12);
 
@@ -130,7 +130,7 @@
             c.cassandraCluster.decommissionNode(1);
             waitFor(CCMBridge.IP_PREFIX + '5', c.cluster);
             waitForDecommission(CCMBridge.IP_PREFIX + '1', c.cluster);
-            Thread.sleep(30000);
+            Thread.sleep(40000);
 
             query(c, 12);
 
@@ -245,7 +245,7 @@
             //
             //resetCoordinators();
             c.cassandraCluster.decommissionNode(5);
-            waitForDecommission(CCMBridge.IP_PREFIX + '5', c.cluster);
+            waitForDecommission(CCMBridge.IP_PREFIX + '5', c.cluster, 60);
 
             query(c, 12);
 
@@ -354,7 +354,7 @@
 
             resetCoordinators();
             c.cassandraCluster.forceStop(2);
-            waitForDown(CCMBridge.IP_PREFIX + '2', c.cluster);
+            waitForDownWithWait(CCMBridge.IP_PREFIX + '2', c.cluster, 10);
 
             try {
                 query(c, 12, usePrepared);
