diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampleResult.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampleResult.java
index 9908150..ede933b 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampleResult.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampleResult.java
@@ -40,8 +40,10 @@
 
     /** Set of all HTTP methods, that have no body */
     private static final Set<String> METHODS_WITHOUT_BODY = new HashSet<>(
-            Arrays.asList(HTTPConstants.GET, HTTPConstants.HEAD,
-                    HTTPConstants.OPTIONS, HTTPConstants.DELETE,
+            Arrays.asList(
+                    HTTPConstants.GET,
+                    HTTPConstants.HEAD,
+                    HTTPConstants.OPTIONS,
                     HTTPConstants.TRACE));
 
     private String cookies = ""; // never null
@@ -148,7 +150,7 @@
             sb.append(' ');
             sb.append(u.toString());
             sb.append('\n');
-            // Include request body if it is a post or put or patch
+            // Include request body if it can have one
             if (!METHODS_WITHOUT_BODY.contains(method)) {
                 sb.append("\n").append(method).append(" data:\n");
                 sb.append(queryString);
