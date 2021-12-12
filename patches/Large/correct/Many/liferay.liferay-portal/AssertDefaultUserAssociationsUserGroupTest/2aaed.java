diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdefaultuserassociationsusergroup/AssertDefaultUserAssociationsUserGroupTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdefaultuserassociationsusergroup/AssertDefaultUserAssociationsUserGroupTest.java
index cc6e388..39d0262 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdefaultuserassociationsusergroup/AssertDefaultUserAssociationsUserGroupTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdefaultuserassociationsusergroup/AssertDefaultUserAssociationsUserGroupTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
