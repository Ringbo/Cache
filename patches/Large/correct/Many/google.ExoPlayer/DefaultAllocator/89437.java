diff --git a/library/src/main/java/com/google/android/exoplayer2/upstream/DefaultAllocator.java b/library/src/main/java/com/google/android/exoplayer2/upstream/DefaultAllocator.java
index 7ba61a8..5ccfa5f 100644
--- a/library/src/main/java/com/google/android/exoplayer2/upstream/DefaultAllocator.java
+++ b/library/src/main/java/com/google/android/exoplayer2/upstream/DefaultAllocator.java
@@ -134,7 +134,7 @@
         if (lowAllocation.data == initialAllocationBlock) {
           lowIndex++;
         } else {
-          Allocation highAllocation = availableAllocations[lowIndex];
+          Allocation highAllocation = availableAllocations[highIndex];
           if (highAllocation.data != initialAllocationBlock) {
             highIndex--;
           } else {
