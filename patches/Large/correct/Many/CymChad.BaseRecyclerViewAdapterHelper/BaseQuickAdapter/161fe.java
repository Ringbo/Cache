diff --git a/library/src/main/java/com/chad/library/adapter/base/BaseQuickAdapter.java b/library/src/main/java/com/chad/library/adapter/base/BaseQuickAdapter.java
index 52a28ff..ada4b58 100755
--- a/library/src/main/java/com/chad/library/adapter/base/BaseQuickAdapter.java
+++ b/library/src/main/java/com/chad/library/adapter/base/BaseQuickAdapter.java
@@ -971,7 +971,7 @@
                 if (subItem instanceof IExpandable) {
                     subItemCount += recursiveCollapse(pos);
                 }
-                mData.remove(pos);
+                mData.remove(subItem);
                 subItemCount ++;
             }
         }
