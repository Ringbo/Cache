diff --git a/core/java/com/android/internal/view/menu/MenuItemImpl.java b/core/java/com/android/internal/view/menu/MenuItemImpl.java
index 3d6b116..4d0a326 100644
--- a/core/java/com/android/internal/view/menu/MenuItemImpl.java
+++ b/core/java/com/android/internal/view/menu/MenuItemImpl.java
@@ -616,7 +616,7 @@
 
     @Override
     public boolean expandActionView() {
-        if (hasCollapsibleActionView()) {
+        if (!hasCollapsibleActionView()) {
             return false;
         }
 
