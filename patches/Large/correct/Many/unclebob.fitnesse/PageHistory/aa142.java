diff --git a/src/fitnesse/responders/testHistory/PageHistory.java b/src/fitnesse/responders/testHistory/PageHistory.java
index a7aab7c..8700e43 100644
--- a/src/fitnesse/responders/testHistory/PageHistory.java
+++ b/src/fitnesse/responders/testHistory/PageHistory.java
@@ -223,7 +223,7 @@
   }
 
   public static String formatDate(String format, Date date) {
-    SimpleDateFormat fmt = new SimpleDateFormat(format);
+    SimpleDateFormat fmt = new SimpleDateFormat(format, Locale.US);
     return fmt.format(date);
   }
 
