diff --git a/driver-core/src/test/java/com/datastax/driver/core/CCMBridge.java b/driver-core/src/test/java/com/datastax/driver/core/CCMBridge.java
index b1e5232..c0b56c0 100644
--- a/driver-core/src/test/java/com/datastax/driver/core/CCMBridge.java
+++ b/driver-core/src/test/java/com/datastax/driver/core/CCMBridge.java
@@ -248,7 +248,7 @@
         @AfterClass(groups = {"short", "long"})
         public static void discardCluster() {
             if (cluster != null)
-                cluster.shutdown();
+                cluster.close();
 
             if (cassandraCluster == null) {
                 logger.error("No cluster to discard");
@@ -338,7 +338,7 @@
 
         public void discard() {
             if (cluster != null)
-                cluster.shutdown();
+                cluster.close();
 
             if (cassandraCluster == null) {
                 logger.error("No cluster to discard");
