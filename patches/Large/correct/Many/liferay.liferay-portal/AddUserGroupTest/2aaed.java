diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdefaultuserassociationsusergroup/AddUserGroupTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdefaultuserassociationsusergroup/AddUserGroupTest.java
index 3fdd3f5..3197f8e 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdefaultuserassociationsusergroup/AddUserGroupTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdefaultuserassociationsusergroup/AddUserGroupTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
