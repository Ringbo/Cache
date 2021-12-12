diff --git a/src/main/java/com/google/devtools/build/lib/remote/ConcurrentMapFactory.java b/src/main/java/com/google/devtools/build/lib/remote/ConcurrentMapFactory.java
index 3461673..6867c22 100644
--- a/src/main/java/com/google/devtools/build/lib/remote/ConcurrentMapFactory.java
+++ b/src/main/java/com/google/devtools/build/lib/remote/ConcurrentMapFactory.java
@@ -39,8 +39,8 @@
 import org.apache.http.util.EntityUtils;
 
 /**
- * A factory class for providing a {@link ConcurrentMap} objects to be used with
- * {@link ConcurrentMapActionCache} objects. The underlying maps can be Hazelcast or RestUrl based.
+ * A factory class for providing a {@link ConcurrentMap} objects to be used with {@link
+ * ConcurrentMapActionCache} objects. The underlying maps can be Hazelcast or RestUrl based.
  */
 public final class ConcurrentMapFactory {
 
@@ -136,7 +136,11 @@
         HttpResponse response = client.execute(put);
         int statusCode = response.getStatusLine().getStatusCode();
 
-        if (HttpStatus.SC_OK != statusCode) {
+        // Accept more than SC_OK to be compatible with Nginx WebDav module.
+        if (HttpStatus.SC_OK != statusCode
+            && HttpStatus.SC_ACCEPTED != statusCode
+            && HttpStatus.SC_CREATED != statusCode
+            && HttpStatus.SC_NO_CONTENT != statusCode) {
           throw new RuntimeException("PUT failed with status code " + statusCode);
         }
       } catch (IOException e) {
