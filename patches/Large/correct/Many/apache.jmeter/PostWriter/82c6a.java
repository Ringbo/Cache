diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/PostWriter.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/PostWriter.java
index 11ad68e..e58d3cb 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/PostWriter.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/PostWriter.java
@@ -94,7 +94,7 @@
 		((HttpURLConnection)connection).setRequestMethod("POST");
 
 		// If filename was specified then send the post using multipart syntax
-		String filename = sampler.getFilename();
+		String filename = sampler.getFileField();
 		if ((filename != null) && (filename.trim().length() > 0))
 		{
 			connection.setRequestProperty("Content-type", "multipart/form-data; boundary=" + BOUNDARY);
