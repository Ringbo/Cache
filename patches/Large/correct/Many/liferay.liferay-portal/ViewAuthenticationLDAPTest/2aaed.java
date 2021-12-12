diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationldap/ViewAuthenticationLDAPTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationldap/ViewAuthenticationLDAPTest.java
index 5c3421f..94e419b 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationldap/ViewAuthenticationLDAPTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewauthenticationldap/ViewAuthenticationLDAPTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
