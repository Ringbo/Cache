diff --git a/library/src/main/java/com/mikepenz/materialdrawer/DrawerBuilder.java b/library/src/main/java/com/mikepenz/materialdrawer/DrawerBuilder.java
index d04332f..0cd4389 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/DrawerBuilder.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/DrawerBuilder.java
@@ -814,7 +814,7 @@
     }
 
     // item to select
-    protected int mSelectedItemIdentifier = 0;
+    protected long mSelectedItemIdentifier = 0;
 
     /**
      * Set this to the identifier of the item, you would love to select upon start
@@ -822,7 +822,7 @@
      * @param selectedItemIdentifier
      * @return
      */
-    public DrawerBuilder withSelectedItem(int selectedItemIdentifier) {
+    public DrawerBuilder withSelectedItem(long selectedItemIdentifier) {
         this.mSelectedItemIdentifier = selectedItemIdentifier;
         return this;
     }
@@ -1657,7 +1657,7 @@
         }
 
         //predefine selection (should be the first element
-        if (mSelectedItemPosition == 0 && mSelectedItemIdentifier != 0) {
+        if (mSelectedItemPosition == 0 && mSelectedItemIdentifier != 0L) {
             mSelectedItemPosition = DrawerUtils.getPositionByIdentifier(this, mSelectedItemIdentifier);
         }
         if (mHeaderView != null && mSelectedItemPosition == 0) {
