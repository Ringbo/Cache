diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/adddldocumentsitestaginglocallivenodl/ActivateSiteStagingLocalLiveNoDLTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/adddldocumentsitestaginglocallivenodl/ActivateSiteStagingLocalLiveNoDLTest.java
index a9d4f0c..4519584 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/adddldocumentsitestaginglocallivenodl/ActivateSiteStagingLocalLiveNoDLTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/adddldocumentsitestaginglocallivenodl/ActivateSiteStagingLocalLiveNoDLTest.java
@@ -37,7 +37,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
