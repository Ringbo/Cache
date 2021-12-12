diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/block/query/IntermediateResultsBlock.java b/pinot-core/src/main/java/com/linkedin/pinot/core/block/query/IntermediateResultsBlock.java
index 2520421..6c00ba5 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/block/query/IntermediateResultsBlock.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/block/query/IntermediateResultsBlock.java
@@ -169,7 +169,7 @@
     for (int i = 0; i < _aggregationResultList.size(); ++i) {
       switch (_aggregationFunctionList.get(i).aggregateResultDataType()) {
         case LONG:
-          builder.setColumn(i, ((Long) _aggregationResultList.get(i)).longValue());
+          builder.setColumn(i, ((Number) _aggregationResultList.get(i)).longValue());
           break;
         case DOUBLE:
           builder.setColumn(i, ((Double) _aggregationResultList.get(i)).doubleValue());
