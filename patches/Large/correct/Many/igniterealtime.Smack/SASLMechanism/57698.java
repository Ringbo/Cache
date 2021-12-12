diff --git a/smack-core/src/main/java/org/jivesoftware/smack/sasl/SASLMechanism.java b/smack-core/src/main/java/org/jivesoftware/smack/sasl/SASLMechanism.java
index eba0d70..3ac5a68 100644
--- a/smack-core/src/main/java/org/jivesoftware/smack/sasl/SASLMechanism.java
+++ b/smack-core/src/main/java/org/jivesoftware/smack/sasl/SASLMechanism.java
@@ -195,7 +195,10 @@
     private final void authenticate() throws SmackException, NotConnectedException {
         byte[] authenticationBytes = getAuthenticationText();
         String authenticationText;
-        if (authenticationBytes != null) {
+        // Some SASL mechanisms do return an empty array (e.g. EXTERNAL from javax), so check that
+        // the array is not-empty. Mechanisms are allowed to return either 'null' or an empty array
+        // if there is no authentication text.
+        if (authenticationBytes != null && authenticationBytes.length > 0) {
             authenticationText = Base64.encodeToString(authenticationBytes);
         } else {
             // RFC6120 6.4.2 "If the initiating entity needs to send a zero-length initial response,
@@ -209,7 +212,8 @@
 
     /**
      * Should return the initial response of the SASL mechanism. The returned byte array will be
-     * send base64 encoded to the server. SASL mechanism are free to return <code>null</code> here.
+     * send base64 encoded to the server. SASL mechanism are free to return <code>null</code> or an
+     * empty array here.
      * 
      * @return the initial response or null
      * @throws SmackException
