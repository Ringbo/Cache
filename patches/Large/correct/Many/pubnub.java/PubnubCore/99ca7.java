diff --git a/java/srcPubnubApi/com/pubnub/api/PubnubCore.java b/java/srcPubnubApi/com/pubnub/api/PubnubCore.java
index b76e57f..818919b 100644
--- a/java/srcPubnubApi/com/pubnub/api/PubnubCore.java
+++ b/java/srcPubnubApi/com/pubnub/api/PubnubCore.java
@@ -975,7 +975,7 @@
                 "data"
         };
         if (state != null) parameters.put("state", state.toString());
-        SubscriptionItem ch = (SubscriptionItem) channelSubscriptions.getItem(channel);
+        SubscriptionItem ch = channelSubscriptions.getItem(channel);
         if (ch != null) {
             try {
                 channelSubscriptions.state.put(channel, state);
@@ -1993,7 +1993,7 @@
 
     private void callErrorCallbacks(String[] channelList, PubnubError error) {
         for (String channel : channelList) {
-            Callback cb = ((SubscriptionItem) channelSubscriptions.getItem(channel)).callback;
+            Callback cb = channelSubscriptions.getItem(channel).callback;
             cb.errorCallback(channel, error);
         }
     }
@@ -2042,7 +2042,7 @@
          */
 
         for (String channel : channelList) {
-            SubscriptionItem channelObj = channelSubscriptions.getItem(channel);
+            Channel channelObj = (Channel) channelSubscriptions.getItem(channel);
 
             if (channelObj == null) {
                 Channel ch = new Channel(channel, callback);
@@ -2052,7 +2052,7 @@
         }
 
         for (String group : groupList) {
-            SubscriptionItem channelGroupObj = channelGroupSubscriptions.getItem(group);
+            ChannelGroup channelGroupObj = (ChannelGroup) channelGroupSubscriptions.getItem(group);
 
             if (channelGroupObj == null) {
                 ChannelGroup chg = new ChannelGroup(group, callback, this);
