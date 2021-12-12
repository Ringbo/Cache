diff --git a/core/src/main/java/org/web3j/protocol/core/JsonRpc2_0Web3j.java b/core/src/main/java/org/web3j/protocol/core/JsonRpc2_0Web3j.java
index edc42b7..ab0671d 100644
--- a/core/src/main/java/org/web3j/protocol/core/JsonRpc2_0Web3j.java
+++ b/core/src/main/java/org/web3j/protocol/core/JsonRpc2_0Web3j.java
@@ -496,7 +496,7 @@
     public Request<?, EthUninstallFilter> ethUninstallFilter(BigInteger filterId) {
         return new Request<>(
                 "eth_uninstallFilter",
-                Arrays.asList(Numeric.encodeQuantity(filterId)),
+                Arrays.asList(Numeric.toHexStringWithPrefixSafe(filterId)),
                 web3jService,
                 EthUninstallFilter.class);
     }
@@ -505,7 +505,7 @@
     public Request<?, EthLog> ethGetFilterChanges(BigInteger filterId) {
         return new Request<>(
                 "eth_getFilterChanges",
-                Arrays.asList(Numeric.encodeQuantity(filterId)),
+                Arrays.asList(Numeric.toHexStringWithPrefixSafe(filterId)),
                 web3jService,
                 EthLog.class);
     }
@@ -661,7 +661,7 @@
     public Request<?, ShhUninstallFilter> shhUninstallFilter(BigInteger filterId) {
         return new Request<>(
                 "shh_uninstallFilter",
-                Arrays.asList(Numeric.encodeQuantity(filterId)),
+                Arrays.asList(Numeric.toHexStringWithPrefixSafe(filterId)),
                 web3jService,
                 ShhUninstallFilter.class);
     }
@@ -670,7 +670,7 @@
     public Request<?, ShhMessages> shhGetFilterChanges(BigInteger filterId) {
         return new Request<>(
                 "shh_getFilterChanges",
-                Arrays.asList(Numeric.encodeQuantity(filterId)),
+                Arrays.asList(Numeric.toHexStringWithPrefixSafe(filterId)),
                 web3jService,
                 ShhMessages.class);
     }
@@ -679,7 +679,7 @@
     public Request<?, ShhMessages> shhGetMessages(BigInteger filterId) {
         return new Request<>(
                 "shh_getMessages",
-                Arrays.asList(Numeric.encodeQuantity(filterId)),
+                Arrays.asList(Numeric.toHexStringWithPrefixSafe(filterId)),
                 web3jService,
                 ShhMessages.class);
     }
