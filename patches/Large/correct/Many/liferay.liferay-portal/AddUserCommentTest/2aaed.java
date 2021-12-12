diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/addusercomment/AddUserCommentTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/addusercomment/AddUserCommentTest.java
index 45bf078..d61be53 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/addusercomment/AddUserCommentTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/addusercomment/AddUserCommentTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
