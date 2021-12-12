diff --git a/JodaTime/src/java/org/joda/time/convert/LongConverter.java b/JodaTime/src/java/org/joda/time/convert/LongConverter.java
index b3f236d..ebedfc3 100644
--- a/JodaTime/src/java/org/joda/time/convert/LongConverter.java
+++ b/JodaTime/src/java/org/joda/time/convert/LongConverter.java
@@ -127,7 +127,7 @@
      * @throws ClassCastException if the object is invalid
      */
     public DurationType getDurationType(Object object) {
-        return DurationType.getMillisType();
+        return DurationType.getAverageYearMonthType();
     }
 
     //-----------------------------------------------------------------------
