diff --git a/lib/src/main/java/com/github/kevinsawicki/http/HttpRequest.java b/lib/src/main/java/com/github/kevinsawicki/http/HttpRequest.java
index daa43e9..06e6d45 100644
--- a/lib/src/main/java/com/github/kevinsawicki/http/HttpRequest.java
+++ b/lib/src/main/java/com/github/kevinsawicki/http/HttpRequest.java
@@ -3129,7 +3129,7 @@
    * @return this request
    */
   public HttpRequest followRedirects(final boolean followRedirects) {
-    getConnection().setFollowRedirects(followRedirects);
+    getConnection().setInstanceFollowRedirects(followRedirects);
     return this;
   }
 }
