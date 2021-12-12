diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/AssignUser2UserGroup2Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/AssignUser2UserGroup2Test.java
index 7d4e774..4527def 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/AssignUser2UserGroup2Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/AssignUser2UserGroup2Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
