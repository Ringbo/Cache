diff --git a/portal-impl/src/com/liferay/portal/bean/BeanLocatorImpl.java b/portal-impl/src/com/liferay/portal/bean/BeanLocatorImpl.java
index c84569f..ca94d22 100644
--- a/portal-impl/src/com/liferay/portal/bean/BeanLocatorImpl.java
+++ b/portal-impl/src/com/liferay/portal/bean/BeanLocatorImpl.java
@@ -205,7 +205,7 @@
 		while (superClazz != null) {
 			getInterfaces(interfaceClasses, superClazz);
 
-			superClazz = clazz.getSuperclass();
+			superClazz = superClazz.getSuperclass();
 		}
 
 		return interfaceClasses.toArray(new Class<?>[interfaceClasses.size()]);
