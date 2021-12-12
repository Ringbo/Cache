diff --git a/OsmAnd/src/net/osmand/plus/voice/TTSCommandPlayerImpl.java b/OsmAnd/src/net/osmand/plus/voice/TTSCommandPlayerImpl.java
index 55b444c..b688084 100644
--- a/OsmAnd/src/net/osmand/plus/voice/TTSCommandPlayerImpl.java
+++ b/OsmAnd/src/net/osmand/plus/voice/TTSCommandPlayerImpl.java
@@ -144,7 +144,7 @@
 	    i.putExtra("messageType", PEBBLE_ALERT);
 	    i.putExtra("sender", "OsmAnd");
 	    i.putExtra("notificationData", notificationData);
-	    if (cxt != null) {
+		if (ctx != null) {
 		ctx.sendBroadcast(i);
 		log.info("Send message to pebble " + bld.toString());
 	    }
