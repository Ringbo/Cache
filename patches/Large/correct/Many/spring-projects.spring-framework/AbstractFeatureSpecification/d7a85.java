diff --git a/org.springframework.context/src/main/java/org/springframework/context/config/AbstractFeatureSpecification.java b/org.springframework.context/src/main/java/org/springframework/context/config/AbstractFeatureSpecification.java
index c7f4e1f..0fde630 100644
--- a/org.springframework.context/src/main/java/org/springframework/context/config/AbstractFeatureSpecification.java
+++ b/org.springframework.context/src/main/java/org/springframework/context/config/AbstractFeatureSpecification.java
@@ -71,7 +71,7 @@
 
 	public void execute(SpecificationContext specificationContext) {
 		FeatureSpecificationExecutor executor =
-			BeanUtils.instantiateClass(this.executorType, FeatureSpecificationExecutor.class);
+			BeanUtils.instantiateClass(this.executorType);
 		executor.execute(this, specificationContext);
 	}
 
