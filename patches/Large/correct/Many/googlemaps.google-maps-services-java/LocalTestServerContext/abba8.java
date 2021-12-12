diff --git a/src/test/java/com/google/maps/LocalTestServerContext.java b/src/test/java/com/google/maps/LocalTestServerContext.java
index 73cb742..3b4626c 100644
--- a/src/test/java/com/google/maps/LocalTestServerContext.java
+++ b/src/test/java/com/google/maps/LocalTestServerContext.java
@@ -76,7 +76,7 @@
   private List<NameValuePair> parseQueryParamsFromRequestLine(String requestLine)
       throws URISyntaxException {
     // Extract the URL part from the HTTP request line
-    String[] chunks = requestLine.split("\\s");
+    String[] chunks = requestLine.split("\\s", -1);
     String url = chunks[1];
 
     return URLEncodedUtils.parse(new URI(url), Charset.forName("UTF-8"));
@@ -99,7 +99,7 @@
 
   public String path() throws InterruptedException {
     this.takeRequest();
-    return request.getPath().split("\\?")[0];
+    return request.getPath().split("\\?", -1)[0];
   }
 
   void assertParamValue(String expected, String paramName)
