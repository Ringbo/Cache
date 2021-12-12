diff --git a/examples/src/main/java/com/google/bitcoin/examples/ForwardingService.java b/examples/src/main/java/com/google/bitcoin/examples/ForwardingService.java
index 065b0f2..8fadab7 100644
--- a/examples/src/main/java/com/google/bitcoin/examples/ForwardingService.java
+++ b/examples/src/main/java/com/google/bitcoin/examples/ForwardingService.java
@@ -43,7 +43,7 @@
     public static void main(String[] args) throws Exception {
         // This line makes the log output more compact and easily read, especially when using the JDK log adapter.
         BriefLogFormatter.init();
-        if (args.length < 2) {
+        if (args.length < 1) {
             System.err.println("Usage: address-to-send-back-to [regtest|testnet]");
             return;
         }
@@ -51,10 +51,10 @@
         // Figure out which network we should connect to. Each one gets its own set of files.
         NetworkParameters params;
         String filePrefix;
-        if (args[1].equals("testnet")) {
+        if (args.length > 1 && args[1].equals("testnet")) {
             params = TestNet3Params.get();
             filePrefix = "forwarding-service-testnet";
-        } else if (args[1].equals("regtest")) {
+        } else if (args.length > 1 && args[1].equals("regtest")) {
             params = RegTestParams.get();
             filePrefix = "forwarding-service-regtest";
         } else {
