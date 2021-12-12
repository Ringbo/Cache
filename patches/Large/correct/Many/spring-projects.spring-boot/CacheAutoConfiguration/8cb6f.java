diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/cache/CacheAutoConfiguration.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/cache/CacheAutoConfiguration.java
index 6509fd7..1054cf7 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/cache/CacheAutoConfiguration.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/cache/CacheAutoConfiguration.java
@@ -84,7 +84,7 @@
 		@Override
 		public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
 				throws BeansException {
-			for (String name : beanFactory.getBeanNamesForType(CacheAspectSupport.class)) {
+			for (String name : beanFactory.getBeanNamesForType(CacheAspectSupport.class, false, false)) {
 				BeanDefinition definition = beanFactory.getBeanDefinition(name);
 				definition.setDependsOn(append(definition.getDependsOn(),
 						VALIDATOR_BEAN_NAME));
