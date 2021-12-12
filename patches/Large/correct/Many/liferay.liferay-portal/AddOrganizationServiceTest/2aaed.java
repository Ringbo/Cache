diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationservice/addorganizationservice/AddOrganizationServiceTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationservice/addorganizationservice/AddOrganizationServiceTest.java
index 8616099..4b9931b 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationservice/addorganizationservice/AddOrganizationServiceTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationservice/addorganizationservice/AddOrganizationServiceTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
