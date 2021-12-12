diff --git a/portal-kernel/src/com/liferay/portal/kernel/model/LayoutSetStagingHandler.java b/portal-kernel/src/com/liferay/portal/kernel/model/LayoutSetStagingHandler.java
index 09bebfc..84e8928 100644
--- a/portal-kernel/src/com/liferay/portal/kernel/model/LayoutSetStagingHandler.java
+++ b/portal-kernel/src/com/liferay/portal/kernel/model/LayoutSetStagingHandler.java
@@ -154,7 +154,7 @@
 	private Object _toEscapedModel() {
 		return ProxyUtil.newProxyInstance(
 			PortalClassLoaderUtil.getClassLoader(),
-			new Class<?>[] {Layout.class, ModelWrapper.class},
+			new Class<?>[] {LayoutSet.class, ModelWrapper.class},
 			new LayoutSetStagingHandler(_layoutSet.toEscapedModel()));
 	}
 
