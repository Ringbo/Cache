diff --git a/sql/src/test/java/io/crate/operation/collect/BlobShardCollectorProviderTest.java b/sql/src/test/java/io/crate/operation/collect/BlobShardCollectorProviderTest.java
index 8437ea0..c1d1333 100644
--- a/sql/src/test/java/io/crate/operation/collect/BlobShardCollectorProviderTest.java
+++ b/sql/src/test/java/io/crate/operation/collect/BlobShardCollectorProviderTest.java
@@ -45,7 +45,7 @@
 
 import static org.hamcrest.Matchers.is;
 
-@ESIntegTestCase.ClusterScope(numDataNodes = 1, numClientNodes = 0)
+@ESIntegTestCase.ClusterScope(numDataNodes = 1, numClientNodes = 0, supportsDedicatedMasters = false)
 public class BlobShardCollectorProviderTest extends SQLHttpIntegrationTest {
 
     private BlobShardCollectorProvider collectorProvider;
@@ -94,10 +94,10 @@
         @Override
         public void run() {
             try {
-                ClusterService clusterService = internalCluster().getInstance(ClusterService.class);
+                ClusterService clusterService = internalCluster().getDataNodeInstance(ClusterService.class);
                 MetaData metaData = clusterService.state().getMetaData();
                 String indexUUID = metaData.index(".blob_b1").getIndexUUID();
-                BlobIndicesService blobIndicesService = internalCluster().getInstance(BlobIndicesService.class);
+                BlobIndicesService blobIndicesService = internalCluster().getDataNodeInstance(BlobIndicesService.class);
                 BlobShard blobShard = blobIndicesService.blobShard(new ShardId(".blob_b1", indexUUID, 0));
                 assertNotNull(blobShard);
                 collectorProvider = new BlobShardCollectorProvider(blobShard, null, null,
