diff --git a/portal-web/test/com/liferay/portalweb/portlet/webcontentdisplay/webcontent/addportletscopecurrentpagewcwebcontentwcd/AddSiteTest.java b/portal-web/test/com/liferay/portalweb/portlet/webcontentdisplay/webcontent/addportletscopecurrentpagewcwebcontentwcd/AddSiteTest.java
index 258fcaa..b4b1282 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/webcontentdisplay/webcontent/addportletscopecurrentpagewcwebcontentwcd/AddSiteTest.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/webcontentdisplay/webcontent/addportletscopecurrentpagewcwebcontentwcd/AddSiteTest.java
@@ -30,7 +30,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
