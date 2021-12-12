diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationmultiple/AddOrganization1Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationmultiple/AddOrganization1Test.java
index 5530b2f..22c35fd 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationmultiple/AddOrganization1Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationmultiple/AddOrganization1Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
