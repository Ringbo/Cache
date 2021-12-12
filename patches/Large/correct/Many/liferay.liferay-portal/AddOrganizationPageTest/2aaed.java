diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/addorganizationpage/AddOrganizationPageTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/addorganizationpage/AddOrganizationPageTest.java
index 9e42646..051d0d9 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/addorganizationpage/AddOrganizationPageTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/addorganizationpage/AddOrganizationPageTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
