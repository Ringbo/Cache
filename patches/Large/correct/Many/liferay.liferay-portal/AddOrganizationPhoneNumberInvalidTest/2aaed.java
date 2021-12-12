diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationphonenumber/addorganizationphonenumberinvalid/AddOrganizationPhoneNumberInvalidTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationphonenumber/addorganizationphonenumberinvalid/AddOrganizationPhoneNumberInvalidTest.java
index ad2570d..b1c6d73 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationphonenumber/addorganizationphonenumberinvalid/AddOrganizationPhoneNumberInvalidTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationphonenumber/addorganizationphonenumberinvalid/AddOrganizationPhoneNumberInvalidTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
