diff --git a/spring-context/src/main/java/org/springframework/context/support/GenericApplicationContext.java b/spring-context/src/main/java/org/springframework/context/support/GenericApplicationContext.java
index 5e0fc34..f52b4cd 100644
--- a/spring-context/src/main/java/org/springframework/context/support/GenericApplicationContext.java
+++ b/spring-context/src/main/java/org/springframework/context/support/GenericApplicationContext.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2016 the original author or authors.
+ * Copyright 2002-2017 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -366,8 +366,9 @@
 	 * @param customizers one or more callbacks for customizing the
 	 * factory's {@link BeanDefinition}, e.g. setting a lazy-init or primary flag
 	 * @since 5.0
+	 * @see #registerBean(String, Class, Supplier, BeanDefinitionCustomizer...)
 	 */
-	public <T> void registerBean(Class<T> beanClass, BeanDefinitionCustomizer... customizers) {
+	public final <T> void registerBean(Class<T> beanClass, BeanDefinitionCustomizer... customizers) {
 		registerBean(null, beanClass, null, customizers);
 	}
 
@@ -381,8 +382,9 @@
 	 * @param customizers one or more callbacks for customizing the
 	 * factory's {@link BeanDefinition}, e.g. setting a lazy-init or primary flag
 	 * @since 5.0
+	 * @see #registerBean(String, Class, Supplier, BeanDefinitionCustomizer...)
 	 */
-	public <T> void registerBean(String beanName, Class<T> beanClass, BeanDefinitionCustomizer... customizers) {
+	public final <T> void registerBean(String beanName, Class<T> beanClass, BeanDefinitionCustomizer... customizers) {
 		registerBean(beanName, beanClass, null, customizers);
 	}
 
@@ -396,8 +398,9 @@
 	 * @param customizers one or more callbacks for customizing the
 	 * factory's {@link BeanDefinition}, e.g. setting a lazy-init or primary flag
 	 * @since 5.0
+	 * @see #registerBean(String, Class, Supplier, BeanDefinitionCustomizer...)
 	 */
-	public <T> void registerBean(Class<T> beanClass, Supplier<T> supplier, BeanDefinitionCustomizer... customizers) {
+	public final <T> void registerBean(Class<T> beanClass, Supplier<T> supplier, BeanDefinitionCustomizer... customizers) {
 		registerBean(null, beanClass, supplier, customizers);
 	}
 
@@ -406,8 +409,10 @@
 	 * obtaining a new instance (typically declared as a lambda expression or
 	 * method reference), optionally customizing its bean definition metadata
 	 * (again typically declared as a lambda expression or method reference).
+	 * <p>This method can be overridden to adapt the registration mechanism for
+	 * all {@code registerBean} methods (since they all delegate to this one).
 	 * @param beanName the name of the bean (may be {@code null})
-	 * @param beanClass the class of the bean
+	 * @param beanClass the class of the bean (may be {@code null} if a name is given)
 	 * @param supplier a callback for creating an instance of the bean
 	 * @param customizers one or more callbacks for customizing the
 	 * factory's {@link BeanDefinition}, e.g. setting a lazy-init or primary flag
