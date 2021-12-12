diff --git a/ethereumj-core/src/test/java/test/ethereum/vm/VMComplexTest.java b/ethereumj-core/src/test/java/test/ethereum/vm/VMComplexTest.java
index 8153dd8..66da0b9 100644
--- a/ethereumj-core/src/test/java/test/ethereum/vm/VMComplexTest.java
+++ b/ethereumj-core/src/test/java/test/ethereum/vm/VMComplexTest.java
@@ -43,7 +43,7 @@
                      stop
          */
 
-        int expectedGas = 438;
+        int expectedGas = 436;
 
         DataWord key1 = new DataWord(999);
         DataWord value1 = new DataWord(3);
@@ -52,7 +52,7 @@
         String callerAddr = "cd2a3d9f938e13cd947ec05abc7fe734df8dd826";
         String contractAddr = "77045e71a7a2c50903d88e564cd72fab11e82051";
         String code =
-                "6103e75460005260006000511115630000004c576001600051036103e755600060006000600060007377045e71a7a2c50903d88e564cd72fab11e820516008600a5a0402f1630000004c565b00";
+                "6103e75460005260006000511115630000004c576001600051036103e755600060006000600060007377045e71a7a2c50903d88e564cd72fab11e820516008600a5a0402f1630000004c00565b00";
 
         byte[] contractAddrB = Hex.decode(contractAddr);
         byte[] callerAddrB = Hex.decode(callerAddr);
