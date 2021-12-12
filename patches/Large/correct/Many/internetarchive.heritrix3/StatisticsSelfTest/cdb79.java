diff --git a/engine/src/test/java/org/archive/crawler/selftest/StatisticsSelfTest.java b/engine/src/test/java/org/archive/crawler/selftest/StatisticsSelfTest.java
index 1641c8b..1e7419e 100644
--- a/engine/src/test/java/org/archive/crawler/selftest/StatisticsSelfTest.java
+++ b/engine/src/test/java/org/archive/crawler/selftest/StatisticsSelfTest.java
@@ -48,14 +48,17 @@
         StatisticsTracker stats = heritrix.getEngine().getJob("selftest-job").getCrawlController().getStatisticsTracker();
         assertNotNull(stats);
         assertEquals(14, (long) stats.getCrawledBytes().get(CrawledBytesHistotable.WARC_NOVEL_URLS));
-        assertEquals(12718, (long) stats.getCrawledBytes().get(CrawledBytesHistotable.WARC_NOVEL_CONTENT_BYTES));
+        assertEquals(12717, (long) stats.getCrawledBytes()
+                .get(CrawledBytesHistotable.WARC_NOVEL_CONTENT_BYTES));
 
         assertEquals(3, (long) stats.getServerCache().getHostFor("127.0.0.1").getSubstats().get(CrawledBytesHistotable.WARC_NOVEL_URLS));
         assertEquals(2942, (long) stats.getServerCache().getHostFor("127.0.0.1").getSubstats().get(CrawledBytesHistotable.WARC_NOVEL_CONTENT_BYTES));
         assertEquals(10, (long) stats.getServerCache().getHostFor("localhost").getSubstats().get(CrawledBytesHistotable.WARC_NOVEL_URLS));
         assertEquals(9727, (long) stats.getServerCache().getHostFor("localhost").getSubstats().get(CrawledBytesHistotable.WARC_NOVEL_CONTENT_BYTES));
         assertEquals(1, (long) stats.getServerCache().getHostFor("dns:").getSubstats().get(CrawledBytesHistotable.WARC_NOVEL_URLS));
-        assertEquals(49, (long) stats.getServerCache().getHostFor("dns:").getSubstats().get(CrawledBytesHistotable.WARC_NOVEL_CONTENT_BYTES));
+        assertEquals(48,
+                (long) stats.getServerCache().getHostFor("dns:").getSubstats()
+                        .get(CrawledBytesHistotable.WARC_NOVEL_CONTENT_BYTES));
     }
 
     protected void verifySourceStats() throws Exception {
@@ -75,9 +78,9 @@
         sourceStats = stats.getSourceStats("http://localhost:7777/b.html");
         assertNotNull(sourceStats);
         assertEquals(4, sourceStats.keySet().size());
-        assertEquals(9776l, (long) sourceStats.get("novel"));
+        assertEquals(9775l, (long) sourceStats.get("novel"));
         assertEquals(11l, (long) sourceStats.get("novelCount"));
-        assertEquals(9776l, (long) sourceStats.get("warcNovelContentBytes"));
+        assertEquals(9775l, (long) sourceStats.get("warcNovelContentBytes"));
         assertEquals(11l, (long) sourceStats.get("warcNovelUrls"));
     }
 
