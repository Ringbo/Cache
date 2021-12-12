diff --git a/runners/core-java/src/main/java/org/apache/beam/runners/core/triggers/FinishedTriggers.java b/runners/core-java/src/main/java/org/apache/beam/runners/core/triggers/FinishedTriggers.java
index 1098716..95367c1 100644
--- a/runners/core-java/src/main/java/org/apache/beam/runners/core/triggers/FinishedTriggers.java
+++ b/runners/core-java/src/main/java/org/apache/beam/runners/core/triggers/FinishedTriggers.java
@@ -25,20 +25,20 @@
   /**
    * Returns {@code true} if the trigger is finished.
    */
-  public boolean isFinished(ExecutableTriggerStateMachine trigger);
+  boolean isFinished(ExecutableTriggerStateMachine trigger);
 
   /**
    * Sets the fact that the trigger is finished.
    */
-  public void setFinished(ExecutableTriggerStateMachine trigger, boolean value);
+  void setFinished(ExecutableTriggerStateMachine trigger, boolean value);
 
   /**
    * Sets the trigger and all of its subtriggers to unfinished.
    */
-  public void clearRecursively(ExecutableTriggerStateMachine trigger);
+  void clearRecursively(ExecutableTriggerStateMachine trigger);
 
   /**
    * Create an independent copy of this mutable {@link FinishedTriggers}.
    */
-  public FinishedTriggers copy();
+  FinishedTriggers copy();
 }
