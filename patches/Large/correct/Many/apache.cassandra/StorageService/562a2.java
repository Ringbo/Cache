diff --git a/src/java/org/apache/cassandra/service/StorageService.java b/src/java/org/apache/cassandra/service/StorageService.java
index 992a13a..bfca642 100644
--- a/src/java/org/apache/cassandra/service/StorageService.java
+++ b/src/java/org/apache/cassandra/service/StorageService.java
@@ -1537,7 +1537,7 @@
                 // set state back to normal, since the node may have tried to leave, but failed and is now back up
                 tokensToUpdateInMetadata.add(token);
                 if (!isClientMode)
-                    tokensToUpdateInSystemKeyspace.add(token);
+                    tokensToUpdateInSystemTable.add(token);
             }
             else if (tokenMetadata.isRelocating(token) && tokenMetadata.getRelocatingRanges().get(token).equals(endpoint))
             {
