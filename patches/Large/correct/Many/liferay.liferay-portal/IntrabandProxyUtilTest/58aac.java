diff --git a/portal-impl/test/unit/com/liferay/portal/nio/intraband/proxy/IntrabandProxyUtilTest.java b/portal-impl/test/unit/com/liferay/portal/nio/intraband/proxy/IntrabandProxyUtilTest.java
index a920bff..b12e97d 100644
--- a/portal-impl/test/unit/com/liferay/portal/nio/intraband/proxy/IntrabandProxyUtilTest.java
+++ b/portal-impl/test/unit/com/liferay/portal/nio/intraband/proxy/IntrabandProxyUtilTest.java
@@ -1292,7 +1292,7 @@
 		Method method, int index, String skeletonId, String stubInternalName) {
 
 		MethodNode proxyMethodNode = IntrabandProxyUtil.createProxyMethodNode(
-			method, index, skeletonId, Type.getType(stubInternalName));
+			method, index, skeletonId, Type.getObjectType(stubInternalName));
 
 		_assertMethodNodeSignature(
 			proxyMethodNode, method.getModifiers() & ~Modifier.ABSTRACT,
