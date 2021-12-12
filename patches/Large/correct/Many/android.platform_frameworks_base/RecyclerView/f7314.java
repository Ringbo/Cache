diff --git a/core/java/com/android/internal/widget/RecyclerView.java b/core/java/com/android/internal/widget/RecyclerView.java
index 7abc76a..408a4e9 100644
--- a/core/java/com/android/internal/widget/RecyclerView.java
+++ b/core/java/com/android/internal/widget/RecyclerView.java
@@ -9556,7 +9556,7 @@
             if (vScroll == 0 && hScroll == 0) {
                 return false;
             }
-            mRecyclerView.scrollBy(hScroll, vScroll);
+            mRecyclerView.smoothScrollBy(hScroll, vScroll);
             return true;
         }
 
