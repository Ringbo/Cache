diff --git a/portal-impl/src/com/liferay/portal/nio/intraband/proxy/IntrabandProxyUtil.java b/portal-impl/src/com/liferay/portal/nio/intraband/proxy/IntrabandProxyUtil.java
index cd085c3..b44964e 100644
--- a/portal-impl/src/com/liferay/portal/nio/intraband/proxy/IntrabandProxyUtil.java
+++ b/portal-impl/src/com/liferay/portal/nio/intraband/proxy/IntrabandProxyUtil.java
@@ -532,7 +532,7 @@
 
 		methodNodes.addAll(templateMethodNodes);
 
-		Type stubType = Type.getType(classNode.name);
+		Type stubType = Type.getObjectType(classNode.name);
 
 		// Id methods
 
