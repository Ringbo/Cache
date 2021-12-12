diff --git a/library/src/main/java/com/chad/library/adapter/base/BaseQuickAdapter.java b/library/src/main/java/com/chad/library/adapter/base/BaseQuickAdapter.java
index 63454a3..d9cfe19 100755
--- a/library/src/main/java/com/chad/library/adapter/base/BaseQuickAdapter.java
+++ b/library/src/main/java/com/chad/library/adapter/base/BaseQuickAdapter.java
@@ -607,7 +607,7 @@
      */
     @Nullable
     public T getItem(@IntRange(from = 0) int position) {
-        if (position < mData.size())
+        if (position >= 0 && position < mData.size())
             return mData.get(position);
         else
             return null;
