diff --git a/dbflow/src/androidTest/java/com/raizlabs/android/dbflow/test/typeconverter/TypeConverterTest.java b/dbflow/src/androidTest/java/com/raizlabs/android/dbflow/test/typeconverter/TypeConverterTest.java
index 00beb9b..9fd461e 100644
--- a/dbflow/src/androidTest/java/com/raizlabs/android/dbflow/test/typeconverter/TypeConverterTest.java
+++ b/dbflow/src/androidTest/java/com/raizlabs/android/dbflow/test/typeconverter/TypeConverterTest.java
@@ -81,7 +81,7 @@
 
     /**
      * Nullable database columns need to be allowed to receive null values.
-     * <p>
+     * <p/>
      * Type converters that autobox to native types need to have their behavior checked
      * when null values are present in the database.
      */
@@ -124,7 +124,7 @@
          */
 
         new Update<>(TestType.class)
-                .set(TestType_Table.nativeBoolean.isNull())
+                .set(TestType_Table.nativeBoolean.is((Boolean) null))
                 .where(TestType_Table.name.eq(testType.name))
                 .queryClose();
 
