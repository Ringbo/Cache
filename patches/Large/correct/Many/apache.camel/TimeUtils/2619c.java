diff --git a/camel-core/src/main/java/org/apache/camel/util/TimeUtils.java b/camel-core/src/main/java/org/apache/camel/util/TimeUtils.java
index f9db632..49f8f3b 100644
--- a/camel-core/src/main/java/org/apache/camel/util/TimeUtils.java
+++ b/camel-core/src/main/java/org/apache/camel/util/TimeUtils.java
@@ -39,7 +39,7 @@
      */
     public static String printDuration(double uptime) {
         // Code taken from Karaf
-        // https://svn.apache.org/repos/asf/felix/trunk/karaf/shell/commands/src/main/java/org/apache/felix/karaf/shell/commands/InfoAction.java
+        // https://svn.apache.org/repos/asf/karaf/trunk/shell/commands/src/main/java/org/apache/karaf/shell/commands/impl/InfoAction.java
 
         NumberFormat fmtI = new DecimalFormat("###,###", new DecimalFormatSymbols(Locale.ENGLISH));
         NumberFormat fmtD = new DecimalFormat("###,##0.000", new DecimalFormatSymbols(Locale.ENGLISH));
@@ -66,7 +66,7 @@
         }
         uptime /= 24;
         long days = (long) uptime;
-        long hours = (long) ((uptime - days) * 60);
+        long hours = (long) ((uptime - days) * 24);
         String s = fmtI.format(days) + (days > 1 ? " days" : " day");
         if (hours != 0) {
             s += " " + fmtI.format(hours) + (hours > 1 ? " hours" : " hour");
