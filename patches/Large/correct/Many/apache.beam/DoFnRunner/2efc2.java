diff --git a/runners/core-java/src/main/java/org/apache/beam/runners/core/DoFnRunner.java b/runners/core-java/src/main/java/org/apache/beam/runners/core/DoFnRunner.java
index ac64969..c84122b 100644
--- a/runners/core-java/src/main/java/org/apache/beam/runners/core/DoFnRunner.java
+++ b/runners/core-java/src/main/java/org/apache/beam/runners/core/DoFnRunner.java
@@ -31,19 +31,19 @@
   /**
    * Prepares and calls {@link OldDoFn#startBundle}.
    */
-  public void startBundle();
+  void startBundle();
 
   /**
    * Calls {@link OldDoFn#processElement} with a {@link ProcessContext} containing the current
    * element.
    */
-  public void processElement(WindowedValue<InputT> elem);
+  void processElement(WindowedValue<InputT> elem);
 
   /**
    * Calls {@link OldDoFn#finishBundle} and performs additional tasks, such as
    * flushing in-memory states.
    */
-  public void finishBundle();
+  void finishBundle();
 
   /**
    * An internal interface for signaling that a {@link OldDoFn} requires late data dropping.
