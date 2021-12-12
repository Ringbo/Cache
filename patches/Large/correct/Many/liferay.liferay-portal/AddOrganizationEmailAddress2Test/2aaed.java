diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationemailaddress/addorganizationemailaddressmultiple/AddOrganizationEmailAddress2Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationemailaddress/addorganizationemailaddressmultiple/AddOrganizationEmailAddress2Test.java
index c7da5a1..a40e5d8 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationemailaddress/addorganizationemailaddressmultiple/AddOrganizationEmailAddress2Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationemailaddress/addorganizationemailaddressmultiple/AddOrganizationEmailAddress2Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
