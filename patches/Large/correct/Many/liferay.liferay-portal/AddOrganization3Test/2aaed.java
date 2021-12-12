diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationmultiple/AddOrganization3Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationmultiple/AddOrganization3Test.java
index 9fb26d2..a177827 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationmultiple/AddOrganization3Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationmultiple/AddOrganization3Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
