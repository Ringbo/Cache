diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddress/AddOrganizationAddressTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddress/AddOrganizationAddressTest.java
index 639d1b1..9b0f8d7 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddress/AddOrganizationAddressTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddress/AddOrganizationAddressTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
