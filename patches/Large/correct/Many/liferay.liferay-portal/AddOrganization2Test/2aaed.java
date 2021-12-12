diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationmultiple/AddOrganization2Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationmultiple/AddOrganization2Test.java
index 31ce5f5..65e6c4c 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationmultiple/AddOrganization2Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationmultiple/AddOrganization2Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
