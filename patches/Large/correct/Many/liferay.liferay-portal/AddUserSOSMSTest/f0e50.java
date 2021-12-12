diff --git a/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersosms/AddUserSOSMSTest.java b/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersosms/AddUserSOSMSTest.java
index 380683c..64f87ed 100644
--- a/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersosms/AddUserSOSMSTest.java
+++ b/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersosms/AddUserSOSMSTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
