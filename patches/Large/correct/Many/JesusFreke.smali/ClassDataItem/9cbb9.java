diff --git a/dexlib/src/main/java/org/jf/dexlib/ClassDataItem.java b/dexlib/src/main/java/org/jf/dexlib/ClassDataItem.java
index c475003..1213fa6 100644
--- a/dexlib/src/main/java/org/jf/dexlib/ClassDataItem.java
+++ b/dexlib/src/main/java/org/jf/dexlib/ClassDataItem.java
@@ -119,25 +119,25 @@
 
         EncodedField previousEncodedField = null;
         for (EncodedField encodedField: staticFields) {
-            offset += encodedField.place(offset, previousEncodedField);
+            offset = encodedField.place(offset, previousEncodedField);
             previousEncodedField = encodedField;
         }
 
         previousEncodedField = null;
         for (EncodedField encodedField: instanceFields) {
-            offset += encodedField.place(offset, previousEncodedField);
+            offset = encodedField.place(offset, previousEncodedField);
             previousEncodedField = encodedField;
         }
 
         EncodedMethod previousEncodedMethod = null;
         for (EncodedMethod encodedMethod: directMethods) {
-            offset += encodedMethod.place(offset, previousEncodedMethod);
+            offset = encodedMethod.place(offset, previousEncodedMethod);
             previousEncodedMethod = encodedMethod;
         }
 
         previousEncodedMethod = null;
         for (EncodedMethod encodedMethod: virtualMethods) {
-            offset += encodedMethod.place(offset, previousEncodedMethod);
+            offset = encodedMethod.place(offset, previousEncodedMethod);
             previousEncodedMethod = encodedMethod;
         }
 
@@ -448,7 +448,7 @@
 
             offset += Leb128Utils.unsignedLeb128Size(method.getIndex() - previousIndex);
             offset += Leb128Utils.unsignedLeb128Size(accessFlags);
-            offset += codeItem==null?1:Leb128Utils.unsignedLeb128Size(codeItem.getIndex());
+            offset += codeItem==null?1:Leb128Utils.unsignedLeb128Size(codeItem.getOffset());
             return  offset;
         }
 
