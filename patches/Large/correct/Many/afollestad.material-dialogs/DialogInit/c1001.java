diff --git a/core/src/main/java/com/afollestad/materialdialogs/DialogInit.java b/core/src/main/java/com/afollestad/materialdialogs/DialogInit.java
index 5a287f2..f82105a 100644
--- a/core/src/main/java/com/afollestad/materialdialogs/DialogInit.java
+++ b/core/src/main/java/com/afollestad/materialdialogs/DialogInit.java
@@ -76,7 +76,8 @@
         dialog.setCancelable(builder.cancelable);
         dialog.setCanceledOnTouchOutside(builder.canceledOnTouchOutside);
         if (builder.backgroundColor == 0)
-            builder.backgroundColor = DialogUtils.resolveColor(builder.context, R.attr.md_background_color);
+            builder.backgroundColor = DialogUtils.resolveColor(builder.context, R.attr.md_background_color,
+                    DialogUtils.resolveColor(dialog.getContext(), R.attr.colorBackgroundFloating));
         if (builder.backgroundColor != 0) {
             GradientDrawable drawable = new GradientDrawable();
             drawable.setCornerRadius(builder.context.getResources().getDimension(R.dimen.md_bg_corner_radius));
