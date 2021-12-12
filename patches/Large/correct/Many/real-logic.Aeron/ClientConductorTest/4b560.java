diff --git a/aeron-core/src/test/java/uk/co/real_logic/aeron/ClientConductorTest.java b/aeron-core/src/test/java/uk/co/real_logic/aeron/ClientConductorTest.java
index 91c345e..14ba02d 100644
--- a/aeron-core/src/test/java/uk/co/real_logic/aeron/ClientConductorTest.java
+++ b/aeron-core/src/test/java/uk/co/real_logic/aeron/ClientConductorTest.java
@@ -94,7 +94,7 @@
     private ClientConductor conductor;
     private ConductorErrorHandler errorHandler;
     private AtomicArray<Subscription> subscriberChannels;
-    private MediaDriverReceiver receiver;
+    private MediaDriverBroadcastReceiver receiver;
 
     @Before
     public void setUp() throws Exception
@@ -137,7 +137,7 @@
                 return null;
             }).when(signal).await(anyLong());
 
-        receiver = new MediaDriverReceiver(toClientReceiver);
+        receiver = new MediaDriverBroadcastReceiver(toClientReceiver);
 
         conductor = new ClientConductor(
             receiver,
