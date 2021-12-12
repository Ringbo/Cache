diff --git a/core/src/main/java/de/danoeh/antennapod/core/feed/FeedMedia.java b/core/src/main/java/de/danoeh/antennapod/core/feed/FeedMedia.java
index e617d41..d441422 100644
--- a/core/src/main/java/de/danoeh/antennapod/core/feed/FeedMedia.java
+++ b/core/src/main/java/de/danoeh/antennapod/core/feed/FeedMedia.java
@@ -481,7 +481,7 @@
         setPosition(newPosition);
         setLastPlayedTime(timeStamp);
         if(startPosition>=0 && position > startPosition) {
-            setDuration(playedDurationWhenStarted + position - startPosition);
+            setPlayedDuration(playedDurationWhenStarted + position - startPosition);
         }
         DBWriter.setFeedMediaPlaybackInformation(this);
     }
