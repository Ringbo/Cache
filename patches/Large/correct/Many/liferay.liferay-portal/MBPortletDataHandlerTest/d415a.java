diff --git a/modules/core/portal-compat/message-boards/portal-message-boards-compat-test/src/testIntegration/java/com/liferay/portal/message/boards/compat/lar/test/MBPortletDataHandlerTest.java b/modules/core/portal-compat/message-boards/portal-message-boards-compat-test/src/testIntegration/java/com/liferay/portal/message/boards/compat/lar/test/MBPortletDataHandlerTest.java
index 641177f..5a988a3 100644
--- a/modules/core/portal-compat/message-boards/portal-message-boards-compat-test/src/testIntegration/java/com/liferay/portal/message/boards/compat/lar/test/MBPortletDataHandlerTest.java
+++ b/modules/core/portal-compat/message-boards/portal-message-boards-compat-test/src/testIntegration/java/com/liferay/portal/message/boards/compat/lar/test/MBPortletDataHandlerTest.java
@@ -174,7 +174,7 @@
 
 	@Override
 	protected DataLevel getDataLevel() {
-		return DataLevel.SITE;
+		return DataLevel.PORTLET_INSTANCE;
 	}
 
 	@Override
@@ -189,12 +189,12 @@
 
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
