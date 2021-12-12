diff --git a/src/main/java/org/tron/common/logsfilter/EventPluginLoader.java b/src/main/java/org/tron/common/logsfilter/EventPluginLoader.java
index 05f5962..c13e9d5 100644
--- a/src/main/java/org/tron/common/logsfilter/EventPluginLoader.java
+++ b/src/main/java/org/tron/common/logsfilter/EventPluginLoader.java
@@ -112,7 +112,7 @@
             else if (EventPluginConfig.CONTRACTLOG_TRIGGER_NAME.equalsIgnoreCase(triggerConfig.getTriggerName())){
                 if (triggerConfig.isEnabled()){
                     setPluginTopic(Trigger.CONTRACTLOG_TRIGGER, triggerConfig.getTopic());
-                    transactionLogTriggerEnable = true;
+                    contractLogTriggerEnable = true;
                 }else {
                     setPluginTopic(Trigger.CONTRACTLOG_TRIGGER, "");
                 }
