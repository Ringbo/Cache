diff --git a/android-iconify/src/main/java/com/joanzapata/android/iconify/Iconify.java b/android-iconify/src/main/java/com/joanzapata/android/iconify/Iconify.java
index b092612..35f774f 100644
--- a/android-iconify/src/main/java/com/joanzapata/android/iconify/Iconify.java
+++ b/android-iconify/src/main/java/com/joanzapata/android/iconify/Iconify.java
@@ -47,8 +47,9 @@
 
     /**
      * Transform the given TextViews replacing {icon_xxx} texts with icons.
+     * @param textViews The TextViews to transform.
      */
-    public static final void addIcons(TextView... textViews) {
+    public static void addIcons(TextView... textViews) {
         for (TextView textView : textViews) {
             textView.setTypeface(getTypeface(textView.getContext()));
             textView.setText(compute(textView.getText()));
@@ -64,17 +65,17 @@
         return replaceIcons(new StringBuilder(text));
     }
 
-    public static final void setIcon(TextView textView, IconValue value) {
+    public static void setIcon(TextView textView, IconValue value) {
         textView.setTypeface(getTypeface(textView.getContext()));
         textView.setText(valueOf(value.character));
     }
 
     /**
      * The typeface that contains FontAwesome icons.
-     *
+     * @param context The application or activity context.
      * @return the typeface, or null if something goes wrong.
      */
-    public static final Typeface getTypeface(Context context) {
+    public static Typeface getTypeface(Context context) {
         if (typeface == null) {
             try {
                 typeface = Typeface.createFromFile(resourceToFile(context, TTF_FILE));
@@ -85,7 +86,7 @@
         return typeface;
     }
 
-    public static enum IconValue {
+    public  enum IconValue {
 
         fa_500px('\uf26e'),
         fa_adjust('\uf042'),
