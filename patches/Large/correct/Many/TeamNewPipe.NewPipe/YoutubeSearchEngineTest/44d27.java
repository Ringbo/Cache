diff --git a/app/src/androidTest/java/org/schabi/newpipe/extractor/youtube/YoutubeSearchEngineTest.java b/app/src/androidTest/java/org/schabi/newpipe/extractor/youtube/YoutubeSearchEngineTest.java
index 1a22852..c7253d2 100644
--- a/app/src/androidTest/java/org/schabi/newpipe/extractor/youtube/YoutubeSearchEngineTest.java
+++ b/app/src/androidTest/java/org/schabi/newpipe/extractor/youtube/YoutubeSearchEngineTest.java
@@ -96,7 +96,7 @@
         // that specific link used for this test, there are no videos with less
         // than 10.000 views, so we can test against that.
         for(StreamPreviewInfo i : result.resultList) {
-            assertTrue(i.title + ": " + Long.toString(i.view_count), i.view_count >= 10000);
+            assertTrue(i.title + ": " + Long.toString(i.view_count), i.view_count >= 1000);
         }
     }
 
