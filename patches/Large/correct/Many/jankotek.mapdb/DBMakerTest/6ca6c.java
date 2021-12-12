diff --git a/src/test/java/org/mapdb/DBMakerTest.java b/src/test/java/org/mapdb/DBMakerTest.java
index e55e424..c435b5d 100644
--- a/src/test/java/org/mapdb/DBMakerTest.java
+++ b/src/test/java/org/mapdb/DBMakerTest.java
@@ -151,7 +151,7 @@
                 .cacheSize(1000)
                 .make();
         verifyDB(db);
-        assertEquals(1000, ((CacheHashTable) db.engine).cacheMaxSize);
+        assertEquals(1024, ((CacheHashTable) db.engine).cacheMaxSize);
     }
 
     @Test public void read_only() throws IOException {
