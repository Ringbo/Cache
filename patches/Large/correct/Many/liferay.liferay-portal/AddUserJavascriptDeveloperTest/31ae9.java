diff --git a/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserJavascriptDeveloperTest.java b/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserJavascriptDeveloperTest.java
index 276c7bd..c5e71ef 100644
--- a/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserJavascriptDeveloperTest.java
+++ b/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserJavascriptDeveloperTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
