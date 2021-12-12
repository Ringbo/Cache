diff --git a/src/main/org/codehaus/groovy/runtime/TimeCategory.java b/src/main/org/codehaus/groovy/runtime/TimeCategory.java
index a38db77..142c623 100644
--- a/src/main/org/codehaus/groovy/runtime/TimeCategory.java
+++ b/src/main/org/codehaus/groovy/runtime/TimeCategory.java
@@ -26,7 +26,7 @@
 
 public class TimeCategory {
     /*
-     * Mthods to allow Data Duration arithmetic
+     * Methods to allow Date Duration arithmetic
      */
     
     public static Date plus(final Date date, final BaseDuration duration) {
@@ -40,7 +40,7 @@
         cal.add(Calendar.YEAR, -duration.getYears());
         cal.add(Calendar.MONTH, -duration.getMonths());
         cal.add(Calendar.DAY_OF_YEAR, -duration.getDays());
-        cal.add(Calendar.HOUR_OF_DAY, -duration.getMinutes());
+        cal.add(Calendar.HOUR_OF_DAY, -duration.getHours());
         cal.add(Calendar.MINUTE, -duration.getMinutes());
         cal.add(Calendar.SECOND, -duration.getSeconds());
         cal.add(Calendar.MILLISECOND, -duration.getMillis());
