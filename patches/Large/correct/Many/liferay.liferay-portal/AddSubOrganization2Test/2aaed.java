diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddSubOrganization2Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddSubOrganization2Test.java
index 022874d..3508cc1 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddSubOrganization2Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AddSubOrganization2Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
