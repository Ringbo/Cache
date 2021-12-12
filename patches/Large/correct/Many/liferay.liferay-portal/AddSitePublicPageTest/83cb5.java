diff --git a/portal-web/test/com/liferay/portalweb/portlet/webcontentdisplay/webcontent/addportletscopecurrentpagewcwebcontentwcd/AddSitePublicPageTest.java b/portal-web/test/com/liferay/portalweb/portlet/webcontentdisplay/webcontent/addportletscopecurrentpagewcwebcontentwcd/AddSitePublicPageTest.java
index 4078b99..608e52a 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/webcontentdisplay/webcontent/addportletscopecurrentpagewcwebcontentwcd/AddSitePublicPageTest.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/webcontentdisplay/webcontent/addportletscopecurrentpagewcwebcontentwcd/AddSitePublicPageTest.java
@@ -35,7 +35,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
