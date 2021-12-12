diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/DeleteSubOrganization2Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/DeleteSubOrganization2Test.java
index 7da9b5a..48b3bc1 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/DeleteSubOrganization2Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/DeleteSubOrganization2Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
