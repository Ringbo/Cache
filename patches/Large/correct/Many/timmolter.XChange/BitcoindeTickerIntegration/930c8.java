diff --git a/xchange-bitcoinde/src/test/java/com/xeiam/xchange/bitcoinde/dto/marketdata/BitcoindeTickerIntegration.java b/xchange-bitcoinde/src/test/java/com/xeiam/xchange/bitcoinde/dto/marketdata/BitcoindeTickerIntegration.java
index 171d6ee..957c331 100644
--- a/xchange-bitcoinde/src/test/java/com/xeiam/xchange/bitcoinde/dto/marketdata/BitcoindeTickerIntegration.java
+++ b/xchange-bitcoinde/src/test/java/com/xeiam/xchange/bitcoinde/dto/marketdata/BitcoindeTickerIntegration.java
@@ -23,7 +23,7 @@
      * to set this variable.
      */
     final String API_KEY = System.getenv("BITCOINDE_API_KEY");
-    if (API_KEY == null) { // if the environmental variable isn't set
+    if (API_KEY == null || API_KEY == "") { // if the environmental variable isn't set
 	    System.err.println("Error: please set the environmental variable BITCOINDE_API_KEY equal to your API key before running this integration test. Try $ export BITCOINDE_API_KEY=myapikey123");
 	    System.exit(1);
     }
