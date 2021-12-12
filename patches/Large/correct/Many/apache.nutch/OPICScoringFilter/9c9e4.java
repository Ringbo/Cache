diff --git a/src/plugin/scoring-opic/src/java/org/apache/nutch/scoring/opic/OPICScoringFilter.java b/src/plugin/scoring-opic/src/java/org/apache/nutch/scoring/opic/OPICScoringFilter.java
index 72ed75a..127920c 100644
--- a/src/plugin/scoring-opic/src/java/org/apache/nutch/scoring/opic/OPICScoringFilter.java
+++ b/src/plugin/scoring-opic/src/java/org/apache/nutch/scoring/opic/OPICScoringFilter.java
@@ -77,13 +77,13 @@
   }
 
   /** Increase the score by a sum of inlinked scores. */
-  public void updateDbScore(UTF8 url, CrawlDatum datum, List inlinked) throws ScoringFilterException {
+  public void updateDbScore(UTF8 url, CrawlDatum old, CrawlDatum datum, List inlinked) throws ScoringFilterException {
     float adjust = 0.0f;
     for (int i = 0; i < inlinked.size(); i++) {
       CrawlDatum linked = (CrawlDatum)inlinked.get(i);
       adjust += linked.getScore();
     }
-    datum.setScore(datum.getScore() + adjust);
+    datum.setScore(old.getScore() + adjust);
   }
 
   /** Store a float value of CrawlDatum.getScore() under Fetcher.SCORE_KEY. */
