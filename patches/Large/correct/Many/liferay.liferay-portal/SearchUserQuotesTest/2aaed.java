diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/SearchUserQuotesTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/SearchUserQuotesTest.java
index 61f0aa5..023449b 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/SearchUserQuotesTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/SearchUserQuotesTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
