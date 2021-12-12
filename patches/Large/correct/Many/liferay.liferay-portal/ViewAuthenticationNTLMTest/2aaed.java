diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationntlm/ViewAuthenticationNTLMTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationntlm/ViewAuthenticationNTLMTest.java
index b5162b3..169344c 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationntlm/ViewAuthenticationNTLMTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationntlm/ViewAuthenticationNTLMTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
