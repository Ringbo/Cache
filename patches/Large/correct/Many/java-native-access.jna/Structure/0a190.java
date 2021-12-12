diff --git a/src/com/sun/jna/Structure.java b/src/com/sun/jna/Structure.java
index a18999f..3f06aec 100644
--- a/src/com/sun/jna/Structure.java
+++ b/src/com/sun/jna/Structure.java
@@ -1285,7 +1285,7 @@
     }
 
     /** Override to supply native type information for the given field. */
-    protected Pointer getFieldTypeInfo(StructField f) {
+    Pointer getFieldTypeInfo(StructField f) {
         Class type = f.type;
         Object value = getField(f);
         if (typeMapper != null) {
