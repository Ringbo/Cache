diff --git a/JodaTime/src/java/org/joda/time/field/AbstractDateTimeField.java b/JodaTime/src/java/org/joda/time/field/AbstractDateTimeField.java
index 192bd55..8c2606c 100644
--- a/JodaTime/src/java/org/joda/time/field/AbstractDateTimeField.java
+++ b/JodaTime/src/java/org/joda/time/field/AbstractDateTimeField.java
@@ -120,7 +120,7 @@
      * Get the human-readable, text value of this field from the milliseconds.
      * If the specified locale is null, the default locale is used.
      * <p>
-     * The default implementation returns getAsText(get(instant)).
+     * The default implementation returns getAsText(get(instant), locale).
      *
      * @param instant  the milliseconds from 1970-01-01T00:00:00Z to query
      * @param locale the locale to use for selecting a text symbol, null for
@@ -128,14 +128,14 @@
      * @return the text value of the field
      */
     public String getAsText(long instant, Locale locale) {
-        return getAsText(get(instant));
+        return getAsText(get(instant), locale);
     }
 
     /**
      * Get the human-readable, text value of this field from a partial instant.
      * If the specified locale is null, the default locale is used.
      * <p>
-     * The default implementation returns getAsText(fieldValue).
+     * The default implementation returns getAsText(fieldValue, locale).
      *
      * @param partial  the partial instant to query
      * @param fieldValue  the field value of this field, provided for performance
@@ -143,7 +143,7 @@
      * @return the text value of the field
      */
     public String getAsText(PartialInstant partial, int fieldValue, Locale locale) {
-        return getAsText(fieldValue);
+        return getAsText(fieldValue, locale);
     }
 
     /**
@@ -168,21 +168,21 @@
      * Get the human-readable, short text value of this field from the milliseconds.
      * If the specified locale is null, the default locale is used.
      * <p>
-     * The default implementation returns getAsShortText(get(instant)).
+     * The default implementation returns getAsShortText(get(instant), locale).
      *
      * @param instant  the milliseconds from 1970-01-01T00:00:00Z to query
      * @param locale the locale to use for selecting a text symbol, null for default
      * @return the text value of the field
      */
     public String getAsShortText(long instant, Locale locale) {
-        return getAsShortText(get(instant));
+        return getAsShortText(get(instant), locale);
     }
 
     /**
      * Get the human-readable, short text value of this field from a partial instant.
      * If the specified locale is null, the default locale is used.
      * <p>
-     * The default implementation returns getAsShortText(fieldValue).
+     * The default implementation returns getAsShortText(fieldValue, locale).
      *
      * @param partial  the partial instant to query
      * @param fieldValue  the field value of this field, provided for performance
@@ -190,7 +190,7 @@
      * @return the text value of the field
      */
     public String getAsShortText(PartialInstant partial, int fieldValue, Locale locale) {
-        return getAsShortText(fieldValue);
+        return getAsShortText(fieldValue, locale);
     }
 
     /**
