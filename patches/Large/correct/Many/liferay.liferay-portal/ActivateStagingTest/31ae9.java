diff --git a/portal-web/test/com/liferay/portalweb/plugins/kaleo/myworkflowtasks/workflowtask/userviewwebcontentassignedtomyrolesstaging/ActivateStagingTest.java b/portal-web/test/com/liferay/portalweb/plugins/kaleo/myworkflowtasks/workflowtask/userviewwebcontentassignedtomyrolesstaging/ActivateStagingTest.java
index 724e1f8..5987ca5 100644
--- a/portal-web/test/com/liferay/portalweb/plugins/kaleo/myworkflowtasks/workflowtask/userviewwebcontentassignedtomyrolesstaging/ActivateStagingTest.java
+++ b/portal-web/test/com/liferay/portalweb/plugins/kaleo/myworkflowtasks/workflowtask/userviewwebcontentassignedtomyrolesstaging/ActivateStagingTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
