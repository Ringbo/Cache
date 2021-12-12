diff --git a/spring-beans/src/main/java/org/springframework/beans/factory/support/AbstractAutowireCapableBeanFactory.java b/spring-beans/src/main/java/org/springframework/beans/factory/support/AbstractAutowireCapableBeanFactory.java
index f629133..8193abc 100644
--- a/spring-beans/src/main/java/org/springframework/beans/factory/support/AbstractAutowireCapableBeanFactory.java
+++ b/spring-beans/src/main/java/org/springframework/beans/factory/support/AbstractAutowireCapableBeanFactory.java
@@ -583,8 +583,9 @@
 				if (bp instanceof SmartInstantiationAwareBeanPostProcessor) {
 					SmartInstantiationAwareBeanPostProcessor ibp = (SmartInstantiationAwareBeanPostProcessor) bp;
 					Class predictedType = ibp.predictBeanType(beanClass, beanName);
-					if (predictedType != null && (typesToMatch.length != 1 ||
-							!FactoryBean.class.equals(typesToMatch[0]) || FactoryBean.class.isAssignableFrom(predictedType))) {
+					if (predictedType != null && (typesToMatch.length > 1 ||
+							(typesToMatch.length > 0 && !FactoryBean.class.equals(typesToMatch[0])) ||
+							FactoryBean.class.isAssignableFrom(predictedType))) {
 						return predictedType;
 					}
 				}
