diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/EditFriendlyURLSlashesTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/EditFriendlyURLSlashesTest.java
index 00efdd7..6c65821 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/EditFriendlyURLSlashesTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/EditFriendlyURLSlashesTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
