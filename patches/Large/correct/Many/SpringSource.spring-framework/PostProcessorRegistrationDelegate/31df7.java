diff --git a/spring-context/src/main/java/org/springframework/context/support/PostProcessorRegistrationDelegate.java b/spring-context/src/main/java/org/springframework/context/support/PostProcessorRegistrationDelegate.java
index 0ac848d..a18770d 100644
--- a/spring-context/src/main/java/org/springframework/context/support/PostProcessorRegistrationDelegate.java
+++ b/spring-context/src/main/java/org/springframework/context/support/PostProcessorRegistrationDelegate.java
@@ -316,7 +316,7 @@
 		}
 
 		private boolean isInfrastructureBean(String beanName) {
-			if (beanName != null && this.beanFactory.containsBean(beanName)) {
+			if (beanName != null && this.beanFactory.containsBeanDefinition(beanName)) {
 				BeanDefinition bd = this.beanFactory.getBeanDefinition(beanName);
 				return RootBeanDefinition.ROLE_INFRASTRUCTURE == bd.getRole();
 			}
