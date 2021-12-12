diff --git a/driver-core/src/test/java/com/datastax/driver/core/TestUtils.java b/driver-core/src/test/java/com/datastax/driver/core/TestUtils.java
index 90bd5d3..7bd2ea7 100644
--- a/driver-core/src/test/java/com/datastax/driver/core/TestUtils.java
+++ b/driver-core/src/test/java/com/datastax/driver/core/TestUtils.java
@@ -226,7 +226,7 @@
             return;
         }
 
-        ClusterMetadata metadata = cluster.getMetadata();
+        Metadata metadata = cluster.getMetadata();
         for (int i = 0; i < maxTry; ++i) {
             for (Host host : metadata.getAllHosts()) {
                 if (host.getAddress().equals(address) && host.getMonitor().isUp())
