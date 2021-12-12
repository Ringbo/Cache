diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/ReactivateUser2Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/ReactivateUser2Test.java
index 9180208..4bc9c40 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/ReactivateUser2Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/ReactivateUser2Test.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
@@ -132,7 +132,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
