diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AssignUserSubOrganization2Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AssignUserSubOrganization2Test.java
index 0d3bec4..6c297ae 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AssignUserSubOrganization2Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/usecase/demo1/AssignUserSubOrganization2Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
