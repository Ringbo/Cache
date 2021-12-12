diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/data/formatters/NumberDataFormatter.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/data/formatters/NumberDataFormatter.java
index fc96197..2dfbf8c 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/data/formatters/NumberDataFormatter.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/data/formatters/NumberDataFormatter.java
@@ -41,25 +41,25 @@
     public void init(Locale locale, Map<Object, Object> properties)
     {
         numberFormat = (DecimalFormat) NumberFormat.getNumberInstance(locale);
-        Boolean useGrouping = (Boolean)properties.get(NumberFormatSample.PROP_USE_GROUPING);
+        Object useGrouping = properties.get(NumberFormatSample.PROP_USE_GROUPING);
         if (useGrouping != null) {
-            numberFormat.setGroupingUsed(useGrouping);
+            numberFormat.setGroupingUsed(CommonUtils.toBoolean(useGrouping));
         }
-        Integer maxIntDigits = (Integer) properties.get(NumberFormatSample.PROP_MAX_INT_DIGITS);
+        Object maxIntDigits = properties.get(NumberFormatSample.PROP_MAX_INT_DIGITS);
         if (maxIntDigits != null) {
-            numberFormat.setMaximumIntegerDigits(maxIntDigits);
+            numberFormat.setMaximumIntegerDigits(CommonUtils.toInt(maxIntDigits));
         }
-        Integer minIntDigits = (Integer) properties.get(NumberFormatSample.PROP_MIN_INT_DIGITS);
+        Object minIntDigits = properties.get(NumberFormatSample.PROP_MIN_INT_DIGITS);
         if (minIntDigits != null) {
-            numberFormat.setMinimumIntegerDigits(minIntDigits);
+            numberFormat.setMinimumIntegerDigits(CommonUtils.toInt(minIntDigits));
         }
-        Integer maxFractDigits = (Integer) properties.get(NumberFormatSample.PROP_MAX_FRACT_DIGITS);
+        Object maxFractDigits = properties.get(NumberFormatSample.PROP_MAX_FRACT_DIGITS);
         if (maxFractDigits != null) {
-            numberFormat.setMaximumFractionDigits(maxFractDigits);
+            numberFormat.setMaximumFractionDigits(CommonUtils.toInt(maxFractDigits));
         }
-        Integer minFractDigits = (Integer) properties.get(NumberFormatSample.PROP_MIN_FRACT_DIGITS);
+        Object minFractDigits = properties.get(NumberFormatSample.PROP_MIN_FRACT_DIGITS);
         if (minFractDigits != null) {
-            numberFormat.setMinimumFractionDigits(minFractDigits);
+            numberFormat.setMinimumFractionDigits(CommonUtils.toInt(minFractDigits));
         }
         String roundingMode = CommonUtils.toString(properties.get(NumberFormatSample.PROP_ROUNDING_MODE));
         if (!CommonUtils.isEmpty(roundingMode)) {
