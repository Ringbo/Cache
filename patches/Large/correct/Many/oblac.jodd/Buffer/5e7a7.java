diff --git a/jodd-http/src/main/java/jodd/http/Buffer.java b/jodd-http/src/main/java/jodd/http/Buffer.java
index afbeb37..fa5c626 100644
--- a/jodd-http/src/main/java/jodd/http/Buffer.java
+++ b/jodd-http/src/main/java/jodd/http/Buffer.java
@@ -204,7 +204,7 @@
 						}
 
 						// writes remaining chunk
-						StreamUtil.copy(inputStream, out, remaining);
+						StreamUtil.copy(inputStream, out, chunk);
 
 						remaining -= chunk;
 						step += chunk;
