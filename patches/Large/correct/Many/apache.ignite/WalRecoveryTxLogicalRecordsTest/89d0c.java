diff --git a/modules/pds/src/test/java/org/apache/ignite/cache/database/db/file/WalRecoveryTxLogicalRecordsTest.java b/modules/pds/src/test/java/org/apache/ignite/cache/database/db/file/WalRecoveryTxLogicalRecordsTest.java
index 8b78c21..844f2f5 100644
--- a/modules/pds/src/test/java/org/apache/ignite/cache/database/db/file/WalRecoveryTxLogicalRecordsTest.java
+++ b/modules/pds/src/test/java/org/apache/ignite/cache/database/db/file/WalRecoveryTxLogicalRecordsTest.java
@@ -525,7 +525,7 @@
         try {
             pageSize = 1024;
 
-            extraCcfg = new CacheConfiguration();
+            extraCcfg = new CacheConfiguration(CACHE2_NAME);
             extraCcfg.setAffinity(new RendezvousAffinityFunction(false, PARTS));
 
             Ignite ignite = startGrid(0);
@@ -536,7 +536,7 @@
             dbMgr.enableCheckpoints(false).get();
 
             IgniteCache<Integer, IndexedValue> cache1 = ignite.cache(CACHE_NAME);
-            IgniteCache<Object, Object> cache2 = ignite.cache(null);
+            IgniteCache<Object, Object> cache2 = ignite.cache(CACHE2_NAME);
 
             final int KEYS1 = 100;
 
@@ -592,7 +592,7 @@
         try {
             pageSize = 1024;
             checkpointFreq = 100L;
-            extraCcfg = new CacheConfiguration();
+            extraCcfg = new CacheConfiguration(CACHE2_NAME);
             extraCcfg.setAffinity(new RendezvousAffinityFunction(false, 32));
 
             List<Integer> pages = null;
@@ -603,12 +603,12 @@
                 Ignite ignite = startGrid(0);
 
                 if (pages != null) {
-                    List<Integer> curPags = allocatedPages(ignite, null);
+                    List<Integer> curPags = allocatedPages(ignite, CACHE2_NAME);
 
                     assertEquals("Iter = " + iter, pages, curPags);
                 }
 
-                final IgniteCache<Integer, Object> cache = ignite.cache(null);
+                final IgniteCache<Integer, Object> cache = ignite.cache(CACHE2_NAME);
 
                 final int ops = ThreadLocalRandom.current().nextInt(10) + 10;
 
@@ -629,7 +629,7 @@
                     }
                 }, 10, "update");
 
-                pages = allocatedPages(ignite, null);
+                pages = allocatedPages(ignite, CACHE2_NAME);
 
                 Ignition.stop(ignite.name(), false); //will make checkpoint
             }
@@ -646,7 +646,7 @@
     private void recoveryNoPageLost(boolean checkpoint) throws Exception {
         try {
             pageSize = 1024;
-            extraCcfg = new CacheConfiguration();
+            extraCcfg = new CacheConfiguration(CACHE2_NAME);
             extraCcfg.setAffinity(new RendezvousAffinityFunction(false, 32));
 
             List<Integer> pages = null;
@@ -665,17 +665,17 @@
                     dbMgr.enableCheckpoints(false).get();
 
                 if (pages != null) {
-                    List<Integer> curPags = allocatedPages(ignite, null);
+                    List<Integer> curPags = allocatedPages(ignite, CACHE2_NAME);
 
                     assertEquals(pages, curPags);
                 }
 
-                IgniteCache<Integer, Object> cache = ignite.cache(null);
+                IgniteCache<Integer, Object> cache = ignite.cache(CACHE2_NAME);
 
                 for (int i = 0; i < 128; i++)
                     cache.put(cnt.incrementAndGet(), new byte[256 + iter * 100]);
 
-                pages = allocatedPages(ignite, null);
+                pages = allocatedPages(ignite, CACHE2_NAME);
 
                 ignite.close();
             }
@@ -722,12 +722,12 @@
     public void testFreeListRecovery() throws Exception {
         try {
             pageSize = 1024;
-            extraCcfg = new CacheConfiguration();
+            extraCcfg = new CacheConfiguration(CACHE2_NAME);
 
             Ignite ignite = startGrid(0);
 
             IgniteCache<Integer, IndexedValue> cache1 = ignite.cache(CACHE_NAME);
-            IgniteCache<Object, Object> cache2 = ignite.cache(null);
+            IgniteCache<Object, Object> cache2 = ignite.cache(CACHE2_NAME);
 
             final int KEYS1 = 2048;
 
@@ -752,16 +752,16 @@
             }
 
             Map<Integer, T2<Map<Integer, long[]>, int[]>> cache1_1 = getFreeListData(ignite, CACHE_NAME);
-            Map<Integer, T2<Map<Integer, long[]>, int[]>> cache2_1 = getFreeListData(ignite, null);
+            Map<Integer, T2<Map<Integer, long[]>, int[]>> cache2_1 = getFreeListData(ignite, CACHE2_NAME);
             T2<long[], Integer> rl1_1 = getReuseListData(ignite, CACHE_NAME);
-            T2<long[], Integer> rl2_1 = getReuseListData(ignite, null);
+            T2<long[], Integer> rl2_1 = getReuseListData(ignite, CACHE2_NAME);
 
             ignite.close();
 
             ignite = startGrid(0);
 
             cache1 = ignite.cache(CACHE_NAME);
-            cache2 = ignite.cache(null);
+            cache2 = ignite.cache(CACHE2_NAME);
 
             for (int i = 0; i < KEYS1; i++) {
                 cache1.get(i);
@@ -769,9 +769,9 @@
             }
 
             Map<Integer, T2<Map<Integer, long[]>, int[]>> cache1_2 = getFreeListData(ignite, CACHE_NAME);
-            Map<Integer, T2<Map<Integer, long[]>, int[]>> cache2_2 = getFreeListData(ignite, null);
+            Map<Integer, T2<Map<Integer, long[]>, int[]>> cache2_2 = getFreeListData(ignite, CACHE2_NAME);
             T2<long[], Integer> rl1_2 = getReuseListData(ignite, CACHE_NAME);
-            T2<long[], Integer> rl2_2 = getReuseListData(ignite, null);
+            T2<long[], Integer> rl2_2 = getReuseListData(ignite, CACHE2_NAME);
 
             checkEquals(cache1_1, cache1_2);
             checkEquals(cache2_1, cache2_2);
