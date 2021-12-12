diff --git a/engine/src/main/java/org/terasology/logic/delay/DelayedActionSystem.java b/engine/src/main/java/org/terasology/logic/delay/DelayedActionSystem.java
index c100bd5..6ade51a 100644
--- a/engine/src/main/java/org/terasology/logic/delay/DelayedActionSystem.java
+++ b/engine/src/main/java/org/terasology/logic/delay/DelayedActionSystem.java
@@ -104,7 +104,7 @@
         }
         long scheduleTime = time.getGameTimeInMs() + event.getDelay();
         DelayedActionComponent delayedComponent = new DelayedActionComponent(scheduleTime, event.getActionId());
-        entity.saveComponent(delayedComponent);
+        entity.addComponent(delayedComponent);
     }
 
     private static final class DelayedOperation {
