diff --git a/library/src/main/java/com/chad/library/adapter/base/BaseQuickAdapter.java b/library/src/main/java/com/chad/library/adapter/base/BaseQuickAdapter.java
index c537cd7..fdd281f 100755
--- a/library/src/main/java/com/chad/library/adapter/base/BaseQuickAdapter.java
+++ b/library/src/main/java/com/chad/library/adapter/base/BaseQuickAdapter.java
@@ -231,7 +231,7 @@
         if (mNextLoadEnable) {
             mLoadingMoreEnable = false;
         }
-        notifyDataSetChanged();
+        notifyItemRangeChanged(getItemCount(), newData.size());
     }
     
     /**
@@ -658,7 +658,7 @@
         }
         index = index >= mFooterLayout.getChildCount() ? -1 : index;
         mFooterLayout.addView(footer, index);
-        this.notifyDataSetChanged();
+        this.notifyItemChanged(getItemCount());
     }
 
     /**
@@ -795,8 +795,7 @@
     public void loadComplete() {
         mNextLoadEnable = false;
         mLoadingMoreEnable = false;
-        notifyDataSetChanged();
-
+        this.notifyItemChanged(getItemCount());
     }
 
 
