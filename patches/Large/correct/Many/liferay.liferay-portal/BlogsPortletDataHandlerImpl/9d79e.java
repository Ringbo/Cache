diff --git a/portal-impl/src/com/liferay/portlet/blogs/lar/BlogsPortletDataHandlerImpl.java b/portal-impl/src/com/liferay/portlet/blogs/lar/BlogsPortletDataHandlerImpl.java
index c9d7689..727c297 100644
--- a/portal-impl/src/com/liferay/portlet/blogs/lar/BlogsPortletDataHandlerImpl.java
+++ b/portal-impl/src/com/liferay/portlet/blogs/lar/BlogsPortletDataHandlerImpl.java
@@ -157,7 +157,7 @@
 		Map parameterMap = context.getParameterMap();
 
 		boolean importData = MapUtil.getBoolean(
-			parameterMap, _IMPORT_BLOGS_DATA, _enableImport.getDefaultState());
+			parameterMap, _IMPORT_BLOGS_DATA);
 
 		if (_log.isDebugEnabled()) {
 			if (importData) {
