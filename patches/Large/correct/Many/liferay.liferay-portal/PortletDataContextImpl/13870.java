diff --git a/modules/apps/web-experience/export-import/export-import-service/src/main/java/com/liferay/exportimport/lar/PortletDataContextImpl.java b/modules/apps/web-experience/export-import/export-import-service/src/main/java/com/liferay/exportimport/lar/PortletDataContextImpl.java
index f07159c..348a2a7 100644
--- a/modules/apps/web-experience/export-import/export-import-service/src/main/java/com/liferay/exportimport/lar/PortletDataContextImpl.java
+++ b/modules/apps/web-experience/export-import/export-import-service/src/main/java/com/liferay/exportimport/lar/PortletDataContextImpl.java
@@ -2647,7 +2647,7 @@
 			XStreamConfiguratorRegistryUtil.getXStreamConfigurators();
 
 		if ((_xStream != null) &&
-			xStreamConfigurators.equals(xStreamConfigurators)) {
+			xStreamConfigurators.equals(_xStreamConfigurators)) {
 
 			return;
 		}
