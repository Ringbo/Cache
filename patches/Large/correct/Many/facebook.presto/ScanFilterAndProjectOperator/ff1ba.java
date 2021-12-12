diff --git a/presto-main/src/main/java/com/facebook/presto/operator/ScanFilterAndProjectOperator.java b/presto-main/src/main/java/com/facebook/presto/operator/ScanFilterAndProjectOperator.java
index a966459..daf5e81 100644
--- a/presto-main/src/main/java/com/facebook/presto/operator/ScanFilterAndProjectOperator.java
+++ b/presto-main/src/main/java/com/facebook/presto/operator/ScanFilterAndProjectOperator.java
@@ -273,7 +273,7 @@
         public SourceOperator createOperator(DriverContext driverContext)
         {
             checkState(!closed, "Factory is already closed");
-            OperatorContext operatorContext = driverContext.addOperatorContext(operatorId, FilterAndProjectOperator.class.getSimpleName());
+            OperatorContext operatorContext = driverContext.addOperatorContext(operatorId, ScanFilterAndProjectOperator.class.getSimpleName());
             return new ScanFilterAndProjectOperator(
                     operatorContext,
                     sourceId,
