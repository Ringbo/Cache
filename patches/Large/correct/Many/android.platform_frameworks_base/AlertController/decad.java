diff --git a/core/java/com/android/internal/app/AlertController.java b/core/java/com/android/internal/app/AlertController.java
index 5aeb7f9..95c291a 100644
--- a/core/java/com/android/internal/app/AlertController.java
+++ b/core/java/com/android/internal/app/AlertController.java
@@ -888,7 +888,8 @@
             final int checkedItem = mCheckedItem;
             if (checkedItem > -1) {
                 listView.setItemChecked(checkedItem, true);
-                listView.setSelection(checkedItem);
+                listView.setSelectionFromTop(checkedItem,
+                        a.getDimensionPixelSize(R.styleable.AlertDialog_selectionScrollOffset, 0));
             }
         }
     }
