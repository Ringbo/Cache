diff --git a/java/srcPubnubApi/srcCore/com/pubnub/api/PubnubCoreAsync.java b/java/srcPubnubApi/srcCore/com/pubnub/api/PubnubCoreAsync.java
index 7eaa350..f0c1f56 100644
--- a/java/srcPubnubApi/srcCore/com/pubnub/api/PubnubCoreAsync.java
+++ b/java/srcPubnubApi/srcCore/com/pubnub/api/PubnubCoreAsync.java
@@ -1283,7 +1283,7 @@
                     if (chobj == null && channelSubscriptions != null)
                         chobj = channelSubscriptions.getItem(channel);
 
-                    if (channel.indexOf("-pnpres") > 0) {
+                    if (chobj == null && channel.indexOf("-pnpres") > 0) {
                         chobj = channelSubscriptions.getItem(channel);
                         channel = PubnubUtil.splitString(channel, "-pnpres")[0];
 
