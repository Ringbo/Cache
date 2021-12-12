diff --git a/core/java/android/widget/AdapterView.java b/core/java/android/widget/AdapterView.java
index 1a2231e..abfc577 100644
--- a/core/java/android/widget/AdapterView.java
+++ b/core/java/android/widget/AdapterView.java
@@ -650,7 +650,8 @@
         mEmptyView = emptyView;
 
         // If not explicitly specified this view is important for accessibility.
-        if (emptyView.getImportantForAccessibility() == IMPORTANT_FOR_ACCESSIBILITY_AUTO) {
+        if (emptyView != null
+                && emptyView.getImportantForAccessibility() == IMPORTANT_FOR_ACCESSIBILITY_AUTO) {
             emptyView.setImportantForAccessibility(IMPORTANT_FOR_ACCESSIBILITY_YES);
         }
 
