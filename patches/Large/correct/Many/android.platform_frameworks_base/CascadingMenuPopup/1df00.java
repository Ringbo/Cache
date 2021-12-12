diff --git a/core/java/com/android/internal/view/menu/CascadingMenuPopup.java b/core/java/com/android/internal/view/menu/CascadingMenuPopup.java
index ddf3a76..69e974c 100644
--- a/core/java/com/android/internal/view/menu/CascadingMenuPopup.java
+++ b/core/java/com/android/internal/view/menu/CascadingMenuPopup.java
@@ -366,7 +366,7 @@
         final int menuWidth = measureIndividualMenuWidth(adapter, null, mContext, mMenuMaxWidth);
         final MenuPopupWindow popupWindow = createPopupWindow();
         popupWindow.setAdapter(adapter);
-        popupWindow.setWidth(menuWidth);
+        popupWindow.setContentWidth(menuWidth);
         popupWindow.setDropDownGravity(mDropDownGravity);
 
         final CascadingMenuInfo parentInfo;
