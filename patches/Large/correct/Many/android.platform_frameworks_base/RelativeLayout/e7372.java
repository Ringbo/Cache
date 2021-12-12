diff --git a/core/java/android/widget/RelativeLayout.java b/core/java/android/widget/RelativeLayout.java
index b424101..67bfe5e 100644
--- a/core/java/android/widget/RelativeLayout.java
+++ b/core/java/android/widget/RelativeLayout.java
@@ -1013,7 +1013,8 @@
             while (v.getVisibility() == View.GONE) {
                 rules = ((LayoutParams) v.getLayoutParams()).getRules(v.getLayoutDirection());
                 node = mGraph.mKeyNodes.get((rules[relation]));
-                if (node == null) return null;
+                // ignore self dependency. for more info look in git commit: da3003
+                if (node == null || v == node.view) return null;
                 v = node.view;
             }
 
