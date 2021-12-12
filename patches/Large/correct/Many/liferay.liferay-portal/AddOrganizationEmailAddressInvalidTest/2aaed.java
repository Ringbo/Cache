diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationemailaddress/addorganizationemailaddressinvalid/AddOrganizationEmailAddressInvalidTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationemailaddress/addorganizationemailaddressinvalid/AddOrganizationEmailAddressInvalidTest.java
index 8595bfe..6dc3d31 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationemailaddress/addorganizationemailaddressinvalid/AddOrganizationEmailAddressInvalidTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationemailaddress/addorganizationemailaddressinvalid/AddOrganizationEmailAddressInvalidTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
