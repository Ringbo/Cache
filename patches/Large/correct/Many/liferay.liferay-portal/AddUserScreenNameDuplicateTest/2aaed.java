diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennameduplicate/AddUserScreenNameDuplicateTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennameduplicate/AddUserScreenNameDuplicateTest.java
index 7afaa46..3302ce5 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennameduplicate/AddUserScreenNameDuplicateTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennameduplicate/AddUserScreenNameDuplicateTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
