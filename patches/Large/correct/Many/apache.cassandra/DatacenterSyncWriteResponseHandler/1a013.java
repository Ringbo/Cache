diff --git a/src/java/org/apache/cassandra/service/DatacenterSyncWriteResponseHandler.java b/src/java/org/apache/cassandra/service/DatacenterSyncWriteResponseHandler.java
index c038746..a8121a4 100644
--- a/src/java/org/apache/cassandra/service/DatacenterSyncWriteResponseHandler.java
+++ b/src/java/org/apache/cassandra/service/DatacenterSyncWriteResponseHandler.java
@@ -113,7 +113,7 @@
         // Throw exception if any of the DC doesn't have livenodes to accept write.
         for (String dc: strategy.getDatacenters())
         {
-        	if (dcEndpoints.get(dc).get() != responses.get(dc).get())
+        	if (dcEndpoints.get(dc).get() < responses.get(dc).get())
                 throw new UnavailableException();
         }
     }
