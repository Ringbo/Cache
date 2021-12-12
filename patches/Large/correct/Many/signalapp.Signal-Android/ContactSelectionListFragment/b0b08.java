diff --git a/src/org/thoughtcrime/securesms/ContactSelectionListFragment.java b/src/org/thoughtcrime/securesms/ContactSelectionListFragment.java
index 131de64..15cdcc2 100644
--- a/src/org/thoughtcrime/securesms/ContactSelectionListFragment.java
+++ b/src/org/thoughtcrime/securesms/ContactSelectionListFragment.java
@@ -74,7 +74,7 @@
 
   @Override
   public void onActivityCreated(Bundle icicle) {
-    super.onCreate(icicle);
+    super.onActivityCreated(icicle);
     initializeCursor();
   }
 
