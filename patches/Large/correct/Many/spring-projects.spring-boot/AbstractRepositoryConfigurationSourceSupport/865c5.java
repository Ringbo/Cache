diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/data/AbstractRepositoryConfigurationSourceSupport.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/data/AbstractRepositoryConfigurationSourceSupport.java
index 6a68a87..8a38754 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/data/AbstractRepositoryConfigurationSourceSupport.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/data/AbstractRepositoryConfigurationSourceSupport.java
@@ -63,7 +63,7 @@
 		StandardAnnotationMetadata metadata = new StandardAnnotationMetadata(
 				getConfiguration(), true);
 		return new AnnotationRepositoryConfigurationSource(metadata, getAnnotation(),
-				this.environment) {
+				this.resourceLoader, this.environment) {
 			@Override
 			public java.lang.Iterable<String> getBasePackages() {
 				return AbstractRepositoryConfigurationSourceSupport.this
