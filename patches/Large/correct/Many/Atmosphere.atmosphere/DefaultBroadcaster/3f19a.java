diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
index e5b87c1..197c0d9 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
@@ -600,7 +600,7 @@
             asyncWriteFuture = new Future<?>[threads];
             for (int i = 0; i < threads; i++) {
                 notifierFuture[i] = bc.getExecutorService().submit(getBroadcastHandler());
-                asyncWriteFuture[i] = bc.getExecutorService().submit(getAsyncWriteHandler(uniqueWriteQueue));
+                asyncWriteFuture[i] = bc.getAsyncWriteService().submit(getAsyncWriteHandler(uniqueWriteQueue));
             }
         } else {
             notifierFuture[0] = bc.getExecutorService().submit(getBroadcastHandler());
