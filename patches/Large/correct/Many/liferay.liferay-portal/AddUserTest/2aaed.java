diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/assignmembersorganization/AddUserTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/assignmembersorganization/AddUserTest.java
index 765bf3d..0ac5f1e 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/assignmembersorganization/AddUserTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/assignmembersorganization/AddUserTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
