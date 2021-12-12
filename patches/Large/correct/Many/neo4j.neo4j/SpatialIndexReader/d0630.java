diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/index/schema/SpatialIndexReader.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/index/schema/SpatialIndexReader.java
index 3eef111..2465d69 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/index/schema/SpatialIndexReader.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/index/schema/SpatialIndexReader.java
@@ -67,7 +67,7 @@
     public IndexSampler createSampler()
     {
         List<IndexSampler> samplers = new ArrayList<>();
-        for ( SpatialIndexPartReader<NativeSchemaValue> partReader : this )
+        for ( SpatialIndexPartReader<NativeIndexValue> partReader : this )
         {
             samplers.add( partReader.createSampler() );
         }
