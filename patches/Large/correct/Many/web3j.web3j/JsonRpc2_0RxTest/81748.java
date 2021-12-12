diff --git a/src/test/java/org/web3j/protocol/rx/JsonRpc2_0RxTest.java b/src/test/java/org/web3j/protocol/rx/JsonRpc2_0RxTest.java
index 4e4f8f6..204ea97 100644
--- a/src/test/java/org/web3j/protocol/rx/JsonRpc2_0RxTest.java
+++ b/src/test/java/org/web3j/protocol/rx/JsonRpc2_0RxTest.java
@@ -90,7 +90,8 @@
     public void testCatchUpToLatestAndSubscribeToNewBlockObservable() throws Exception {
         List<EthBlock> expected = Arrays.asList(
                 createBlock(0), createBlock(1), createBlock(2),
-                createBlock(3), createBlock(4), createBlock(5));
+                createBlock(3), createBlock(4), createBlock(5),
+                createBlock(6));
 
         List<EthBlock> ethBlocks = Arrays.asList(
                 expected.get(2),  // greatest block
@@ -98,7 +99,8 @@
                 expected.get(4), // greatest block
                 expected.get(3), expected.get(4),
                 expected.get(4),  // greatest block
-                expected.get(5)); // subsequent block from new block observable
+                expected.get(5),  // initial response from ethGetFilterLogs call
+                expected.get(6)); // subsequent block from new block observable
 
         OngoingStubbing<EthBlock> stubbing =
                 when(web3jService.send(any(Request.class), eq(EthBlock.class)));
