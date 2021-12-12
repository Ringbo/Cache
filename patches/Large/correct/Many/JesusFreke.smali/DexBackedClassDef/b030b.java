diff --git a/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/DexBackedClassDef.java b/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/DexBackedClassDef.java
index 6cc765e..883ac22 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/DexBackedClassDef.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/DexBackedClassDef.java
@@ -94,7 +94,7 @@
                 @Nonnull
                 @Override
                 public String readItem(int index) {
-                    return dexBuf.getType(dexBuf.readSmallUint(interfacesOffset + 4 + (2*index)));
+                    return dexBuf.getType(dexBuf.readUshort(interfacesOffset + 4 + (2*index)));
                 }
 
                 @Override public int size() { return size; }
