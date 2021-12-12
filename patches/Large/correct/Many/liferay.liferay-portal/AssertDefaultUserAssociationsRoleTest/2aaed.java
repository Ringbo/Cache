diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdefaultuserassociationsrole/AssertDefaultUserAssociationsRoleTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdefaultuserassociationsrole/AssertDefaultUserAssociationsRoleTest.java
index 7554ee1..24f86f7 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdefaultuserassociationsrole/AssertDefaultUserAssociationsRoleTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdefaultuserassociationsrole/AssertDefaultUserAssociationsRoleTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
