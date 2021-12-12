diff --git a/src/test/java/doc/htreemap_cache_space_limit2.java b/src/test/java/doc/htreemap_cache_space_limit2.java
index ac74282..47c5f27 100644
--- a/src/test/java/doc/htreemap_cache_space_limit2.java
+++ b/src/test/java/doc/htreemap_cache_space_limit2.java
@@ -10,7 +10,7 @@
     public static void main(String[] args) {
         DB db = DBMaker.memoryDB().make();
         //a
-        HTreeMap cache = db.createHashMap("cache")
+        HTreeMap cache = db.hashMapCreate("cache")
                 .expireStoreSize(128)
                 .makeOrGet();
         //z
