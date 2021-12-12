diff --git a/src/main/java/org/tron/core/db/WitnessStore.java b/src/main/java/org/tron/core/db/WitnessStore.java
index 29283d5..94dccfa 100644
--- a/src/main/java/org/tron/core/db/WitnessStore.java
+++ b/src/main/java/org/tron/core/db/WitnessStore.java
@@ -33,13 +33,13 @@
   @Override
   public boolean has(byte[] key) {
     byte[] account = dbSource.getData(key);
-    if (account == null) {
+    if (account != null) {
       // For debugging
       String readableWitnessAddress = StringUtil.createReadableString(account);
       List<String> allReadableWitnessAddress =
           StringUtil.getAddressStringListFromByteArray(dbSource.allKeys());
       logger.warn(
-          "address is {},witness is {},allWitness : ",
+          "address is {},witness is {},allWitness : {}",
           key,
           readableWitnessAddress,
           allReadableWitnessAddress);
