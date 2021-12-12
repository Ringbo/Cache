diff --git a/src/java/org/apache/cassandra/service/StorageProxy.java b/src/java/org/apache/cassandra/service/StorageProxy.java
index 4353a8f..b087b3d 100644
--- a/src/java/org/apache/cassandra/service/StorageProxy.java
+++ b/src/java/org/apache/cassandra/service/StorageProxy.java
@@ -924,7 +924,7 @@
                                     columnsCount += row.getLiveColumnCount();
                                     logger.debug("range slices read {}", row.key);
                                 }
-                                FBUtilities.waitOnFutures(resolver.repairResults, DatabaseDescriptor.getReadRpcTimeout());
+                                FBUtilities.waitOnFutures(resolver.repairResults, DatabaseDescriptor.getRangeRpcTimeout());
                             }
                             catch (TimeoutException ex)
                             {
