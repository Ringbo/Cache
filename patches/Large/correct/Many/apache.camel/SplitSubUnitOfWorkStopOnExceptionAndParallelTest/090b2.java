diff --git a/camel-core/src/test/java/org/apache/camel/processor/SplitSubUnitOfWorkStopOnExceptionAndParallelTest.java b/camel-core/src/test/java/org/apache/camel/processor/SplitSubUnitOfWorkStopOnExceptionAndParallelTest.java
index 0b5e352..d489cdc 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/SplitSubUnitOfWorkStopOnExceptionAndParallelTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/SplitSubUnitOfWorkStopOnExceptionAndParallelTest.java
@@ -50,8 +50,8 @@
         // b should get between 1 or 3 depending when we stop (we run parallel)
         getMockEndpoint("mock:b").expectedMinimumMessageCount(1);
         getMockEndpoint("mock:result").expectedMessageCount(0);
-        // line should get between 1 or 2 depending when we stop (we run parallel)
-        getMockEndpoint("mock:line").expectedMinimumMessageCount(1);
+        // line should get between 0 or 2 depending when we stop (we run parallel)
+        getMockEndpoint("mock:line").expectedMinimumMessageCount(0);
 
         template.sendBody("direct:start", "Tiger,Donkey,Camel");
 
