diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationsiteminder/ViewAuthenticationSiteMinderTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationsiteminder/ViewAuthenticationSiteMinderTest.java
index 9f0953f..666051b 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationsiteminder/ViewAuthenticationSiteMinderTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationsiteminder/ViewAuthenticationSiteMinderTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
