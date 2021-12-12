diff --git a/core/java/android/widget/RemoteViewsAdapter.java b/core/java/android/widget/RemoteViewsAdapter.java
index f266d50..46ec923 100644
--- a/core/java/android/widget/RemoteViewsAdapter.java
+++ b/core/java/android/widget/RemoteViewsAdapter.java
@@ -614,7 +614,7 @@
                     maxDistIndexNonRequested = i;
                     maxDistNonRequested = dist;
                 }
-                if (dist > maxDist) {
+                if (dist >= maxDist) {
                     // maxDist/maxDistIndex will store the index of the farthest position
                     // regardless of whether it was directly requested or not
                     maxDistIndex = i;
