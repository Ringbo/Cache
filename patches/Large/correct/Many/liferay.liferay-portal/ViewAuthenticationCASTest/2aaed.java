diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationcas/ViewAuthenticationCASTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationcas/ViewAuthenticationCASTest.java
index 87e13f5..43b38ed 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationcas/ViewAuthenticationCASTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationcas/ViewAuthenticationCASTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
