diff --git a/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersoinstantmessenger/AddUserSOInstantMessengerTest.java b/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersoinstantmessenger/AddUserSOInstantMessengerTest.java
index 152f699..aba7a72 100644
--- a/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersoinstantmessenger/AddUserSOInstantMessengerTest.java
+++ b/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersoinstantmessenger/AddUserSOInstantMessengerTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
