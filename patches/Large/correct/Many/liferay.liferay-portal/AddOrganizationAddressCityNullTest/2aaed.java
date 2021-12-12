diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddresscitynull/AddOrganizationAddressCityNullTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddresscitynull/AddOrganizationAddressCityNullTest.java
index 7e48d26..999ecd8 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddresscitynull/AddOrganizationAddressCityNullTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/addorganizationaddresscitynull/AddOrganizationAddressCityNullTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
