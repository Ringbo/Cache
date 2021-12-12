diff --git a/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/IgniteCacheSqlQueryMultiThreadedSelfTest.java b/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/IgniteCacheSqlQueryMultiThreadedSelfTest.java
index 20e8259..844826d 100644
--- a/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/IgniteCacheSqlQueryMultiThreadedSelfTest.java
+++ b/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/IgniteCacheSqlQueryMultiThreadedSelfTest.java
@@ -94,12 +94,12 @@
         GridTestUtils.runMultiThreaded(new Callable<Void>() {
             @Override public Void call() throws Exception {
                 for (int i = 0; i < 100; i++) {
-                    Iterator<Cache.Entry<Integer, Person>> iter =
-                        cache.query(new SqlQuery("age >= 0").setType("Person")).iterator();
+                    QueryCursor<Cache.Entry<Integer, Person>> qry =
+                        cache.query(new SqlQuery("age >= 0").setType("Person"));
 
                     int cnt = 0;
 
-                    while (iter.next() != null)
+                    for (Cache.Entry<Integer, Person> e : qry)
                         cnt++;
 
                     assertEquals(2000, cnt);
