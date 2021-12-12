diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 71b6084..6b16d42 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -20700,7 +20700,7 @@
             if (canTakeFocus()) {
                 // We have a robust focus, so parents should no longer be wanting focus.
                 clearParentsWantFocus();
-            } else if (!getViewRootImpl().isInLayout()) {
+            } else if (getViewRootImpl() == null || !getViewRootImpl().isInLayout()) {
                 // This is a weird case. Most-likely the user, rather than ViewRootImpl, called
                 // layout. In this case, there's no guarantee that parent layouts will be evaluated
                 // and thus the safest action is to clear focus here.
