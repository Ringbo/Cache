diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdefaultuserassociationssite/AssertDefaultUserAssociationsSiteTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdefaultuserassociationssite/AssertDefaultUserAssociationsSiteTest.java
index 05c6553..a49123a 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdefaultuserassociationssite/AssertDefaultUserAssociationsSiteTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdefaultuserassociationssite/AssertDefaultUserAssociationsSiteTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
