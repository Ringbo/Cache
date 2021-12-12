diff --git a/JodaTime/src/java/org/joda/time/PeriodType.java b/JodaTime/src/java/org/joda/time/PeriodType.java
index 087f557..907b827 100644
--- a/JodaTime/src/java/org/joda/time/PeriodType.java
+++ b/JodaTime/src/java/org/joda/time/PeriodType.java
@@ -700,12 +700,12 @@
      * @param index  the index to use
      * @param values  the array to populate
      * @param valueToAdd  the value to add
-     * @throws IllegalArgumentException if not supported
+     * @throws UnsupportedOperationException if not supported
      */
     boolean addIndexedField(ReadablePeriod period, int index, int[] values, int valueToAdd) {
         int realIndex = iIndices[index];
         if (realIndex == -1) {
-            throw new IllegalArgumentException("Field is not supported");
+            throw new UnsupportedOperationException("Field is not supported");
         }
         values[realIndex] = FieldUtils.safeAdd(values[realIndex], valueToAdd);
         return true;
