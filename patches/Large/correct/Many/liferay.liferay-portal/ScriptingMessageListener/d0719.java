diff --git a/portal-impl/src/com/liferay/portal/scheduler/messaging/ScriptingMessageListener.java b/portal-impl/src/com/liferay/portal/scheduler/messaging/ScriptingMessageListener.java
index 8672a3f..4bf836c 100644
--- a/portal-impl/src/com/liferay/portal/scheduler/messaging/ScriptingMessageListener.java
+++ b/portal-impl/src/com/liferay/portal/scheduler/messaging/ScriptingMessageListener.java
@@ -34,7 +34,8 @@
 		String language = (String)message.get(SchedulerEngine.LANGUAGE);
 		String script = (String)message.get(SchedulerEngine.SCRIPT);
 
-		ScriptingUtil.exec(null, inputObjects, language, script);
+		ScriptingUtil.exec(
+			null, inputObjects, language, script, new String[0]);
 	}
 
 }
\ No newline at end of file
