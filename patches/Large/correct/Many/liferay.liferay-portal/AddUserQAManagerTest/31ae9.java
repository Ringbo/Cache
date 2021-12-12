diff --git a/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserQAManagerTest.java b/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserQAManagerTest.java
index 1778035..019e6a5 100644
--- a/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserQAManagerTest.java
+++ b/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserQAManagerTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
