diff --git a/src/test/java/doc/htreemap_cache_ttl_limit.java b/src/test/java/doc/htreemap_cache_ttl_limit.java
index d537bcf..a12f093 100644
--- a/src/test/java/doc/htreemap_cache_ttl_limit.java
+++ b/src/test/java/doc/htreemap_cache_ttl_limit.java
@@ -12,10 +12,11 @@
     public static void main(String[] args) {
         DB db = DBMaker.memoryDB().make();
         //a
-        // remove entries 1H after their last modification, or 10 minutes after last get()
+        // remove entries 1 after their last modification,
+        // or 10 minutes after last get()
         HTreeMap cache = db.hashMapCreate("cache")
-                .expireAfterAccess(1, TimeUnit.HOURS)
-                .expireAfterWrite(10, TimeUnit.MINUTES)
+                .expireAfterWrite(1, TimeUnit.HOURS)
+                .expireAfterAccess(10, TimeUnit.MINUTES)
                 .makeOrGet();
         //z
     }
