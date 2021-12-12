diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/AssignUserCommunitySiteTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/AssignUserCommunitySiteTest.java
index 7403284..39933fa 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/AssignUserCommunitySiteTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/AssignUserCommunitySiteTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
