diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpasswordduplicate/AddUserPasswordDuplicateTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpasswordduplicate/AddUserPasswordDuplicateTest.java
index 9fc8fe3..ebcf206 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpasswordduplicate/AddUserPasswordDuplicateTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpasswordduplicate/AddUserPasswordDuplicateTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
