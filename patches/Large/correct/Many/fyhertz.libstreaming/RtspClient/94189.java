diff --git a/src/net/majorkernelpanic/streaming/rtsp/RtspClient.java b/src/net/majorkernelpanic/streaming/rtsp/RtspClient.java
index cf745fb..09fe75d 100644
--- a/src/net/majorkernelpanic/streaming/rtsp/RtspClient.java
+++ b/src/net/majorkernelpanic/streaming/rtsp/RtspClient.java
@@ -214,7 +214,7 @@
 	}
 	
 	public boolean isStreaming() {
-		return mState==STATE_STARTED|mState==STATE_STARTING;
+		return mState==STATE_STARTED||mState==STATE_STARTING;
 	}
 
 	/**
