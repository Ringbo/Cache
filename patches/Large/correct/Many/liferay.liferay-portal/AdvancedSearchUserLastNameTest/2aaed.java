diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserLastNameTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserLastNameTest.java
index dc8ba0a..1dc49fa 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserLastNameTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserLastNameTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
