diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddOrganizationServicesTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddOrganizationServicesTest.java
index 8d32de7..acdba108 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddOrganizationServicesTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddOrganizationServicesTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
