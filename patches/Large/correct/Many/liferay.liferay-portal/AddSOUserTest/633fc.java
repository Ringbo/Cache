diff --git a/portal-web/test/com/liferay/portalweb/socialofficehome/activities/mbentryactivity/sousviewmbentryactivityconnections/AddSOUserTest.java b/portal-web/test/com/liferay/portalweb/socialofficehome/activities/mbentryactivity/sousviewmbentryactivityconnections/AddSOUserTest.java
index c4596f4..8493e77 100644
--- a/portal-web/test/com/liferay/portalweb/socialofficehome/activities/mbentryactivity/sousviewmbentryactivityconnections/AddSOUserTest.java
+++ b/portal-web/test/com/liferay/portalweb/socialofficehome/activities/mbentryactivity/sousviewmbentryactivityconnections/AddSOUserTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
