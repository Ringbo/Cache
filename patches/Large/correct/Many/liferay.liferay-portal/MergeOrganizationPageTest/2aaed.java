diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/mergeorganizationpage/MergeOrganizationPageTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/mergeorganizationpage/MergeOrganizationPageTest.java
index 6327b70..5b8f28b 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/mergeorganizationpage/MergeOrganizationPageTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/mergeorganizationpage/MergeOrganizationPageTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
