diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 2d85a58..790e227 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -8807,6 +8807,9 @@
     /**
      * Computes whether this virtual autofill view is visible to the user.
      *
+     * <p><b>Note: </b>By default it returns {@code true}, but views providing a virtual hierarchy
+     * view must override it.
+     *
      * @return Whether the view is visible on the screen.
      */
     public boolean isVisibleToUserForAutofill(int virtualId) {
@@ -8819,7 +8822,7 @@
                 }
             }
         }
-        return false;
+        return true;
     }
 
     /**
