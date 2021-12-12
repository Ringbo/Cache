diff --git a/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/NearbyBeaconsFragment.java b/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/NearbyBeaconsFragment.java
index d193784..7384e5d 100644
--- a/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/NearbyBeaconsFragment.java
+++ b/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/NearbyBeaconsFragment.java
@@ -265,7 +265,8 @@
     new Handler(Looper.getMainLooper()).post(new Runnable() {
       @Override
       public void run() {
-        for (PwPair pwPair : mPwCollection.getGroupedPwPairsSortedByRank()) {
+        for (PwPair pwPair : mPwCollection.getGroupedPwPairsSortedByRank(
+            Utils.newDistanceComparator())) {
           String groupId = Utils.getGroupId(pwPair.getPwsResult());
           Log.d(TAG, "groupid to add " + groupId);
           if (mNearbyDeviceAdapter.containsGroupId(groupId)) {
