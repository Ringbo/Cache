diff --git a/aeron-mediadriver/src/main/java/uk/co/real_logic/aeron/mediadriver/ReceiverProxy.java b/aeron-mediadriver/src/main/java/uk/co/real_logic/aeron/mediadriver/ReceiverProxy.java
index 3805f9a..dcd8a37 100644
--- a/aeron-mediadriver/src/main/java/uk/co/real_logic/aeron/mediadriver/ReceiverProxy.java
+++ b/aeron-mediadriver/src/main/java/uk/co/real_logic/aeron/mediadriver/ReceiverProxy.java
@@ -31,14 +31,14 @@
         this.commandQueue = commandQueue;
     }
 
-    public boolean addSubscription(final String destination, final long channelIds)
+    public boolean addSubscription(final String destination, final long channelId)
     {
-        return commandQueue.offer(new AddSubscriptionCmd(destination, channelIds));
+        return commandQueue.offer(new AddSubscriptionCmd(destination, channelId));
     }
 
-    public boolean removeSubscription(final String destination, final long channelIds)
+    public boolean removeSubscription(final String destination, final long channelId)
     {
-        return commandQueue.offer(new RemoveSubscriptionCmd(destination, channelIds));
+        return commandQueue.offer(new RemoveSubscriptionCmd(destination, channelId));
     }
 
     public boolean newConnectedSubscription(final NewConnectedSubscriptionCmd e)
