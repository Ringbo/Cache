diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddressmultiple/AddOrganizationAddress3Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddressmultiple/AddOrganizationAddress3Test.java
index 2beca66..595ced8 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddressmultiple/AddOrganizationAddress3Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddressmultiple/AddOrganizationAddress3Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
