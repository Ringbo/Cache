diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/advancedsearchorganizationaddress/AdvancedSearchOrganizationAddressCityTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/advancedsearchorganizationaddress/AdvancedSearchOrganizationAddressCityTest.java
index c954efc..969c7b3 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/advancedsearchorganizationaddress/AdvancedSearchOrganizationAddressCityTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/advancedsearchorganizationaddress/AdvancedSearchOrganizationAddressCityTest.java
@@ -37,7 +37,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
