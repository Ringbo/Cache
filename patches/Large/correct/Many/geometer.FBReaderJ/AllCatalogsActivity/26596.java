diff --git a/src/org/geometerplus/android/fbreader/network/AllCatalogsActivity.java b/src/org/geometerplus/android/fbreader/network/AllCatalogsActivity.java
index b3712f6..e5dec7b 100644
--- a/src/org/geometerplus/android/fbreader/network/AllCatalogsActivity.java
+++ b/src/org/geometerplus/android/fbreader/network/AllCatalogsActivity.java
@@ -134,11 +134,11 @@
 		if(item != null && item instanceof CatalogItem){
 			CatalogItem catalogItem = (CatalogItem)item;
 			if(catalogItem.IsChecked){
-				int insertIndex = index <=0 ?0:(index-1);
+				int insertIndex = index <= 0 ? -1 : (index-1);
 				if(mySelectedItems.contains(catalogItem)){
 					mySelectedItems.remove(catalogItem);
 				}
-				if(insertIndex > 0){
+				if(insertIndex >= 0){
 					mySelectedItems.add(insertIndex, catalogItem);
 				}else{
 					mySelectedItems.add(catalogItem);
