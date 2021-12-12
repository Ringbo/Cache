diff --git a/src/main/java/org/tron/common/runtime/vm/PrecompiledContracts.java b/src/main/java/org/tron/common/runtime/vm/PrecompiledContracts.java
index 1c50da0..0278948 100644
--- a/src/main/java/org/tron/common/runtime/vm/PrecompiledContracts.java
+++ b/src/main/java/org/tron/common/runtime/vm/PrecompiledContracts.java
@@ -315,12 +315,12 @@
 
     @Override
     public Pair<Boolean, byte[]> execute(byte[] data) {
-      byte[] target = new byte[160];
+      byte[] target = new byte[20];
       if (data == null) {
         data = EMPTY_BYTE_ARRAY;
       }
       byte[] orig = Sha256Hash.hash(data);
-      System.arraycopy(orig, 0, target, 0, 160);
+      System.arraycopy(orig, 0, target, 0, 20);
       return Pair.of(true, Sha256Hash.hash(target));
     }
   }
