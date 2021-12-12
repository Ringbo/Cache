diff --git a/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/AddUserTest.java b/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/AddUserTest.java
index 4042a84..a4ffb14 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/AddUserTest.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/AddUserTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
