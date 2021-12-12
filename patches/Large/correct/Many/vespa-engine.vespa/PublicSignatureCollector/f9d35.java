diff --git a/abi-check-plugin/src/main/java/com/yahoo/abicheck/collector/PublicSignatureCollector.java b/abi-check-plugin/src/main/java/com/yahoo/abicheck/collector/PublicSignatureCollector.java
index 1d931a3..d90b3c1 100644
--- a/abi-check-plugin/src/main/java/com/yahoo/abicheck/collector/PublicSignatureCollector.java
+++ b/abi-check-plugin/src/main/java/com/yahoo/abicheck/collector/PublicSignatureCollector.java
@@ -93,7 +93,7 @@
     }
     // Protected members are visible if the class is not final (can be accessed from
     // extending classes)
-    if (!testBit(access, Opcodes.ACC_PROTECTED) && !testBit(currentAccess, Opcodes.ACC_FINAL)) {
+    if (testBit(access, Opcodes.ACC_PROTECTED) && !testBit(currentAccess, Opcodes.ACC_FINAL)) {
       return true;
     }
     // Otherwise not visible
