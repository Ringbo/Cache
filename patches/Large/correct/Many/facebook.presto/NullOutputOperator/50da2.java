diff --git a/presto-main/src/main/java/com/facebook/presto/testing/NullOutputOperator.java b/presto-main/src/main/java/com/facebook/presto/testing/NullOutputOperator.java
index 7eb7497..947d38b 100644
--- a/presto-main/src/main/java/com/facebook/presto/testing/NullOutputOperator.java
+++ b/presto-main/src/main/java/com/facebook/presto/testing/NullOutputOperator.java
@@ -33,9 +33,9 @@
             implements OutputFactory
     {
         @Override
-        public OperatorFactory createOutputOperator(int operatorId, List<Type> sourceType)
+        public OperatorFactory createOutputOperator(int operatorId, List<Type> sourceTypes)
         {
-            return new NullOutputOperatorFactory(operatorId, sourceType);
+            return new NullOutputOperatorFactory(operatorId, sourceTypes);
         }
     }
 
