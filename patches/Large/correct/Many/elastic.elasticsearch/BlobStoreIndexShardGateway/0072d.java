diff --git a/modules/elasticsearch/src/main/java/org/elasticsearch/index/gateway/blobstore/BlobStoreIndexShardGateway.java b/modules/elasticsearch/src/main/java/org/elasticsearch/index/gateway/blobstore/BlobStoreIndexShardGateway.java
index e417507..6e4e638 100644
--- a/modules/elasticsearch/src/main/java/org/elasticsearch/index/gateway/blobstore/BlobStoreIndexShardGateway.java
+++ b/modules/elasticsearch/src/main/java/org/elasticsearch/index/gateway/blobstore/BlobStoreIndexShardGateway.java
@@ -324,7 +324,7 @@
         if (snapshot.newTranslogCreated()) {
             try {
                 translogContainer.deleteBlob("translog-" + snapshot.lastTranslogId());
-            } catch (IOException e) {
+            } catch (Exception e) {
                 // ignore
             }
         }
