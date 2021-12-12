diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationservice/addorganizationservicemultiple/AddOrganizationService2Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationservice/addorganizationservicemultiple/AddOrganizationService2Test.java
index 24a7fce..5de2402 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationservice/addorganizationservicemultiple/AddOrganizationService2Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationservice/addorganizationservicemultiple/AddOrganizationService2Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
