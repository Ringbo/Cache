diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationwebsite/addorganizationwebsitemultiple/AddOrganizationWebsite1Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationwebsite/addorganizationwebsitemultiple/AddOrganizationWebsite1Test.java
index b600301..5b11570 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationwebsite/addorganizationwebsitemultiple/AddOrganizationWebsite1Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationwebsite/addorganizationwebsitemultiple/AddOrganizationWebsite1Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
