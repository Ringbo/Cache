diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationemailaddress/addorganizationemailaddress/AddOrganizationEmailAddressTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationemailaddress/addorganizationemailaddress/AddOrganizationEmailAddressTest.java
index 77f8a6c..e99c04b 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationemailaddress/addorganizationemailaddress/AddOrganizationEmailAddressTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationemailaddress/addorganizationemailaddress/AddOrganizationEmailAddressTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
