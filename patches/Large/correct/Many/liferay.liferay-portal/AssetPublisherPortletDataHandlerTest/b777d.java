diff --git a/modules/apps/web-experience/asset/asset-publisher-test/src/testIntegration/java/com/liferay/asset/publisher/lar/test/AssetPublisherPortletDataHandlerTest.java b/modules/apps/web-experience/asset/asset-publisher-test/src/testIntegration/java/com/liferay/asset/publisher/lar/test/AssetPublisherPortletDataHandlerTest.java
index ba46609..7658768 100644
--- a/modules/apps/web-experience/asset/asset-publisher-test/src/testIntegration/java/com/liferay/asset/publisher/lar/test/AssetPublisherPortletDataHandlerTest.java
+++ b/modules/apps/web-experience/asset/asset-publisher-test/src/testIntegration/java/com/liferay/asset/publisher/lar/test/AssetPublisherPortletDataHandlerTest.java
@@ -48,7 +48,7 @@
 
 	@Override
 	protected DataLevel getDataLevel() {
-		return DataLevel.SITE;
+		return DataLevel.PORTLET_INSTANCE;
 	}
 
 	@Override
@@ -63,12 +63,12 @@
 
 	@Override
 	protected boolean isDataPortletInstanceLevel() {
-		return false;
+		return true;
 	}
 
 	@Override
 	protected boolean isDataSiteLevel() {
-		return true;
+		return false;
 	}
 
 }
\ No newline at end of file
