diff --git a/storm-server/src/main/java/org/apache/storm/daemon/supervisor/Slot.java b/storm-server/src/main/java/org/apache/storm/daemon/supervisor/Slot.java
index 59fea1e..3fd8cad 100644
--- a/storm-server/src/main/java/org/apache/storm/daemon/supervisor/Slot.java
+++ b/storm-server/src/main/java/org/apache/storm/daemon/supervisor/Slot.java
@@ -1025,7 +1025,7 @@
                 state = MachineState.RUNNING;
             }
 
-            this.startTime = System.currentTimeMillis();
+            this.startTime = Time.currentTimeMillis();
             this.newAssignment = newAssignment;
             this.pendingLocalization = null;
             this.pendingDownload = null;
