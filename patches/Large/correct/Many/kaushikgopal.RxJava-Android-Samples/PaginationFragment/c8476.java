diff --git a/app/src/main/java/com/morihacky/android/rxjava/pagination/PaginationFragment.java b/app/src/main/java/com/morihacky/android/rxjava/pagination/PaginationFragment.java
index 38aa922..0540971 100644
--- a/app/src/main/java/com/morihacky/android/rxjava/pagination/PaginationFragment.java
+++ b/app/src/main/java/com/morihacky/android/rxjava/pagination/PaginationFragment.java
@@ -61,7 +61,7 @@
 
         Subscription s2 =//
               _paginator//
-                    .flatMap(nextPage -> _itemsFromNetworkCall(nextPage + 1, 10))//
+                    .concatMap(nextPage -> _itemsFromNetworkCall(nextPage + 1, 10))//
                     .observeOn(AndroidSchedulers.mainThread())
                     .map(items -> {
                         int start = _adapter.getItemCount() - 1;
