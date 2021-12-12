diff --git a/DataExtractionOSM/src/net/osmand/data/index/ExtractGooglecodeAuthorization.java b/DataExtractionOSM/src/net/osmand/data/index/ExtractGooglecodeAuthorization.java
index 3da700f..cf61464 100644
--- a/DataExtractionOSM/src/net/osmand/data/index/ExtractGooglecodeAuthorization.java
+++ b/DataExtractionOSM/src/net/osmand/data/index/ExtractGooglecodeAuthorization.java
@@ -111,7 +111,7 @@
 		if (debug) {
 			System.out.println("Connected to:" + url.toString());
 			System.out.println("-- Data sent:\n" + data.toString());
-			System.out.ptintln("--");
+			System.out.println("--");
 		}
 
 		// Get the response
