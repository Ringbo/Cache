diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/car/CarNavigationBarController.java b/packages/SystemUI/src/com/android/systemui/statusbar/car/CarNavigationBarController.java
index bb43899..d9bf539 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/car/CarNavigationBarController.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/car/CarNavigationBarController.java
@@ -106,7 +106,7 @@
 
         String category = getPackageCategory(packageName);
         if (mFacetCategoryMap.containsKey(category)) {
-            int index = mFacetCategoryMap.get(packageName);
+            int index = mFacetCategoryMap.get(category);
             mFacetHasMultipleAppsCache.put(index, facetHasMultiplePackages(index));
         }
     }
