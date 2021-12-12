diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/advancedsearchorganizationaddress/AdvancedSearchOrganizationAddressStreetTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/advancedsearchorganizationaddress/AdvancedSearchOrganizationAddressStreetTest.java
index 50f22a6..45725f0 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/advancedsearchorganizationaddress/AdvancedSearchOrganizationAddressStreetTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/advancedsearchorganizationaddress/AdvancedSearchOrganizationAddressStreetTest.java
@@ -37,7 +37,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
