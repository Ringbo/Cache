diff --git a/jodd-http/src/test/java/jodd/http/EchoTestServer.java b/jodd-http/src/test/java/jodd/http/EchoTestServer.java
index 3596b3f..53eefd3 100644
--- a/jodd-http/src/test/java/jodd/http/EchoTestServer.java
+++ b/jodd-http/src/test/java/jodd/http/EchoTestServer.java
@@ -9,7 +9,7 @@
 public class EchoTestServer extends NanoHTTPD {
 
 	public EchoTestServer() throws IOException {
-		super(80, new File("."));
+		super(8081, new File("."));
 	}
 
 	public String uri;
