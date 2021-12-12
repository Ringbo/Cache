diff --git a/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/value/DexBackedAnnotationEncodedValue.java b/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/value/DexBackedAnnotationEncodedValue.java
index 8890aac..af53ef8 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/value/DexBackedAnnotationEncodedValue.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/value/DexBackedAnnotationEncodedValue.java
@@ -49,7 +49,7 @@
 
     public DexBackedAnnotationEncodedValue(@Nonnull DexReader reader) {
         this.dexBuf = reader.getDexBuffer();
-        this.type = reader.getString(reader.readSmallUleb128());
+        this.type = reader.getType(reader.readSmallUleb128());
         this.elementsOffset = reader.getOffset();
         skipElements(reader);
     }
