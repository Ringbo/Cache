diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/DeactivateUser2Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/DeactivateUser2Test.java
index edfe793..1962c8b 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/DeactivateUser2Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/DeactivateUser2Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
@@ -100,7 +100,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
