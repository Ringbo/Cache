diff --git a/src/main/java/com/android/volley/Request.java b/src/main/java/com/android/volley/Request.java
index 0db074b..6234aa5 100644
--- a/src/main/java/com/android/volley/Request.java
+++ b/src/main/java/com/android/volley/Request.java
@@ -306,7 +306,7 @@
      * Returns the cache key for this request.  By default, this is the URL.
      */
     public String getCacheKey() {
-        return getUrl();
+        return getOriginUrl();
     }
 
     /**
