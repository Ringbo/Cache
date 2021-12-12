diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationemailaddress/addorganizationemailaddressmultiple/AddOrganizationEmailAddress3Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationemailaddress/addorganizationemailaddressmultiple/AddOrganizationEmailAddress3Test.java
index be76b84..1676624 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationemailaddress/addorganizationemailaddressmultiple/AddOrganizationEmailAddress3Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationemailaddress/addorganizationemailaddressmultiple/AddOrganizationEmailAddress3Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
