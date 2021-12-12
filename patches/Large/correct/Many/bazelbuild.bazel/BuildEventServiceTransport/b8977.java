diff --git a/src/main/java/com/google/devtools/build/lib/buildeventservice/BuildEventServiceTransport.java b/src/main/java/com/google/devtools/build/lib/buildeventservice/BuildEventServiceTransport.java
index 0db5212..36a4aa1 100644
--- a/src/main/java/com/google/devtools/build/lib/buildeventservice/BuildEventServiceTransport.java
+++ b/src/main/java/com/google/devtools/build/lib/buildeventservice/BuildEventServiceTransport.java
@@ -109,7 +109,7 @@
   /** Contains all events should be sent ordered by sequence number. */
   private final BlockingDeque<InternalOrderedBuildEvent> pendingSend;
   /** Holds the result status of the BuildEventStreamProtos BuildFinished event. */
-  private Result invocationResult;
+  private volatile Result invocationResult;
   /** Used to block until all events have been uploaded. */
   private ListenableFuture<?> uploadComplete;
   /** Used to ensure that the close logic is only invoked once. */
@@ -317,7 +317,7 @@
   }
 
   @Override
-  public synchronized void sendBuildEvent(BuildEvent event, final ArtifactGroupNamer namer) {
+  public void sendBuildEvent(BuildEvent event, final ArtifactGroupNamer namer) {
     if (event instanceof BuildCompletingEvent) {
       BuildCompletingEvent completingEvent = (BuildCompletingEvent) event;
       if (completingEvent.getExitCode() != null
@@ -402,7 +402,7 @@
     }
   }
 
-  private synchronized Result getInvocationResult() {
+  private Result getInvocationResult() {
     return invocationResult;
   }
 
