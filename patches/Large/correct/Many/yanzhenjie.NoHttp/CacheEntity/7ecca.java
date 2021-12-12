diff --git a/nohttp/src/main/java/com/yanzhenjie/nohttp/cache/CacheEntity.java b/nohttp/src/main/java/com/yanzhenjie/nohttp/cache/CacheEntity.java
index 6126382..9c22a11 100644
--- a/nohttp/src/main/java/com/yanzhenjie/nohttp/cache/CacheEntity.java
+++ b/nohttp/src/main/java/com/yanzhenjie/nohttp/cache/CacheEntity.java
@@ -182,7 +182,7 @@
      * @return the localExpire.
      */
     public String getLocalExpireString() {
-        return Long.toOctalString(localExpire);
+        return Long.toString(localExpire);
     }
 
     /**
