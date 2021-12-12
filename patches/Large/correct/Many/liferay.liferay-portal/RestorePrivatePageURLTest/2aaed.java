diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/RestorePrivatePageURLTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/RestorePrivatePageURLTest.java
index 0904874..48547a2 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/RestorePrivatePageURLTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/RestorePrivatePageURLTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
