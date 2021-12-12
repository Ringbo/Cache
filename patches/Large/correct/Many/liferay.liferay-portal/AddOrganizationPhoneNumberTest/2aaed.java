diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationphonenumber/addorganizationphonenumber/AddOrganizationPhoneNumberTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationphonenumber/addorganizationphonenumber/AddOrganizationPhoneNumberTest.java
index 3a4d5df..0e25472 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationphonenumber/addorganizationphonenumber/AddOrganizationPhoneNumberTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationphonenumber/addorganizationphonenumber/AddOrganizationPhoneNumberTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
