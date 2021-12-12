diff --git a/titan-hadoop/src/main/java/com/thinkaurelius/titan/hadoop/formats/titan/input/current/TitanHadoopSetupImpl.java b/titan-hadoop/src/main/java/com/thinkaurelius/titan/hadoop/formats/titan/input/current/TitanHadoopSetupImpl.java
index 9f0cc73..f736076 100644
--- a/titan-hadoop/src/main/java/com/thinkaurelius/titan/hadoop/formats/titan/input/current/TitanHadoopSetupImpl.java
+++ b/titan-hadoop/src/main/java/com/thinkaurelius/titan/hadoop/formats/titan/input/current/TitanHadoopSetupImpl.java
@@ -102,7 +102,7 @@
     @Override
     public SliceQuery inputSlice(final VertexQueryFilter inputFilter) {
         if (inputFilter.limit == 0) {
-            final StaticBuffer[] endPoints = IDHandler.getBounds(RelationCategory.PROPERTY);
+            final StaticBuffer[] endPoints = IDHandler.getBounds(RelationCategory.PROPERTY,false);
             return new SliceQuery(endPoints[0], endPoints[1]).setLimit(Integer.MAX_VALUE);
         } else {
             return super.inputSlice(inputFilter);
