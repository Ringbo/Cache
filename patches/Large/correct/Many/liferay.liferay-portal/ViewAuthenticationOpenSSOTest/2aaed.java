diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationopensso/ViewAuthenticationOpenSSOTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationopensso/ViewAuthenticationOpenSSOTest.java
index 44a8be9..830a75e 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationopensso/ViewAuthenticationOpenSSOTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationopensso/ViewAuthenticationOpenSSOTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
