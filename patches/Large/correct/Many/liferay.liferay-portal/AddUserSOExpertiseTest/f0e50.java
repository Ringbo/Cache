diff --git a/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersoexpertise/AddUserSOExpertiseTest.java b/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersoexpertise/AddUserSOExpertiseTest.java
index 12f340b..424f801 100644
--- a/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersoexpertise/AddUserSOExpertiseTest.java
+++ b/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersoexpertise/AddUserSOExpertiseTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
