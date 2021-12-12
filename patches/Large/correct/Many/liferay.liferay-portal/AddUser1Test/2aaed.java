diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/AddUser1Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/AddUser1Test.java
index 35de3fa..e583460 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/AddUser1Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/AddUser1Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
