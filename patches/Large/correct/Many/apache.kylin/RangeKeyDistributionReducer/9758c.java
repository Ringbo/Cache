diff --git a/storage-hbase/src/main/java/org/apache/kylin/storage/hbase/steps/RangeKeyDistributionReducer.java b/storage-hbase/src/main/java/org/apache/kylin/storage/hbase/steps/RangeKeyDistributionReducer.java
index c927ceb..b694f5f 100644
--- a/storage-hbase/src/main/java/org/apache/kylin/storage/hbase/steps/RangeKeyDistributionReducer.java
+++ b/storage-hbase/src/main/java/org/apache/kylin/storage/hbase/steps/RangeKeyDistributionReducer.java
@@ -66,7 +66,7 @@
         }
 
         if (context.getConfiguration().get(BatchConstants.CFG_REGION_SPLIT_SIZE) != null) {
-            cut = Integer.valueOf(context.getConfiguration().get(BatchConstants.CFG_REGION_SPLIT_SIZE));
+            cut = Float.valueOf(context.getConfiguration().get(BatchConstants.CFG_REGION_SPLIT_SIZE));
         }
 
         if (context.getConfiguration().get(BatchConstants.CFG_REGION_NUMBER_MIN) != null) {
