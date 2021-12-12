diff --git a/spring-context/src/main/java/org/springframework/context/support/PostProcessorRegistrationDelegate.java b/spring-context/src/main/java/org/springframework/context/support/PostProcessorRegistrationDelegate.java
index f8250b1..0557b6b 100644
--- a/spring-context/src/main/java/org/springframework/context/support/PostProcessorRegistrationDelegate.java
+++ b/spring-context/src/main/java/org/springframework/context/support/PostProcessorRegistrationDelegate.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2015 the original author or authors.
+ * Copyright 2002-2016 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -344,17 +344,23 @@
 
 
 	/**
-	 * BeanPostProcessor that detects beans which implement the ApplicationListener interface.
-	 * This catches beans that can't reliably be detected by getBeanNamesForType.
+	 * {@code BeanPostProcessor} that detects beans which implement the {@code ApplicationListener}
+	 * interface. This catches beans that can't reliably be detected by {@code getBeanNamesForType}
+	 * and related operations which only work against top-level beans.
+	 *
+	 * <p>With standard Java serialization, this post-processor won't get serialized as part of
+	 * {@code DisposableBeanAdapter} to begin with. However, with alternative serialization
+	 * mechanisms, {@code DisposableBeanAdapter.writeReplace} might not get used at all, so we
+	 * defensively mark this post-processor's field state as {@code transient}.
 	 */
 	private static class ApplicationListenerDetector
 			implements DestructionAwareBeanPostProcessor, MergedBeanDefinitionPostProcessor {
 
 		private static final Log logger = LogFactory.getLog(ApplicationListenerDetector.class);
 
-		private final AbstractApplicationContext applicationContext;
+		private transient final AbstractApplicationContext applicationContext;
 
-		private final Map<String, Boolean> singletonNames = new ConcurrentHashMap<String, Boolean>(256);
+		private transient final Map<String, Boolean> singletonNames = new ConcurrentHashMap<String, Boolean>(256);
 
 		public ApplicationListenerDetector(AbstractApplicationContext applicationContext) {
 			this.applicationContext = applicationContext;
@@ -362,7 +368,7 @@
 
 		@Override
 		public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
-			if (beanDefinition.isSingleton()) {
+			if (this.applicationContext != null && beanDefinition.isSingleton()) {
 				this.singletonNames.put(beanName, Boolean.TRUE);
 			}
 		}
@@ -374,7 +380,7 @@
 
 		@Override
 		public Object postProcessAfterInitialization(Object bean, String beanName) {
-			if (bean instanceof ApplicationListener) {
+			if (this.applicationContext != null && bean instanceof ApplicationListener) {
 				// potentially not detected as a listener by getBeanNamesForType retrieval
 				Boolean flag = this.singletonNames.get(beanName);
 				if (Boolean.TRUE.equals(flag)) {
