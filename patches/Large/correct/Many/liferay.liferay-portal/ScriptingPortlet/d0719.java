diff --git a/util-bridges/src/com/liferay/util/bridges/scripting/ScriptingPortlet.java b/util-bridges/src/com/liferay/util/bridges/scripting/ScriptingPortlet.java
index 5e8a700..077cbfb 100644
--- a/util-bridges/src/com/liferay/util/bridges/scripting/ScriptingPortlet.java
+++ b/util-bridges/src/com/liferay/util/bridges/scripting/ScriptingPortlet.java
@@ -207,7 +207,8 @@
 			ScriptingHelperUtil.getPortletObjects(
 				portletConfig, portletContext, portletRequest, portletResponse);
 
-		ScriptingUtil.exec(null, portletObjects, language, script);
+		ScriptingUtil.exec(
+			null, portletObjects, language, script, new String[0]);
 	}
 
 	protected void doRender(
