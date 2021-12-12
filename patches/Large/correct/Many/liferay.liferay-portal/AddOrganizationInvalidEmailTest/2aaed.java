diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddOrganizationInvalidEmailTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddOrganizationInvalidEmailTest.java
index e352bcc..48da622 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddOrganizationInvalidEmailTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddOrganizationInvalidEmailTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
