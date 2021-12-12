diff --git a/spring-beans/src/main/java/org/springframework/beans/factory/support/DefaultSingletonBeanRegistry.java b/spring-beans/src/main/java/org/springframework/beans/factory/support/DefaultSingletonBeanRegistry.java
index d4a0bac..67b3841 100644
--- a/spring-beans/src/main/java/org/springframework/beans/factory/support/DefaultSingletonBeanRegistry.java
+++ b/spring-beans/src/main/java/org/springframework/beans/factory/support/DefaultSingletonBeanRegistry.java
@@ -166,7 +166,7 @@
 	}
 
 	public Object getSingleton(String beanName) {
-		return getSingleton(beanName, true);
+		return getSingleton(beanName, isSingletonCurrentlyInCreation(beanName));
 	}
 
 	/**
@@ -179,10 +179,10 @@
 	 */
 	protected Object getSingleton(String beanName, boolean allowEarlyReference) {
 		Object singletonObject = this.singletonObjects.get(beanName);
-		if (singletonObject == null) {
+		if (singletonObject == null && allowEarlyReference) {
 			synchronized (this.singletonObjects) {
 				singletonObject = this.earlySingletonObjects.get(beanName);
-				if (singletonObject == null && allowEarlyReference) {
+				if (singletonObject == null) {
 					ObjectFactory singletonFactory = this.singletonFactories.get(beanName);
 					if (singletonFactory != null) {
 						singletonObject = singletonFactory.getObject();
