diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
index 4d04b05..54089e2 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
@@ -725,7 +725,7 @@
         }
 
         // To avoid excessive synchronization, we allow resources.size() to get larger that maxSuspendResource
-        if (maxSuspendResource.get() > 0 && resources.size() <= maxSuspendResource.get()) {
+        if (maxSuspendResource.get() > 0 && resources.size() >= maxSuspendResource.get()) {
             // Resume the first in.
             if (policy == POLICY.FIFO) {
                 // TODO handle null return from poll()
