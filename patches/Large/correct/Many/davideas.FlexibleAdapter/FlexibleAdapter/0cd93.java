diff --git a/flexible-adapter/src/main/java/eu/davidea/flexibleadapter/FlexibleAdapter.java b/flexible-adapter/src/main/java/eu/davidea/flexibleadapter/FlexibleAdapter.java
index 0eaac7b..1ce6711 100644
--- a/flexible-adapter/src/main/java/eu/davidea/flexibleadapter/FlexibleAdapter.java
+++ b/flexible-adapter/src/main/java/eu/davidea/flexibleadapter/FlexibleAdapter.java
@@ -378,7 +378,7 @@
 	public int getItemCountOfTypesUntil(@IntRange(from = 0) int position, Integer... viewTypes) {
 		List<Integer> viewTypeList = Arrays.asList(viewTypes);
 		int count = 0;
-		for (int i = 0; i < position; i++) {
+		for (int i = 0; i <= position; i++) {
 			//Privilege faster counting if autoMap is active
 			if ((autoMap && viewTypeList.contains(mItems.get(i).getLayoutRes())) ||
 					viewTypeList.contains(getItemViewType(i)))
