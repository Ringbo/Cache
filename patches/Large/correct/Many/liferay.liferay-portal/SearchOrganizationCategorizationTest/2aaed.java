diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/SearchOrganizationCategorizationTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/SearchOrganizationCategorizationTest.java
index 06331e2..d8d5a6d 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/SearchOrganizationCategorizationTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/SearchOrganizationCategorizationTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
