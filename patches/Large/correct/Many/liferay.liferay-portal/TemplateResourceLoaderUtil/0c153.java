diff --git a/portal-service/src/com/liferay/portal/kernel/template/TemplateResourceLoaderUtil.java b/portal-service/src/com/liferay/portal/kernel/template/TemplateResourceLoaderUtil.java
index 45cf47b..45d8967 100644
--- a/portal-service/src/com/liferay/portal/kernel/template/TemplateResourceLoaderUtil.java
+++ b/portal-service/src/com/liferay/portal/kernel/template/TemplateResourceLoaderUtil.java
@@ -55,7 +55,8 @@
 	}
 
 	public static TemplateResourceLoader getTemplateResourceLoader(
-		String templateResourceLoaderName) {
+			String templateResourceLoaderName)
+		throws TemplateException {
 
 		return _instance._getTemplateResourceLoader(templateResourceLoaderName);
 	}
