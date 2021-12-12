diff --git a/presto-main/src/main/java/com/facebook/presto/testing/LocalQueryRunner.java b/presto-main/src/main/java/com/facebook/presto/testing/LocalQueryRunner.java
index 72b449c..7ed8202 100644
--- a/presto-main/src/main/java/com/facebook/presto/testing/LocalQueryRunner.java
+++ b/presto-main/src/main/java/com/facebook/presto/testing/LocalQueryRunner.java
@@ -264,9 +264,9 @@
         }
 
         @Override
-        public OperatorFactory createOutputOperator(int operatorId, List<Type> sourceType)
+        public OperatorFactory createOutputOperator(int operatorId, List<Type> sourceTypes)
         {
-            checkNotNull(sourceType, "sourceType is null");
+            checkNotNull(sourceTypes, "sourceType is null");
 
             return new OperatorFactory()
             {
@@ -280,7 +280,7 @@
                 public Operator createOperator(DriverContext driverContext)
                 {
                     OperatorContext operatorContext = driverContext.addOperatorContext(operatorId, MaterializingOperator.class.getSimpleName());
-                    MaterializingOperator operator = new MaterializingOperator(operatorContext, sourceType);
+                    MaterializingOperator operator = new MaterializingOperator(operatorContext, sourceTypes);
 
                     if (!materializingOperator.compareAndSet(null, operator)) {
                         throw new IllegalArgumentException("Output already created");
