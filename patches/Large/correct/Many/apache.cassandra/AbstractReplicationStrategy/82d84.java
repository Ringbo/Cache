diff --git a/src/java/org/apache/cassandra/locator/AbstractReplicationStrategy.java b/src/java/org/apache/cassandra/locator/AbstractReplicationStrategy.java
index 98a8238..aa5f8fd 100644
--- a/src/java/org/apache/cassandra/locator/AbstractReplicationStrategy.java
+++ b/src/java/org/apache/cassandra/locator/AbstractReplicationStrategy.java
@@ -91,11 +91,11 @@
 
         List<InetAddress> endpoints = new ArrayList<InetAddress>(naturalEndpoints);
 
-        for (Map.Entry<Range, Collection<InetAddress>> entry : tokenMetadata_.getPendingRanges().entrySet())
+        for (Map.Entry<Range, InetAddress> entry : tokenMetadata_.getPendingRanges().entrySet())
         {
             if (entry.getKey().contains(token))
             {
-                endpoints.addAll(entry.getValue());
+                endpoints.add(entry.getValue());
             }
         }
 
