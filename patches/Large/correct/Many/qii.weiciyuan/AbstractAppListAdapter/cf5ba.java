diff --git a/src/org/qii/weiciyuan/ui/adapter/AbstractAppListAdapter.java b/src/org/qii/weiciyuan/ui/adapter/AbstractAppListAdapter.java
index 338466b..8e6a156 100644
--- a/src/org/qii/weiciyuan/ui/adapter/AbstractAppListAdapter.java
+++ b/src/org/qii/weiciyuan/ui/adapter/AbstractAppListAdapter.java
@@ -717,7 +717,7 @@
         }
 
         View wantedView = listView.getChildAt(wantedChild);
-        ViewHolder holder = (ViewHolder) wantedView.getTag(R.drawable.ic_launcher + getItemViewType(position));
+        ViewHolder holder = (ViewHolder) wantedView.getTag(R.drawable.ic_launcher + getItemViewType(wantedPosition));
         return holder;
 
     }
