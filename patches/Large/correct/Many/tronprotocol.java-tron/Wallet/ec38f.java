diff --git a/src/main/java/org/tron/core/Wallet.java b/src/main/java/org/tron/core/Wallet.java
index b9828b1..9752dc5 100755
--- a/src/main/java/org/tron/core/Wallet.java
+++ b/src/main/java/org/tron/core/Wallet.java
@@ -530,7 +530,7 @@
       throw new PermissionException("operations size must 32");
     }
     int contractType = contract.getTypeValue();
-    Boolean b = (operations.byteAt(contractType / 8) & (1 << (contractType % 8))) == 0;
+    Boolean b = (operations.byteAt(contractType / 8) & (1 << (contractType % 8))) != 0;
     return b;
   }
 
