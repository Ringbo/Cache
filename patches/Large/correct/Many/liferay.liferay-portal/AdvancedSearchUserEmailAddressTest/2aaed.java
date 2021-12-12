diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserEmailAddressTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserEmailAddressTest.java
index 929f6be..c92654d 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserEmailAddressTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserEmailAddressTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
