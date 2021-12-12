diff --git a/library-core/src/main/java/com/mikepenz/iconics/IconicsDrawable.java b/library-core/src/main/java/com/mikepenz/iconics/IconicsDrawable.java
index a088e46..a3e0958 100644
--- a/library-core/src/main/java/com/mikepenz/iconics/IconicsDrawable.java
+++ b/library-core/src/main/java/com/mikepenz/iconics/IconicsDrawable.java
@@ -908,7 +908,7 @@
         if (mIcon != null) {
             iconicsDrawable.icon(mIcon);
         } else if (mPlainIcon != null) {
-            iconicsDrawable.icon(mPlainIcon);
+            iconicsDrawable.iconText(mPlainIcon);
         }
         return iconicsDrawable;
     }
