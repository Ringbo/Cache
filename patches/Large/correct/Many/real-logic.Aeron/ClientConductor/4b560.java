diff --git a/aeron-core/src/main/java/uk/co/real_logic/aeron/conductor/ClientConductor.java b/aeron-core/src/main/java/uk/co/real_logic/aeron/conductor/ClientConductor.java
index 609a479..6091cd0 100644
--- a/aeron-core/src/main/java/uk/co/real_logic/aeron/conductor/ClientConductor.java
+++ b/aeron-core/src/main/java/uk/co/real_logic/aeron/conductor/ClientConductor.java
@@ -50,7 +50,7 @@
 
     private static final long NO_CORRELATION_ID = -1;
 
-    private final MediaDriverReceiver receiver;
+    private final MediaDriverBroadcastReceiver mediaDriverBroadcastReceiver;
     private final BufferUsageStrategy bufferUsage;
     private final AtomicArray<Publication> publications = new AtomicArray<>();
     private final AtomicArray<Subscription> subscriptions = new AtomicArray<>();
@@ -68,7 +68,7 @@
     private boolean operationSucceeded = false; // Guarded by this
     private RegistrationException registrationException; // Guarded by this
 
-    public ClientConductor(final MediaDriverReceiver receiver,
+    public ClientConductor(final MediaDriverBroadcastReceiver mediaDriverBroadcastReceiver,
                            final ConductorErrorHandler errorHandler,
                            final BufferUsageStrategy bufferUsageStrategy,
                            final AtomicBuffer counterValuesBuffer,
@@ -83,7 +83,7 @@
         this.counterValuesBuffer = counterValuesBuffer;
         this.correlationSignal = correlationSignal;
         this.mediaDriverProxy = mediaDriverProxy;
-        this.receiver = receiver;
+        this.mediaDriverBroadcastReceiver = mediaDriverBroadcastReceiver;
         this.bufferUsage = bufferUsageStrategy;
         this.awaitTimeout = awaitTimeout;
         this.publicationWindow = publicationWindow;
@@ -91,7 +91,7 @@
 
     public int doWork()
     {
-        return receiver.receive(this, activeCorrelationId) + performBufferMaintenance();
+        return mediaDriverBroadcastReceiver.receive(this, activeCorrelationId) + performBufferMaintenance();
     }
 
     public void close()
