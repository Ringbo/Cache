diff --git a/java/srcPubnubApi/srcCore/com/pubnub/api/PubnubCoreAsync.java b/java/srcPubnubApi/srcCore/com/pubnub/api/PubnubCoreAsync.java
index 71e91dc..f536af3 100644
--- a/java/srcPubnubApi/srcCore/com/pubnub/api/PubnubCoreAsync.java
+++ b/java/srcPubnubApi/srcCore/com/pubnub/api/PubnubCoreAsync.java
@@ -34,7 +34,7 @@
     private int HEARTBEAT = 320;
     private volatile int PRESENCE_HB_INTERVAL = 0;
 
-    private boolean V2 = false;
+    private boolean V2 = true;
 
     public void setV2(boolean v2) {
         this.V2 = v2;
@@ -1265,7 +1265,7 @@
                     String channel = messageObj.getString("c");
                     String sub_channel = (messageObj.isNull("b")) ? null : messageObj.getString("b");
 
-                    String message = messageObj.getString("d");
+                    Object message = messageObj.get("d");
 
                     SubscriptionItem chobj = null;
                     if (channelSubscriptions != null && sub_channel != null)
