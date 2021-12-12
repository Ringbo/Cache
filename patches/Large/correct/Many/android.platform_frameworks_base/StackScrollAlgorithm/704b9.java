diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/stack/StackScrollAlgorithm.java b/packages/SystemUI/src/com/android/systemui/statusbar/stack/StackScrollAlgorithm.java
index 202063a..de28ac7 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/stack/StackScrollAlgorithm.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/stack/StackScrollAlgorithm.java
@@ -582,7 +582,7 @@
             return row.getIntrinsicHeight();
         } else if (child instanceof ExpandableView) {
             ExpandableView expandableView = (ExpandableView) child;
-            return expandableView.getActualHeight();
+            return expandableView.getIntrinsicHeight();
         }
         return child == null? mCollapsedSize : child.getHeight();
     }
