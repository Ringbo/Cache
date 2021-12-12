diff --git a/aeron-client/src/main/java/io/aeron/ClientConductor.java b/aeron-client/src/main/java/io/aeron/ClientConductor.java
index a5e13a5..1d570ae 100644
--- a/aeron-client/src/main/java/io/aeron/ClientConductor.java
+++ b/aeron-client/src/main/java/io/aeron/ClientConductor.java
@@ -158,7 +158,7 @@
         errorHandler.onError(ex);
     }
 
-    Publication addPublication(final String channel, final int streamId)
+    ConcurrentPublication addPublication(final String channel, final int streamId)
     {
         ensureOpen();
 
@@ -166,7 +166,7 @@
         final long registrationId = driverProxy.addPublication(channel, streamId);
         awaitResponse(registrationId);
 
-        return (Publication)resourceByRegIdMap.get(registrationId);
+        return (ConcurrentPublication)resourceByRegIdMap.get(registrationId);
     }
 
     ExclusivePublication addExclusivePublication(final String channel, final int streamId)
