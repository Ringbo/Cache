diff --git a/core/java/com/android/internal/app/AlertController.java b/core/java/com/android/internal/app/AlertController.java
index 35e03c3..20d209f 100644
--- a/core/java/com/android/internal/app/AlertController.java
+++ b/core/java/com/android/internal/app/AlertController.java
@@ -955,10 +955,10 @@
                 if (mIcon != null) {
                     dialog.setIcon(mIcon);
                 }
-                if (mIconId >= 0) {
+                if (mIconId != 0) {
                     dialog.setIcon(mIconId);
                 }
-                if (mIconAttrId > 0) {
+                if (mIconAttrId != 0) {
                     dialog.setIcon(dialog.getIconAttributeResId(mIconAttrId));
                 }
             }
