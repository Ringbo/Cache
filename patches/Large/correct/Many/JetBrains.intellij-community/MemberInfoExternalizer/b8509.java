diff --git a/compiler/impl/com/intellij/compiler/classParsing/MemberInfoExternalizer.java b/compiler/impl/com/intellij/compiler/classParsing/MemberInfoExternalizer.java
index 131cb95..abb2b43 100644
--- a/compiler/impl/com/intellij/compiler/classParsing/MemberInfoExternalizer.java
+++ b/compiler/impl/com/intellij/compiler/classParsing/MemberInfoExternalizer.java
@@ -47,7 +47,7 @@
   }
 
   public static ItemInfo loadItemInfo(DataInput in) throws IOException {
-    byte tag = in.readByte();
+    final byte tag = in.readByte();
     if (tag == DECLARATION_INFO_TAG) {
       return new DeclarationInfo(in);
     }
@@ -65,7 +65,7 @@
   }
 
   public static ConstantValue loadConstantValue(DataInput in) throws IOException {
-    byte tag = in.readByte();
+    final byte tag = in.readByte();
     if (tag == LONG_CONSTANT_TAG) {
       return new LongConstantValue(in);
     }
@@ -152,19 +152,19 @@
       out.writeByte(STRING_CONSTANT_TAG);
     }
     else if (value instanceof AnnotationConstantValue) {
-      out.write(ANNOTATION_CONSTANT_TAG);
+      out.writeByte(ANNOTATION_CONSTANT_TAG);
     }
     else if (value instanceof AnnotationPrimitiveConstantValue) {
-      out.write(ANNOTATION_PRIMITIVE_CONSTANT_TAG);
+      out.writeByte(ANNOTATION_PRIMITIVE_CONSTANT_TAG);
     }
     else if (value instanceof ConstantValueArray) {
-      out.write(CONSTANT_VALUE_ARRAY_TAG);
+      out.writeByte(CONSTANT_VALUE_ARRAY_TAG);
     }
     else if (value instanceof ClassInfoConstantValue) {
-      out.write(CLASS_CONSTANT_VALUE_TAG);
+      out.writeByte(CLASS_CONSTANT_VALUE_TAG);
     }
     else if (value instanceof EnumConstantValue) {
-      out.write(ENUM_CONSTANT_VALUE_TAG);
+      out.writeByte(ENUM_CONSTANT_VALUE_TAG);
     }
     else {
       out.writeByte(CONSTANT_TAG);
