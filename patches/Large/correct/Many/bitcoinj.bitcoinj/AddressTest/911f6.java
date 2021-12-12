diff --git a/core/src/test/java/org/bitcoinj/core/AddressTest.java b/core/src/test/java/org/bitcoinj/core/AddressTest.java
index d758e9b..451fe98 100644
--- a/core/src/test/java/org/bitcoinj/core/AddressTest.java
+++ b/core/src/test/java/org/bitcoinj/core/AddressTest.java
@@ -43,15 +43,15 @@
         Address testAddress = Address.fromBase58(testParams, "n4eA2nbYqErp7H6jebchxAN59DmNpksexv");
         ByteArrayOutputStream os = new ByteArrayOutputStream();
         new ObjectOutputStream(os).writeObject(testAddress);
-        VersionedChecksummedBytes testAddressCopy = (VersionedChecksummedBytes) new ObjectInputStream(
-                new ByteArrayInputStream(os.toByteArray())).readObject();
+        Address testAddressCopy = (Address) new ObjectInputStream(new ByteArrayInputStream(os.toByteArray()))
+                .readObject();
         assertEquals(testAddress, testAddressCopy);
 
         Address mainAddress = Address.fromBase58(mainParams, "17kzeh4N8g49GFvdDzSf8PjaPfyoD1MndL");
         os = new ByteArrayOutputStream();
         new ObjectOutputStream(os).writeObject(mainAddress);
-        VersionedChecksummedBytes mainAddressCopy = (VersionedChecksummedBytes) new ObjectInputStream(
-                new ByteArrayInputStream(os.toByteArray())).readObject();
+        Address mainAddressCopy = (Address) new ObjectInputStream(new ByteArrayInputStream(os.toByteArray()))
+                .readObject();
         assertEquals(mainAddress, mainAddressCopy);
     }
 
