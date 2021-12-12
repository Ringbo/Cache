diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/AddUser2Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/AddUser2Test.java
index 0e3d2ad..109bc39 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/AddUser2Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/AddUser2Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
