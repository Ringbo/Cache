diff --git a/xchange-bitstamp/src/test/java/com/xeiam/xchange/bitstamp/BitstampAdapterTest.java b/xchange-bitstamp/src/test/java/com/xeiam/xchange/bitstamp/BitstampAdapterTest.java
index 29979dd..f314938 100644
--- a/xchange-bitstamp/src/test/java/com/xeiam/xchange/bitstamp/BitstampAdapterTest.java
+++ b/xchange-bitstamp/src/test/java/com/xeiam/xchange/bitstamp/BitstampAdapterTest.java
@@ -88,7 +88,7 @@
     assertThat(orderBook.getBids().get(0).getTransactionCurrency()).isEqualTo("USD");
     SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     f.setTimeZone(TimeZone.getTimeZone("UTC"));
-    String dateString = f.format(orderBook.getDate());
+    String dateString = f.format(orderBook.getTimeStamp());
     assertThat(dateString).isEqualTo("2013-09-10 12:31:44");
   }
 
