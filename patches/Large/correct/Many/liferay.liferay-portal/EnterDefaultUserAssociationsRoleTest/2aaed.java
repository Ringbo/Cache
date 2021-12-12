diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterdefaultuserassociationsrole/EnterDefaultUserAssociationsRoleTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterdefaultuserassociationsrole/EnterDefaultUserAssociationsRoleTest.java
index 97f4554..73893ba 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterdefaultuserassociationsrole/EnterDefaultUserAssociationsRoleTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterdefaultuserassociationsrole/EnterDefaultUserAssociationsRoleTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
