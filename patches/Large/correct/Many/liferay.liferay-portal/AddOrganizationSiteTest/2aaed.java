diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddOrganizationSiteTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddOrganizationSiteTest.java
index 43c5cea..10cabf3 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddOrganizationSiteTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddOrganizationSiteTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
