diff --git a/core/java/android/text/format/Formatter.java b/core/java/android/text/format/Formatter.java
index 2c83fc4..8c90156 100644
--- a/core/java/android/text/format/Formatter.java
+++ b/core/java/android/text/format/Formatter.java
@@ -355,21 +355,21 @@
         final Locale locale = localeFromContext(context);
         final MeasureFormat measureFormat = MeasureFormat.getInstance(
                 locale, MeasureFormat.FormatWidth.SHORT);
-        if (days >= 2) {
+        if (days >= 2 || (days > 0 && hours == 0)) {
             days += (hours+12)/24;
             return measureFormat.format(new Measure(days, MeasureUnit.DAY));
         } else if (days > 0) {
             return measureFormat.formatMeasures(
                     new Measure(days, MeasureUnit.DAY),
                     new Measure(hours, MeasureUnit.HOUR));
-        } else if (hours >= 2) {
+        } else if (hours >= 2 || (hours > 0 && minutes == 0)) {
             hours += (minutes+30)/60;
             return measureFormat.format(new Measure(hours, MeasureUnit.HOUR));
         } else if (hours > 0) {
             return measureFormat.formatMeasures(
                     new Measure(hours, MeasureUnit.HOUR),
                     new Measure(minutes, MeasureUnit.MINUTE));
-        } else if (minutes >= 2) {
+        } else if (minutes >= 2 || (minutes > 0 && seconds == 0)) {
             minutes += (seconds+30)/60;
             return measureFormat.format(new Measure(minutes, MeasureUnit.MINUTE));
         } else if (minutes > 0) {
