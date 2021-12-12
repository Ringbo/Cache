diff --git a/spring-beans/src/main/java/org/springframework/beans/factory/support/DefaultListableBeanFactory.java b/spring-beans/src/main/java/org/springframework/beans/factory/support/DefaultListableBeanFactory.java
index aba52d5..f06f320 100644
--- a/spring-beans/src/main/java/org/springframework/beans/factory/support/DefaultListableBeanFactory.java
+++ b/spring-beans/src/main/java/org/springframework/beans/factory/support/DefaultListableBeanFactory.java
@@ -471,12 +471,12 @@
 		Map<String, Object> results = new LinkedHashMap<String, Object>();
 		for (String beanName : getBeanDefinitionNames()) {
 			BeanDefinition beanDefinition = getBeanDefinition(beanName);
-			if (!beanDefinition.isAbstract() && (findAnnotationOnBean(beanName, annotationType) != null)) {
+			if (!beanDefinition.isAbstract() && findAnnotationOnBean(beanName, annotationType) != null) {
 				results.put(beanName, getBean(beanName));
 			}
 		}
 		for (String beanName : getSingletonNames()) {
-			if (findAnnotationOnBean(beanName, annotationType) != null) {
+			if (!results.containsKey(beanName) && findAnnotationOnBean(beanName, annotationType) != null) {
 				results.put(beanName, getBean(beanName));
 			}
 		}
