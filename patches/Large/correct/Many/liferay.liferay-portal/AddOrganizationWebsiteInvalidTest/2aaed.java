diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationwebsite/addorganizationwebsiteinvalid/AddOrganizationWebsiteInvalidTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationwebsite/addorganizationwebsiteinvalid/AddOrganizationWebsiteInvalidTest.java
index ea310d1..ac8745b 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationwebsite/addorganizationwebsiteinvalid/AddOrganizationWebsiteInvalidTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationwebsite/addorganizationwebsiteinvalid/AddOrganizationWebsiteInvalidTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
