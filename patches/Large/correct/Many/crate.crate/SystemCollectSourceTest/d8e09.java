diff --git a/sql/src/test/java/io/crate/operation/collect/sources/SystemCollectSourceTest.java b/sql/src/test/java/io/crate/operation/collect/sources/SystemCollectSourceTest.java
index f0e46bd..ca91e92 100644
--- a/sql/src/test/java/io/crate/operation/collect/sources/SystemCollectSourceTest.java
+++ b/sql/src/test/java/io/crate/operation/collect/sources/SystemCollectSourceTest.java
@@ -58,12 +58,12 @@
 import static org.hamcrest.Matchers.is;
 import static org.mockito.Mockito.mock;
 
-@ESIntegTestCase.ClusterScope(numDataNodes = 1)
+@ESIntegTestCase.ClusterScope(numDataNodes = 1, supportsDedicatedMasters = false)
 public class SystemCollectSourceTest extends SQLTransportIntegrationTest {
 
     @Test
     public void testOrderBySymbolsDoNotAppearTwiceInRows() throws Exception {
-        SystemCollectSource systemCollectSource = internalCluster().getInstance(SystemCollectSource.class);
+        SystemCollectSource systemCollectSource = internalCluster().getDataNodeInstance(SystemCollectSource.class);
 
         Reference shardId = new Reference(
             new ReferenceIdent(new TableIdent("sys", "shards"), "id"), RowGranularity.SHARD, DataTypes.INTEGER);
@@ -92,7 +92,7 @@
 
     @Test
     public void testReadIsolation() throws Exception {
-        SystemCollectSource systemCollectSource = internalCluster().getInstance(SystemCollectSource.class);
+        SystemCollectSource systemCollectSource = internalCluster().getDataNodeInstance(SystemCollectSource.class);
         RoutedCollectPhase collectPhase = new RoutedCollectPhase(
             UUID.randomUUID(),
             1,
