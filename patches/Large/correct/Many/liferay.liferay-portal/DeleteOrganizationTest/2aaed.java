diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/deleteorganization/DeleteOrganizationTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/deleteorganization/DeleteOrganizationTest.java
index 18faff1..3d281c3 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/deleteorganization/DeleteOrganizationTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/deleteorganization/DeleteOrganizationTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
