diff --git a/xchange-independentreserve/src/main/java/com/xeiam/xchange/independentreserve/service/IndependentReserveDigest.java b/xchange-independentreserve/src/main/java/com/xeiam/xchange/independentreserve/service/IndependentReserveDigest.java
index 32ed2c4..1ca8075 100644
--- a/xchange-independentreserve/src/main/java/com/xeiam/xchange/independentreserve/service/IndependentReserveDigest.java
+++ b/xchange-independentreserve/src/main/java/com/xeiam/xchange/independentreserve/service/IndependentReserveDigest.java
@@ -54,7 +54,7 @@
         logger.debug("digestParamsToString: nonce: {}",namedNonce);
         mac256.update(namedNonce.getBytes());
 
-        if(parameters != null) {
+        if(parameters != null && parameters.size() > 0) {
             List<String> namedParameters = new ArrayList<String>();
             for (Map.Entry<String, String> parameter : parameters.entrySet()) {
                 String namedParameter = parameter.getKey() + "=" + parameter.getValue();
