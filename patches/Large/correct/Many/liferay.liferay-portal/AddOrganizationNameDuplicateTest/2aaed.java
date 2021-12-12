diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationnameduplicate/AddOrganizationNameDuplicateTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationnameduplicate/AddOrganizationNameDuplicateTest.java
index 3690b32..6f247e4 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationnameduplicate/AddOrganizationNameDuplicateTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationnameduplicate/AddOrganizationNameDuplicateTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
