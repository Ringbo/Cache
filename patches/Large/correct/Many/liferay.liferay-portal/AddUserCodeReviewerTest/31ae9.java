diff --git a/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserCodeReviewerTest.java b/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserCodeReviewerTest.java
index 3c66084..98ed063 100644
--- a/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserCodeReviewerTest.java
+++ b/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserCodeReviewerTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
