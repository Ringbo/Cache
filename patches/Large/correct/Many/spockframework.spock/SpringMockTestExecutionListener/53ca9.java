diff --git a/spock-spring/src/main/java/org/spockframework/spring/SpringMockTestExecutionListener.java b/spock-spring/src/main/java/org/spockframework/spring/SpringMockTestExecutionListener.java
index 089e80b..419ff7b 100644
--- a/spock-spring/src/main/java/org/spockframework/spring/SpringMockTestExecutionListener.java
+++ b/spock-spring/src/main/java/org/spockframework/spring/SpringMockTestExecutionListener.java
@@ -72,7 +72,7 @@
 
     for (String beanName : mockBeanNames) {
       BeanDefinition beanDefinition = ((BeanDefinitionRegistry)applicationContext).getBeanDefinition(beanName);
-      if (beanDefinition.isAbstract()) {
+      if (beanDefinition.isAbstract() || beanDefinition.isLazyInit()) {
         continue;
       }
       if (beanDefinition.isSingleton() || scanScopedBean(scanScopedBeans, scopes, beanDefinition)) {
