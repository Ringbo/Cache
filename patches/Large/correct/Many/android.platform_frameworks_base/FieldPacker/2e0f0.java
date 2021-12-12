diff --git a/graphics/java/android/renderscript/FieldPacker.java b/graphics/java/android/renderscript/FieldPacker.java
index 2fb3d95..40628bc 100644
--- a/graphics/java/android/renderscript/FieldPacker.java
+++ b/graphics/java/android/renderscript/FieldPacker.java
@@ -233,16 +233,16 @@
         addI32(v.w);
     }
 
-    public void addU32(Int2 v) {
+    public void addU32(Long2 v) {
         addU32(v.x);
         addU32(v.y);
     }
-    public void addU32(Int3 v) {
+    public void addU32(Long3 v) {
         addU32(v.x);
         addU32(v.y);
         addU32(v.z);
     }
-    public void addU32(Int4 v) {
+    public void addU32(Long4 v) {
         addU32(v.x);
         addU32(v.y);
         addU32(v.z);
