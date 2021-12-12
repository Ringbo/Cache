diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/advancedsearchorganizationaddress/AdvancedSearchOrganizationAddressZipTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/advancedsearchorganizationaddress/AdvancedSearchOrganizationAddressZipTest.java
index 9261585..f2ef664 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/advancedsearchorganizationaddress/AdvancedSearchOrganizationAddressZipTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationaddress/advancedsearchorganizationaddress/AdvancedSearchOrganizationAddressZipTest.java
@@ -37,7 +37,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
