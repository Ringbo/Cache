diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganization/AddOrganizationTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganization/AddOrganizationTest.java
index f8e3ebc..a427772 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganization/AddOrganizationTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganization/AddOrganizationTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
