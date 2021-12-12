diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AssertEntriesTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AssertEntriesTest.java
index 79f774c..20336f3 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AssertEntriesTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AssertEntriesTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
