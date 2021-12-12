diff --git a/exec/java-exec/src/main/java/org/apache/drill/exec/physical/impl/aggregate/HashAggBatch.java b/exec/java-exec/src/main/java/org/apache/drill/exec/physical/impl/aggregate/HashAggBatch.java
index aa6cd54..8b39330 100644
--- a/exec/java-exec/src/main/java/org/apache/drill/exec/physical/impl/aggregate/HashAggBatch.java
+++ b/exec/java-exec/src/main/java/org/apache/drill/exec/physical/impl/aggregate/HashAggBatch.java
@@ -199,7 +199,7 @@
 
       final MaterializedField outputField = MaterializedField.create(ne.getRef(), expr.getMajorType());
       ValueVector vv = TypeHelper.getNewVector(outputField, oContext.getAllocator());
-      keyAllocators.add(VectorAllocator.getAllocator(vv, 50));
+      keyAllocators.add(VectorAllocator.getAllocator(vv, 200));
 
       // add this group-by vector to the output container 
       groupByOutFieldIds[i] = container.add(vv);
@@ -215,7 +215,7 @@
       
       final MaterializedField outputField = MaterializedField.create(ne.getRef(), expr.getMajorType());
       ValueVector vv = TypeHelper.getNewVector(outputField, oContext.getAllocator());
-      valueAllocators.add(VectorAllocator.getAllocator(vv, 50));
+      valueAllocators.add(VectorAllocator.getAllocator(vv, 200));
       aggrOutFieldIds[i] = container.add(vv);
 
       aggrExprs[i] = new ValueVectorWriteExpression(aggrOutFieldIds[i], expr, true);
