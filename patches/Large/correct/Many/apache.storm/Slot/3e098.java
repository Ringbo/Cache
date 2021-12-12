diff --git a/storm-server/src/main/java/org/apache/storm/daemon/supervisor/Slot.java b/storm-server/src/main/java/org/apache/storm/daemon/supervisor/Slot.java
index 1dda41c..b0116e2 100644
--- a/storm-server/src/main/java/org/apache/storm/daemon/supervisor/Slot.java
+++ b/storm-server/src/main/java/org/apache/storm/daemon/supervisor/Slot.java
@@ -381,7 +381,7 @@
      * @return the updated dynamicState
      */
     private static DynamicState filterChangingBlobsFor(DynamicState dynamicState, final LocalAssignment assignment) {
-        if (!dynamicState.changingBlobs.isEmpty()) {
+        if (dynamicState.changingBlobs.isEmpty()) {
             return dynamicState;
         }
 
