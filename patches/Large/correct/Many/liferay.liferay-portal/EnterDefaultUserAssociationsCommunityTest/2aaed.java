diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterdefaultuserassociationscommunity/EnterDefaultUserAssociationsCommunityTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterdefaultuserassociationscommunity/EnterDefaultUserAssociationsCommunityTest.java
index ec5f965..543ffa7 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterdefaultuserassociationscommunity/EnterDefaultUserAssociationsCommunityTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterdefaultuserassociationscommunity/EnterDefaultUserAssociationsCommunityTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
