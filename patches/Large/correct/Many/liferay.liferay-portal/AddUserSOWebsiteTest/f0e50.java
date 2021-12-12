diff --git a/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersowebsite/AddUserSOWebsiteTest.java b/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersowebsite/AddUserSOWebsiteTest.java
index 8a312d6..c14c027 100644
--- a/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersowebsite/AddUserSOWebsiteTest.java
+++ b/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersowebsite/AddUserSOWebsiteTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
