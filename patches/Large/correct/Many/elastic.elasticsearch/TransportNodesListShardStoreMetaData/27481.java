diff --git a/src/main/java/org/elasticsearch/indices/store/TransportNodesListShardStoreMetaData.java b/src/main/java/org/elasticsearch/indices/store/TransportNodesListShardStoreMetaData.java
index f8671e1..7c7f578 100644
--- a/src/main/java/org/elasticsearch/indices/store/TransportNodesListShardStoreMetaData.java
+++ b/src/main/java/org/elasticsearch/indices/store/TransportNodesListShardStoreMetaData.java
@@ -196,7 +196,7 @@
                 if (Store.isChecksum(file.getName())) {
                     continue;
                 }
-                files.put(file.getName(), new StoreFileMetaData(file.getName(), file.length(), file.lastModified(), checksums.get(file.getName())));
+                files.put(file.getName(), new StoreFileMetaData(file.getName(), file.length(), checksums.get(file.getName())));
             }
         }
 
