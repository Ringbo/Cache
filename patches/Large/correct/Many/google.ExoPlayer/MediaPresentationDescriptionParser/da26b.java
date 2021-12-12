diff --git a/library/src/main/java/com/google/android/exoplayer/dash/mpd/MediaPresentationDescriptionParser.java b/library/src/main/java/com/google/android/exoplayer/dash/mpd/MediaPresentationDescriptionParser.java
index de5fc9b..bf1ba53 100644
--- a/library/src/main/java/com/google/android/exoplayer/dash/mpd/MediaPresentationDescriptionParser.java
+++ b/library/src/main/java/com/google/android/exoplayer/dash/mpd/MediaPresentationDescriptionParser.java
@@ -362,7 +362,7 @@
     long presentationTimeOffset = parseLong(xpp, "presentationTimeOffset",
         parent != null ? parent.presentationTimeOffset : 0);
     long duration = parseLong(xpp, "duration", parent != null ? parent.duration : -1);
-    int startNumber = parseInt(xpp, "startNumber", parent != null ? parent.startNumber : 0);
+    int startNumber = parseInt(xpp, "startNumber", parent != null ? parent.startNumber : 1);
 
     RangedUri initialization = null;
     List<SegmentTimelineElement> timeline = null;
@@ -406,7 +406,7 @@
     long presentationTimeOffset = parseLong(xpp, "presentationTimeOffset",
         parent != null ? parent.presentationTimeOffset : 0);
     long duration = parseLong(xpp, "duration", parent != null ? parent.duration : -1);
-    int startNumber = parseInt(xpp, "startNumber", parent != null ? parent.startNumber : 0);
+    int startNumber = parseInt(xpp, "startNumber", parent != null ? parent.startNumber : 1);
     UrlTemplate mediaTemplate = parseUrlTemplate(xpp, "media",
         parent != null ? parent.mediaTemplate : null);
     UrlTemplate initializationTemplate = parseUrlTemplate(xpp, "initialization",
