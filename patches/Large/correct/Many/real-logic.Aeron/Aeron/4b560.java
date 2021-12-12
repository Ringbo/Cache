diff --git a/aeron-core/src/main/java/uk/co/real_logic/aeron/Aeron.java b/aeron-core/src/main/java/uk/co/real_logic/aeron/Aeron.java
index f2dedf2..d5c8f3d 100644
--- a/aeron-core/src/main/java/uk/co/real_logic/aeron/Aeron.java
+++ b/aeron-core/src/main/java/uk/co/real_logic/aeron/Aeron.java
@@ -66,7 +66,7 @@
         final ConductorErrorHandler errorHandler = new ConductorErrorHandler(ctx.invalidDestinationHandler);
         final MediaDriverProxy mediaDriverProxy = new MediaDriverProxy(ctx.toDriverBuffer);
         final Signal correlationSignal = new Signal();
-        final MediaDriverReceiver receiver = new MediaDriverReceiver(ctx.toClientBuffer);
+        final MediaDriverBroadcastReceiver receiver = new MediaDriverBroadcastReceiver(ctx.toClientBuffer);
 
         conductor = new ClientConductor(
             receiver,
