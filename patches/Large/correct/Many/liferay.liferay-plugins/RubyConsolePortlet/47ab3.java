diff --git a/portlets/ruby-console-portlet/docroot/WEB-INF/src/com/liferay/rubyconsole/portlet/RubyConsolePortlet.java b/portlets/ruby-console-portlet/docroot/WEB-INF/src/com/liferay/rubyconsole/portlet/RubyConsolePortlet.java
index 0b9a2aa..7c14f9c 100644
--- a/portlets/ruby-console-portlet/docroot/WEB-INF/src/com/liferay/rubyconsole/portlet/RubyConsolePortlet.java
+++ b/portlets/ruby-console-portlet/docroot/WEB-INF/src/com/liferay/rubyconsole/portlet/RubyConsolePortlet.java
@@ -52,7 +52,7 @@
 			ResourceRequest resourceRequest, ResourceResponse resourceResponse)
 		throws IOException {
 
-		String cmd = ParamUtil.getString(req, Constants.CMD);
+		String cmd = ParamUtil.getString(resourceRequest, Constants.CMD);
 
 		if (cmd.equals("exec")) {
 			String consoleInput = ParamUtil.getString(
