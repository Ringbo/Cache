diff --git a/app/src/main/java/com/github/rubensousa/recyclerviewsnap/SnapAdapter.java b/app/src/main/java/com/github/rubensousa/recyclerviewsnap/SnapAdapter.java
index 86e064d..eeb8d22 100644
--- a/app/src/main/java/com/github/rubensousa/recyclerviewsnap/SnapAdapter.java
+++ b/app/src/main/java/com/github/rubensousa/recyclerviewsnap/SnapAdapter.java
@@ -85,7 +85,8 @@
                     .recyclerView.getContext(), LinearLayoutManager.HORIZONTAL, false));
             holder.recyclerView.setOnFlingListener(null);
             new GravitySnapHelper(snap.getGravity(), false, this).attachToRecyclerView(holder.recyclerView);
-        } else if (snap.getGravity() == Gravity.CENTER_HORIZONTAL) {
+        } else if (snap.getGravity() == Gravity.CENTER_HORIZONTAL ||
+                snap.getGravity() == Gravity.CENTER_VERTICAL) {
             holder.recyclerView.setLayoutManager(new LinearLayoutManager(holder
                     .recyclerView.getContext(), snap.getGravity() == Gravity.CENTER_HORIZONTAL ?
                     LinearLayoutManager.HORIZONTAL : LinearLayoutManager.VERTICAL, false));
