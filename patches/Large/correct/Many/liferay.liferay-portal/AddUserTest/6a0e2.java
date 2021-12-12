diff --git a/portal-web/test/com/liferay/portalweb/portlet/blogs/blogsentry/userviewsaveasdraftblogsentry/AddUserTest.java b/portal-web/test/com/liferay/portalweb/portlet/blogs/blogsentry/userviewsaveasdraftblogsentry/AddUserTest.java
index 10b200c..977bc61 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/blogs/blogsentry/userviewsaveasdraftblogsentry/AddUserTest.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/blogs/blogsentry/userviewsaveasdraftblogsentry/AddUserTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
