diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddOrganizationCategorizationTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddOrganizationCategorizationTest.java
index 6442d49..a82f70a4 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddOrganizationCategorizationTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddOrganizationCategorizationTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
