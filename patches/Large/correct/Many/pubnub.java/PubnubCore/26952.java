diff --git a/java/srcPubnubApi/com/pubnub/api/PubnubCore.java b/java/srcPubnubApi/com/pubnub/api/PubnubCore.java
index cb60438..5b4e895 100644
--- a/java/srcPubnubApi/com/pubnub/api/PubnubCore.java
+++ b/java/srcPubnubApi/com/pubnub/api/PubnubCore.java
@@ -259,7 +259,7 @@
      * @return Current presence heartbeat value
      */
     public int getHeartbeat() {
-        return PRESENCE_HB_INTERVAL;
+        return HEARTBEAT;
     }
 
     /**
