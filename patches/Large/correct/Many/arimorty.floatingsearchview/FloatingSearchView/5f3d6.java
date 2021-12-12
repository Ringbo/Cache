diff --git a/library/src/main/java/com/arlib/floatingsearchview/FloatingSearchView.java b/library/src/main/java/com/arlib/floatingsearchview/FloatingSearchView.java
index b058971..0d473d6 100644
--- a/library/src/main/java/com/arlib/floatingsearchview/FloatingSearchView.java
+++ b/library/src/main/java/com/arlib/floatingsearchview/FloatingSearchView.java
@@ -1125,7 +1125,7 @@
      *                  clicked.
      */
     public void setSearchFocusable(boolean focusable) {
-        mSearchInput.setFocusable(focusable);
+        mSearchInput.setFocusableInTouchMode(focusable);
     }
 
     /**
