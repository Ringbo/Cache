diff --git a/app/src/main/java/de/danoeh/antennapod/adapter/itunes/ItunesAdapter.java b/app/src/main/java/de/danoeh/antennapod/adapter/itunes/ItunesAdapter.java
index e493a2e..4a94127 100644
--- a/app/src/main/java/de/danoeh/antennapod/adapter/itunes/ItunesAdapter.java
+++ b/app/src/main/java/de/danoeh/antennapod/adapter/itunes/ItunesAdapter.java
@@ -132,7 +132,7 @@
         }
 
         public static Podcast fromSearch(SearchHit searchHit) {
-            return new Podcast(searchHit.getTitle(), searchHit.getImageUrl(), searchHit.getXmlUrl());
+            return new Podcast(searchHit.getTitle(), searchHit.getThumbImageURL(), searchHit.getXmlUrl());
         }
 
         /**
