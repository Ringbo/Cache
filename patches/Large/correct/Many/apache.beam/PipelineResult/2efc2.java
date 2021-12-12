diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/PipelineResult.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/PipelineResult.java
index d7774bb..cd09c4d 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/PipelineResult.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/PipelineResult.java
@@ -84,7 +84,7 @@
   // TODO: method to retrieve error messages.
 
   /** Named constants for common values for the job state. */
-  public enum State {
+  enum State {
 
     /** The job state could not be obtained or was not specified. */
     UNKNOWN(false, false),
@@ -111,7 +111,7 @@
 
     private final boolean hasReplacement;
 
-    private State(boolean terminal, boolean hasReplacement) {
+    State(boolean terminal, boolean hasReplacement) {
       this.terminal = terminal;
       this.hasReplacement = hasReplacement;
     }
