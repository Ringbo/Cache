diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/mapreduce/TableInputFormatBase.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/mapreduce/TableInputFormatBase.java
index 783ade9..e23ea37 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/mapreduce/TableInputFormatBase.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/mapreduce/TableInputFormatBase.java
@@ -190,7 +190,7 @@
       try {
         regionLocation = reverseDNS(regionAddress);
       } catch (NamingException e) {
-        LOG.error("Cannot resolve the host name for " + regionAddress + " because of " + e);
+        LOG.warn("Cannot resolve the host name for " + regionAddress + " because of " + e);
         regionLocation = location.getHostname();
       }
 
