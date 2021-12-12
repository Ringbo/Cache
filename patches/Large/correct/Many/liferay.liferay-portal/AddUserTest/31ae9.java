diff --git a/portal-web/test/com/liferay/portalweb/plugins/kaleo/myworkflowtasks/workflowtask/userviewwebcontentassignedtomyrolesstaging/AddUserTest.java b/portal-web/test/com/liferay/portalweb/plugins/kaleo/myworkflowtasks/workflowtask/userviewwebcontentassignedtomyrolesstaging/AddUserTest.java
index 47b72cf..0bbf522 100644
--- a/portal-web/test/com/liferay/portalweb/plugins/kaleo/myworkflowtasks/workflowtask/userviewwebcontentassignedtomyrolesstaging/AddUserTest.java
+++ b/portal-web/test/com/liferay/portalweb/plugins/kaleo/myworkflowtasks/workflowtask/userviewwebcontentassignedtomyrolesstaging/AddUserTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
