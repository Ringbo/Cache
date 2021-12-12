diff --git a/src/net/majorkernelpanic/streaming/audio/AudioQuality.java b/src/net/majorkernelpanic/streaming/audio/AudioQuality.java
index 0fce004..13c2305 100644
--- a/src/net/majorkernelpanic/streaming/audio/AudioQuality.java
+++ b/src/net/majorkernelpanic/streaming/audio/AudioQuality.java
@@ -46,7 +46,7 @@
 
 	public boolean equals(AudioQuality quality) {
 		if (quality==null) return false;
-		return (quality.samplingRate == this.samplingRate 				&
+		return (quality.samplingRate == this.samplingRate     &&
 				quality.bitRate == this.bitRate);
 	}
 
