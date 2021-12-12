diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddressstreetnull/AddOrganizationAddressStreetNullTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddressstreetnull/AddOrganizationAddressStreetNullTest.java
index d2f58b3..0234223 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddressstreetnull/AddOrganizationAddressStreetNullTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddressstreetnull/AddOrganizationAddressStreetNullTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
