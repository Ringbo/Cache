diff --git a/queue-load-leveling/src/main/java/org/queue/load/leveling/Task.java b/queue-load-leveling/src/main/java/org/queue/load/leveling/Task.java
index f01a153..8796f5a 100644
--- a/queue-load-leveling/src/main/java/org/queue/load/leveling/Task.java
+++ b/queue-load-leveling/src/main/java/org/queue/load/leveling/Task.java
@@ -26,5 +26,5 @@
  * 
 */
 public interface Task {
-  public void submit(Message msg);
+  void submit(Message msg);
 }
