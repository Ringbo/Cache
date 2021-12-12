diff --git a/portal-impl/src/com/liferay/portal/jsonwebservice/JSONWebServiceActionImpl.java b/portal-impl/src/com/liferay/portal/jsonwebservice/JSONWebServiceActionImpl.java
index 9e1c470..328e146 100644
--- a/portal-impl/src/com/liferay/portal/jsonwebservice/JSONWebServiceActionImpl.java
+++ b/portal-impl/src/com/liferay/portal/jsonwebservice/JSONWebServiceActionImpl.java
@@ -432,7 +432,7 @@
 
 					parameterType = classLoader.loadClass(parameterTypeName);
 
-					if (!ReflectUtil.isSubclass(
+					if (!ReflectUtil.isTypeOf(
 							parameterType, methodParameters[i].getType())) {
 
 						throw new IllegalArgumentException(
