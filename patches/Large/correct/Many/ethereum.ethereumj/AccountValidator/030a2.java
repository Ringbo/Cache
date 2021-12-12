diff --git a/ethereumj-core/src/main/java/org/ethereum/jsontestsuite/validators/AccountValidator.java b/ethereumj-core/src/main/java/org/ethereum/jsontestsuite/validators/AccountValidator.java
index db70db0..78364e3 100644
--- a/ethereumj-core/src/main/java/org/ethereum/jsontestsuite/validators/AccountValidator.java
+++ b/ethereumj-core/src/main/java/org/ethereum/jsontestsuite/validators/AccountValidator.java
@@ -59,14 +59,14 @@
 
         for (DataWord key : currentKeys) {
 
-            DataWord currentValue = currentDetails.getStorage().get(expectedKeys);
+            DataWord currentValue = currentDetails.getStorage().get(key);
             DataWord expectedValue = expectedDetails.getStorage().get(key);
             if (expectedValue == null) {
 
                 String formattedString = String.format("Account: %s: has unexpected storage data: %s = %s",
                         address,
-                        currentValue,
-                        expectedValue);
+                        key,
+                        currentValue);
 
                 results.add(formattedString);
                 continue;
