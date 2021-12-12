diff --git a/driver-core/src/test/java/com/datastax/driver/core/ExceptionsTest.java b/driver-core/src/test/java/com/datastax/driver/core/ExceptionsTest.java
index 50bf4e9..cf839cb 100644
--- a/driver-core/src/test/java/com/datastax/driver/core/ExceptionsTest.java
+++ b/driver-core/src/test/java/com/datastax/driver/core/ExceptionsTest.java
@@ -313,7 +313,7 @@
 
             c.cassandraCluster.stop(2);
 
-            waitForDown(CCMBridge.IP_PREFIX + '2', c.cluster);
+            waitForDownWithWait(CCMBridge.IP_PREFIX + '2', c.cluster, 10);
 
             try{
                 c.session.execute(new SimpleStatement(String.format(TestUtils.SELECT_ALL_FORMAT, table)).setConsistencyLevel(ConsistencyLevel.ALL));
