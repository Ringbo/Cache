diff --git a/core/java/android/provider/Calendar.java b/core/java/android/provider/Calendar.java
index cbd8a26..f89ba91 100644
--- a/core/java/android/provider/Calendar.java
+++ b/core/java/android/provider/Calendar.java
@@ -744,9 +744,10 @@
                 try {
                     while (subCursor.moveToNext()) {
                         ContentValues extendedValues = new ContentValues();
-                        extendedValues.put(ExtendedProperties.NAME, cursor.getString(COLUMN_NAME));
+                        extendedValues.put(ExtendedProperties.NAME,
+                                subCursor.getString(COLUMN_NAME));
                         extendedValues.put(ExtendedProperties.VALUE,
-                                cursor.getString(COLUMN_VALUE));
+                                subCursor.getString(COLUMN_VALUE));
                         entity.addSubValue(ExtendedProperties.CONTENT_URI, extendedValues);
                     }
                 } finally {
