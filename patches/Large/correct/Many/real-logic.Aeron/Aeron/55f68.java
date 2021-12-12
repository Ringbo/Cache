diff --git a/aeron-client/src/main/java/io/aeron/Aeron.java b/aeron-client/src/main/java/io/aeron/Aeron.java
index 2fa9758..91f7f3c 100644
--- a/aeron-client/src/main/java/io/aeron/Aeron.java
+++ b/aeron-client/src/main/java/io/aeron/Aeron.java
@@ -223,13 +223,13 @@
     }
 
     /**
-     * Add a {@link Publication} for publishing messages to subscribers.
+     * Add a {@link Publication} for publishing messages to subscribers. The publication returned is threadsafe.
      *
      * @param channel  for receiving the messages known to the media layer.
      * @param streamId within the channel scope.
-     * @return the new Publication.
+     * @return the a new {@link ConcurrentPublication}.
      */
-    public Publication addPublication(final String channel, final int streamId)
+    public ConcurrentPublication addPublication(final String channel, final int streamId)
     {
         clientLock.lock();
         try
