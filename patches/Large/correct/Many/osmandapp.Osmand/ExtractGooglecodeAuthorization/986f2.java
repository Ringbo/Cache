diff --git a/DataExtractionOSM/src/net/osmand/data/index/ExtractGooglecodeAuthorization.java b/DataExtractionOSM/src/net/osmand/data/index/ExtractGooglecodeAuthorization.java
index 00ec65c..3da700f 100644
--- a/DataExtractionOSM/src/net/osmand/data/index/ExtractGooglecodeAuthorization.java
+++ b/DataExtractionOSM/src/net/osmand/data/index/ExtractGooglecodeAuthorization.java
@@ -111,7 +111,7 @@
 		if (debug) {
 			System.out.println("Connected to:" + url.toString());
 			System.out.println("-- Data sent:\n" + data.toString());
-			System.our.ptintln("--");
+			System.out.ptintln("--");
 		}
 
 		// Get the response
@@ -187,7 +187,7 @@
 		return conn;
 	}
 
-	private static StringBuilder readAnswer(InputStream input)
+	private StringBuilder readAnswer(InputStream input)
 			throws IOException, UnsupportedEncodingException {
 		StringBuilder responseBody = new StringBuilder();
 		InputStream i = input;
