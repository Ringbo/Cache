diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationphonenumber/addorganizationphonenumbermultiple/AddOrganizationPhoneNumber3Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationphonenumber/addorganizationphonenumbermultiple/AddOrganizationPhoneNumber3Test.java
index e24b93d..46394b2 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationphonenumber/addorganizationphonenumbermultiple/AddOrganizationPhoneNumber3Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationphonenumber/addorganizationphonenumbermultiple/AddOrganizationPhoneNumber3Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
