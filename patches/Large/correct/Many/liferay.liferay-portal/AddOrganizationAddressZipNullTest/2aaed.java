diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddresszipnull/AddOrganizationAddressZipNullTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddresszipnull/AddOrganizationAddressZipNullTest.java
index 59f2422..76540f6 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddresszipnull/AddOrganizationAddressZipNullTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddresszipnull/AddOrganizationAddressZipNullTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
