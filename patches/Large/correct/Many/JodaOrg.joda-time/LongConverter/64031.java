diff --git a/JodaTime/src/java/org/joda/time/convert/LongConverter.java b/JodaTime/src/java/org/joda/time/convert/LongConverter.java
index ebedfc3..b3f236d 100644
--- a/JodaTime/src/java/org/joda/time/convert/LongConverter.java
+++ b/JodaTime/src/java/org/joda/time/convert/LongConverter.java
@@ -127,7 +127,7 @@
      * @throws ClassCastException if the object is invalid
      */
     public DurationType getDurationType(Object object) {
-        return DurationType.getAverageYearMonthType();
+        return DurationType.getMillisType();
     }
 
     //-----------------------------------------------------------------------
