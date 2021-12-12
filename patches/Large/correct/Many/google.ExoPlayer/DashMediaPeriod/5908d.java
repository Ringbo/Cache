diff --git a/library/dash/src/main/java/com/google/android/exoplayer2/source/dash/DashMediaPeriod.java b/library/dash/src/main/java/com/google/android/exoplayer2/source/dash/DashMediaPeriod.java
index 0d6b7e2..6b9668e 100644
--- a/library/dash/src/main/java/com/google/android/exoplayer2/source/dash/DashMediaPeriod.java
+++ b/library/dash/src/main/java/com/google/android/exoplayer2/source/dash/DashMediaPeriod.java
@@ -273,7 +273,7 @@
       AdaptationSet firstAdaptationSet = adaptationSets.get(adaptationSetIndices[0]);
       int primaryTrackGroupIndex = trackGroupCount;
       boolean hasEventMessageTrack = primaryGroupHasEventMessageTrackFlags[i];
-      boolean hasCea608Track = primaryGroupHasEventMessageTrackFlags[i];
+      boolean hasCea608Track = primaryGroupHasCea608TrackFlags[i];
 
       trackGroups[trackGroupCount] = new TrackGroup(formats);
       trackGroupInfos[trackGroupCount++] = new TrackGroupInfo(firstAdaptationSet.type,
