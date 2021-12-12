diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterdefaultuserassociationsusergroup/EnterDefaultUserAssociationsUserGroupTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterdefaultuserassociationsusergroup/EnterDefaultUserAssociationsUserGroupTest.java
index b50c27c..8d7b52e 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterdefaultuserassociationsusergroup/EnterDefaultUserAssociationsUserGroupTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterdefaultuserassociationsusergroup/EnterDefaultUserAssociationsUserGroupTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
