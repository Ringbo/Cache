diff --git a/spring-batch-core/src/main/java/org/springframework/batch/core/step/DefaultStepFactoryBean.java b/spring-batch-core/src/main/java/org/springframework/batch/core/step/DefaultStepFactoryBean.java
index cc5d1be..f497ff8 100644
--- a/spring-batch-core/src/main/java/org/springframework/batch/core/step/DefaultStepFactoryBean.java
+++ b/spring-batch-core/src/main/java/org/springframework/batch/core/step/DefaultStepFactoryBean.java
@@ -205,7 +205,7 @@
 
 		step.setStepOperations(stepOperations);
 
-		ItemSkipPolicyItemHandler itemHandler = new ItemSkipPolicyItemHandler(itemReader, itemWriter);
+		ItemHandler itemHandler = new SimpleItemHandler(itemReader, itemWriter);
 
 		setItemHandler(itemHandler);
 		step.setItemHandler(itemHandler);
