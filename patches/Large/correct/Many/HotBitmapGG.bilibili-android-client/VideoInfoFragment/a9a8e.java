diff --git a/app/src/main/java/com/hotbitmapgg/ohmybilibili/module/video/VideoInfoFragment.java b/app/src/main/java/com/hotbitmapgg/ohmybilibili/module/video/VideoInfoFragment.java
index 80fd012..2c6f26b 100644
--- a/app/src/main/java/com/hotbitmapgg/ohmybilibili/module/video/VideoInfoFragment.java
+++ b/app/src/main/java/com/hotbitmapgg/ohmybilibili/module/video/VideoInfoFragment.java
@@ -179,7 +179,7 @@
                 mRecyclerView, authorRecommendList,mVideoDetails.getAuthor());
         mRecyclerView.setHasFixedSize(false);
         mRecyclerView.setNestedScrollingEnabled(false);
-        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
+        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, true));
         mRecyclerView.setAdapter(mVideoAlikeListAdapter);
         mVideoAlikeListAdapter.setOnItemClickListener((position, holder) -> {
 
