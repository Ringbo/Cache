diff --git a/core-client/src/main/java/org/glassfish/jersey/client/filter/HttpDigestAuthFilter.java b/core-client/src/main/java/org/glassfish/jersey/client/filter/HttpDigestAuthFilter.java
index ed8348e..a591f0c 100644
--- a/core-client/src/main/java/org/glassfish/jersey/client/filter/HttpDigestAuthFilter.java
+++ b/core-client/src/main/java/org/glassfish/jersey/client/filter/HttpDigestAuthFilter.java
@@ -239,7 +239,7 @@
 		append(sb, "algorithm", digest_algorithm.toString(), false);
 		append(sb, "qop", digest_qop.toString(), false);
 
-		String uri = requestContext.getUri().getPath();
+		String uri = requestContext.getUri().getRawPath();
 		append(sb, "uri", uri);
 
 		String ha1;
