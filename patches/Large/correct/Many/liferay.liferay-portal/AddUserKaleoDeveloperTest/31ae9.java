diff --git a/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserKaleoDeveloperTest.java b/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserKaleoDeveloperTest.java
index eeafcff..7f2b70d 100644
--- a/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserKaleoDeveloperTest.java
+++ b/portal-web/test/com/liferay/portalweb/plugins/kaleo/dynamicdatalists/usecase/demo1/AddUserKaleoDeveloperTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
