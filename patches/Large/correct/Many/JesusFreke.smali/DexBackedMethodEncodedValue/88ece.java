diff --git a/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/value/DexBackedMethodEncodedValue.java b/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/value/DexBackedMethodEncodedValue.java
index a0941ce..0dafdce 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/value/DexBackedMethodEncodedValue.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/value/DexBackedMethodEncodedValue.java
@@ -41,14 +41,14 @@
 
 public class DexBackedMethodEncodedValue extends BaseMethodEncodedValue {
     @Nonnull public final DexBackedDexFile dexFile;
-    private final int MethodIndex;
+    private final int methodIndex;
 
     public DexBackedMethodEncodedValue(@Nonnull DexReader reader, int valueArg) {
         this.dexFile = reader.dexBuf;
-        MethodIndex = reader.readSizedSmallUint(valueArg + 1);
+        methodIndex = reader.readSizedSmallUint(valueArg + 1);
     }
 
     @Nonnull @Override public MethodReference getValue() {
-        return new DexBackedMethodReference(dexFile, MethodIndex);
+        return new DexBackedMethodReference(dexFile, methodIndex);
     }
 }
