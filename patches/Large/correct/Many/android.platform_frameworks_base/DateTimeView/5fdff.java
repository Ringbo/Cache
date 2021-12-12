diff --git a/core/java/android/widget/DateTimeView.java b/core/java/android/widget/DateTimeView.java
index 9067e26..3dab9f2 100644
--- a/core/java/android/widget/DateTimeView.java
+++ b/core/java/android/widget/DateTimeView.java
@@ -203,7 +203,7 @@
     private DateFormat getDateFormat() {
         String format = Settings.System.getString(getContext().getContentResolver(),
                 Settings.System.DATE_FORMAT);
-        if ("".equals(format)) {
+        if (format == null || "".equals(format)) {
             return DateFormat.getDateInstance(DateFormat.SHORT);
         } else {
             return new SimpleDateFormat(format);
