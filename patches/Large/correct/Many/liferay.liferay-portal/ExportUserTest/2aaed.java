diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/ExportUserTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/ExportUserTest.java
index 709cb55..8cf6215 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/ExportUserTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/ExportUserTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
