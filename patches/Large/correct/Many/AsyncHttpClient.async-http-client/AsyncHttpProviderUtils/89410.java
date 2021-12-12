diff --git a/api/src/main/java/org/asynchttpclient/util/AsyncHttpProviderUtils.java b/api/src/main/java/org/asynchttpclient/util/AsyncHttpProviderUtils.java
index 4558844..a0599ee 100644
--- a/api/src/main/java/org/asynchttpclient/util/AsyncHttpProviderUtils.java
+++ b/api/src/main/java/org/asynchttpclient/util/AsyncHttpProviderUtils.java
@@ -516,7 +516,7 @@
     }
 
     public static int convertExpireField(String timestring) {
-        String trimmedTimeString = removeQuote(timestring.trim());
+        String trimmedTimeString = removeQuotes(timestring.trim());
 
         for (SimpleDateFormat sdf : simpleDateFormat.get()) {
             Date date = sdf.parse(trimmedTimeString, new ParsePosition(0));
