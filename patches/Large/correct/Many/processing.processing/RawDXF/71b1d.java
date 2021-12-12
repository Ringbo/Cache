diff --git a/dxf/RawDXF.java b/dxf/RawDXF.java
index a6a2003..ff47234 100644
--- a/dxf/RawDXF.java
+++ b/dxf/RawDXF.java
@@ -315,7 +315,9 @@
   public void beginShape(int kind) {
     shape = kind;
 
-    if ((shape != LINES) && (shape != TRIANGLES)) {
+    if ((shape != LINES) &&
+        (shape != LINE_STRIP) &&
+        (shape != TRIANGLES)) {
       String err =
         "RawDXF should only be used with beginRaw(), " +
         "as it only supports lines and triangles";
