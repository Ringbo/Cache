diff --git a/community/kernel/src/test/java/org/neo4j/kernel/impl/nioneo/store/TestUpgradeStore.java b/community/kernel/src/test/java/org/neo4j/kernel/impl/nioneo/store/TestUpgradeStore.java
index 15ec253..819aa61 100644
--- a/community/kernel/src/test/java/org/neo4j/kernel/impl/nioneo/store/TestUpgradeStore.java
+++ b/community/kernel/src/test/java/org/neo4j/kernel/impl/nioneo/store/TestUpgradeStore.java
@@ -219,7 +219,7 @@
     @Test
     public void makeSureStoreCantBeUpgradedByBatchInserterEvenIfExplicitlyToldTo() throws Exception
     {
-        String path = path( 11 );
+        String path = path( 14 );
         new EmbeddedGraphDatabase( path ).shutdown();
         setOlderNeoStoreVersion( path );
         
