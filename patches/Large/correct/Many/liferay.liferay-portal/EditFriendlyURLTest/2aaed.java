diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/EditFriendlyURLTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/EditFriendlyURLTest.java
index c6d223f..ae89384 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/EditFriendlyURLTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/EditFriendlyURLTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
