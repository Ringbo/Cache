diff --git a/src/net/majorkernelpanic/streaming/hw/EncoderDebugger.java b/src/net/majorkernelpanic/streaming/hw/EncoderDebugger.java
index aaabe57..32423da 100644
--- a/src/net/majorkernelpanic/streaming/hw/EncoderDebugger.java
+++ b/src/net/majorkernelpanic/streaming/hw/EncoderDebugger.java
@@ -678,7 +678,7 @@
 			elapsed = timestamp() - now;
 		}
 
-		check(mPPS != null & mSPS != null, "Could not determine the SPS & PPS.");
+		check(mPPS != null && mSPS != null, "Could not determine the SPS & PPS.");
 		mB64PPS = Base64.encodeToString(mPPS, 0, mPPS.length, Base64.NO_WRAP);
 		mB64SPS = Base64.encodeToString(mSPS, 0, mSPS.length, Base64.NO_WRAP);
 
