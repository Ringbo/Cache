diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationservice/addorganizationservicemultiple/AddOrganizationService1Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationservice/addorganizationservicemultiple/AddOrganizationService1Test.java
index 2f9e0be..c475bf5 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationservice/addorganizationservicemultiple/AddOrganizationService1Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationservice/addorganizationservicemultiple/AddOrganizationService1Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
