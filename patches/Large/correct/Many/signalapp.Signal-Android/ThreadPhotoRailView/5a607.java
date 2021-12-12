diff --git a/src/org/thoughtcrime/securesms/components/ThreadPhotoRailView.java b/src/org/thoughtcrime/securesms/components/ThreadPhotoRailView.java
index c1801c5..35f9f02 100644
--- a/src/org/thoughtcrime/securesms/components/ThreadPhotoRailView.java
+++ b/src/org/thoughtcrime/securesms/components/ThreadPhotoRailView.java
@@ -51,7 +51,7 @@
     this.recyclerView = ViewUtil.findById(this, R.id.photo_list);
     this.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
     this.recyclerView.setItemAnimator(new DefaultItemAnimator());
-    this.recyclerView.setNestedScrollingEnabled(true);
+    this.recyclerView.setNestedScrollingEnabled(false);
   }
 
   public void setListener(@Nullable OnItemClickedListener listener) {
