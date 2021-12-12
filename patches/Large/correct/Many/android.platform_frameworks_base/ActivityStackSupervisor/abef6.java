diff --git a/services/core/java/com/android/server/am/ActivityStackSupervisor.java b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
index 507d76d..ad80394 100644
--- a/services/core/java/com/android/server/am/ActivityStackSupervisor.java
+++ b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
@@ -3412,7 +3412,7 @@
             pinnedStack.moveActivityToStack(r);
         }
 
-        resizeStackLocked(PINNED_STACK_ID, bounds, PRESERVE_WINDOWS, true);
+        resizeStackLocked(PINNED_STACK_ID, bounds, !PRESERVE_WINDOWS, true);
 
         // The task might have already been running and its visibility needs to be synchronized with
         // the visibility of the stack / windows.
