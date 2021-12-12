diff --git a/sample/src/main/java/com/afollestad/materialdialogssample/AboutDialog.java b/sample/src/main/java/com/afollestad/materialdialogssample/AboutDialog.java
index 696959c..7d693e9 100644
--- a/sample/src/main/java/com/afollestad/materialdialogssample/AboutDialog.java
+++ b/sample/src/main/java/com/afollestad/materialdialogssample/AboutDialog.java
@@ -24,7 +24,7 @@
         return new MaterialDialog.Builder(getActivity())
                 .title(R.string.about)
                 .positiveText(R.string.dismiss)
-                .content(R.string.about_body)
+                .content(R.string.about_body, true)
                 .contentLineSpacing(1.6f)
                 .build();
     }
