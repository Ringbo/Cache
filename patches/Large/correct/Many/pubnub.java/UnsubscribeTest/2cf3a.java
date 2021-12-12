diff --git a/java/srcTest/com/pubnub/api/UnsubscribeTest.java b/java/srcTest/com/pubnub/api/UnsubscribeTest.java
index fe2b1c9..80c31a6 100644
--- a/java/srcTest/com/pubnub/api/UnsubscribeTest.java
+++ b/java/srcTest/com/pubnub/api/UnsubscribeTest.java
@@ -78,7 +78,7 @@
 
         // check offline
         pubnub2.unsubscribeAll();
-        Thread.sleep(1000);
+        Thread.sleep(3000);
 
         pubnub.channelGroupHereNow(group, cb1);
         latch1.await(10, TimeUnit.SECONDS);
@@ -99,7 +99,7 @@
 
         // check offline
         pubnub2.channelGroupUnsubscribeAllGroups();
-        Thread.sleep(1000);
+        Thread.sleep(3000);
 
         pubnub.channelGroupHereNow(group, cb1);
         latch1.await(10, TimeUnit.SECONDS);
@@ -121,7 +121,7 @@
 
         // check offline
         pubnub2.channelGroupUnsubscribe(group);
-        Thread.sleep(1000);
+        Thread.sleep(3000);
 
         pubnub.channelGroupHereNow(group, cb1);
         latch1.await(10, TimeUnit.SECONDS);
@@ -143,7 +143,7 @@
 
         // check offline
         pubnub2.channelGroupUnsubscribe(new String[]{group});
-        Thread.sleep(1000);
+        Thread.sleep(3000);
 
         pubnub.channelGroupHereNow(group, cb1);
         latch1.await(10, TimeUnit.SECONDS);
