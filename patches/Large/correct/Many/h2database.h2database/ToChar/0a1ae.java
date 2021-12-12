diff --git a/h2/src/main/org/h2/util/ToChar.java b/h2/src/main/org/h2/util/ToChar.java
index 1a22333..1ddce26 100644
--- a/h2/src/main/org/h2/util/ToChar.java
+++ b/h2/src/main/org/h2/util/ToChar.java
@@ -691,8 +691,7 @@
                 output.append(DateTimeUtils.getDayOfYear(dateValue));
                 i += 3;
             } else if ((cap = containsAt(format, i, "DD")) != null) {
-                output.append(String.format("%02d",
-                        dayOfMonth));
+                StringUtils.appendZeroPadded(output, 2, dayOfMonth);
                 i += 2;
             } else if ((cap = containsAt(format, i, "DY")) != null) {
                 String day = getNames(SHORT_WEEKDAYS)[DateTimeUtils.getSundayDayOfWeek(dateValue)];
@@ -780,7 +779,8 @@
                 output.append(new DecimalFormat("#,###").format(posYear));
                 i += 5;
             } else if ((cap = containsAt(format, i, "SYYYY")) != null) {
-                if (year <= 0) {
+                // Should be <= 0, but Oracle prints negative years with off-by-one difference
+                if (year < 0) {
                     output.append('-');
                 }
                 StringUtils.appendZeroPadded(output, 4, posYear);
