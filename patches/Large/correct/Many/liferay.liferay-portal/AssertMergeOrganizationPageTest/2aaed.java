diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/mergeorganizationpage/AssertMergeOrganizationPageTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/mergeorganizationpage/AssertMergeOrganizationPageTest.java
index ce94779..ba69e88 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/mergeorganizationpage/AssertMergeOrganizationPageTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/mergeorganizationpage/AssertMergeOrganizationPageTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
