diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/mergeorganizationpage/AssertNotMergeOrganizationPageTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/mergeorganizationpage/AssertNotMergeOrganizationPageTest.java
index 26107d6..48de628 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/mergeorganizationpage/AssertNotMergeOrganizationPageTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/mergeorganizationpage/AssertNotMergeOrganizationPageTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
