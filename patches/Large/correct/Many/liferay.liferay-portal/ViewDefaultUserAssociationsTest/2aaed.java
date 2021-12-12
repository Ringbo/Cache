diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewdefaultuserassociations/ViewDefaultUserAssociationsTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewdefaultuserassociations/ViewDefaultUserAssociationsTest.java
index 5c96e9f..d952ebf 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewdefaultuserassociations/ViewDefaultUserAssociationsTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewdefaultuserassociations/ViewDefaultUserAssociationsTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
