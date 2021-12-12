diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationnamenull/AddOrganizationNameNullTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationnamenull/AddOrganizationNameNullTest.java
index 086206b..157de12 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationnamenull/AddOrganizationNameNullTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/addorganizationnamenull/AddOrganizationNameNullTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
