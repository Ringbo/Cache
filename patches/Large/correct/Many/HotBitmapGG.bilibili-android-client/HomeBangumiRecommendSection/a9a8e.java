diff --git a/app/src/main/java/com/hotbitmapgg/ohmybilibili/adapter/section/HomeBangumiRecommendSection.java b/app/src/main/java/com/hotbitmapgg/ohmybilibili/adapter/section/HomeBangumiRecommendSection.java
index bc2f900..0747d1d 100644
--- a/app/src/main/java/com/hotbitmapgg/ohmybilibili/adapter/section/HomeBangumiRecommendSection.java
+++ b/app/src/main/java/com/hotbitmapgg/ohmybilibili/adapter/section/HomeBangumiRecommendSection.java
@@ -78,7 +78,7 @@
 
         recyclerViewHolder.mRecyclerView.setHasFixedSize(false);
         recyclerViewHolder.mRecyclerView.setNestedScrollingEnabled(false);
-        recyclerViewHolder.mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
+        recyclerViewHolder.mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false));
         SecondElementBangumiAdapter mAdapter = new SecondElementBangumiAdapter(recyclerViewHolder.mRecyclerView, recommends);
         recyclerViewHolder.mRecyclerView.setAdapter(mAdapter);
         mAdapter.setOnItemClickListener((position, holder1) -> {
