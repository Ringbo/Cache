diff --git a/javamelody-core/src/main/java/net/bull/javamelody/JobInformations.java b/javamelody-core/src/main/java/net/bull/javamelody/JobInformations.java
index cb75a18..b6da3f2 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/JobInformations.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/JobInformations.java
@@ -90,7 +90,7 @@
 				simpleTriggerRepeatInterval = ((SimpleTrigger) trigger).getRepeatInterval(); // NOPMD
 			}
 			jobPaused = jobPaused
-					&& scheduler.getTriggerState(trigger.getName(), trigger.getGroup()) != Trigger.STATE_PAUSED;
+					&& scheduler.getTriggerState(trigger.getName(), trigger.getGroup()) == Trigger.STATE_PAUSED;
 		}
 		this.repeatInterval = simpleTriggerRepeatInterval;
 		this.cronExpression = cronTriggerExpression;
