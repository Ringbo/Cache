diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationphonenumber/addorganizationphonenumbermultiple/AddOrganizationPhoneNumber1Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationphonenumber/addorganizationphonenumbermultiple/AddOrganizationPhoneNumber1Test.java
index 6666b7b..2ce05a6 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationphonenumber/addorganizationphonenumbermultiple/AddOrganizationPhoneNumber1Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationphonenumber/addorganizationphonenumbermultiple/AddOrganizationPhoneNumber1Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
