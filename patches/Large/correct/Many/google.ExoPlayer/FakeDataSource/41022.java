diff --git a/testutils/src/main/java/com/google/android/exoplayer2/testutil/FakeDataSource.java b/testutils/src/main/java/com/google/android/exoplayer2/testutil/FakeDataSource.java
index 4d42c3e..b3f7639 100644
--- a/testutils/src/main/java/com/google/android/exoplayer2/testutil/FakeDataSource.java
+++ b/testutils/src/main/java/com/google/android/exoplayer2/testutil/FakeDataSource.java
@@ -199,7 +199,7 @@
     Assertions.checkState(opened);
     opened = false;
     uri = null;
-    if (currentSegmentIndex < fakeData.segments.size()) {
+    if (fakeData != null && currentSegmentIndex < fakeData.segments.size()) {
       Segment current = fakeData.segments.get(currentSegmentIndex);
       if (current.isErrorSegment() && current.exceptionThrown) {
         current.exceptionCleared = true;
