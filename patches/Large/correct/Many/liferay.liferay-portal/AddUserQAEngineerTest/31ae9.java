diff --git a/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserQAEngineerTest.java b/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserQAEngineerTest.java
index e365f0d..2036e0f 100644
--- a/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserQAEngineerTest.java
+++ b/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserQAEngineerTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
