diff --git a/src/main/java/com/google/security/zynamics/reil/ReilInstruction.java b/src/main/java/com/google/security/zynamics/reil/ReilInstruction.java
index b71ab94..ce29ee8 100644
--- a/src/main/java/com/google/security/zynamics/reil/ReilInstruction.java
+++ b/src/main/java/com/google/security/zynamics/reil/ReilInstruction.java
@@ -75,11 +75,11 @@
     Preconditions.checkNotNull(mnemonic, "Argument mnemonic can't be null");
     this.mnemonic = ReilHelpers.MnemonicToMnemonicCode(mnemonic);
     this.firstOperand =
-        Preconditions.checkNotNull(firstOperand, "Argument firstOperand can't be null");
+        Preconditions.checkNotNull(firstOperand);
     this.secondOperand =
-        Preconditions.checkNotNull(secondOperand, "Argument secondOperand can't be null");
+        Preconditions.checkNotNull(secondOperand);
     this.thirdOperand =
-        Preconditions.checkNotNull(thirdOperand, "Argument thirdOperand can't be null");
+        Preconditions.checkNotNull(thirdOperand);
 
     this.address = address;
   }
