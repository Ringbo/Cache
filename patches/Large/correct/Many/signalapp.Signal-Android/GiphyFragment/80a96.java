diff --git a/src/org/thoughtcrime/securesms/giph/ui/GiphyFragment.java b/src/org/thoughtcrime/securesms/giph/ui/GiphyFragment.java
index d90065c..b465b43 100644
--- a/src/org/thoughtcrime/securesms/giph/ui/GiphyFragment.java
+++ b/src/org/thoughtcrime/securesms/giph/ui/GiphyFragment.java
@@ -66,7 +66,7 @@
   public void onLoadFinished(Loader<List<GiphyImage>> loader, List<GiphyImage> data) {
     this.loadingProgress.setVisibility(View.GONE);
 
-    if (data.isEmpty()) noResultsView.setVisibility(View.VISIBLE);
+    if (data == null || data.isEmpty()) noResultsView.setVisibility(View.VISIBLE);
     else                noResultsView.setVisibility(View.GONE);
 
     this.giphyAdapter.setImages(data);
