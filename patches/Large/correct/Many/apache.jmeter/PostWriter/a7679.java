diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/PostWriter.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/PostWriter.java
index c668bc2..19e21cc 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/PostWriter.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/PostWriter.java
@@ -92,7 +92,7 @@
 			 throws IOException
 	{
 		// If filename was specified then send the post using multipart syntax
-		String filename = sampler.getFileField();
+		String filename = sampler.getFilename();
 		if ((filename != null) && (filename.trim().length() > 0))
 		{
 			OutputStream out = connection.getOutputStream();//new FileOutputStream("c:\\data\\experiment.txt");//new ByteArrayOutputStream();//
