diff --git a/graphics/java/android/renderscript/FieldPacker.java b/graphics/java/android/renderscript/FieldPacker.java
index 6487623..fac7144 100644
--- a/graphics/java/android/renderscript/FieldPacker.java
+++ b/graphics/java/android/renderscript/FieldPacker.java
@@ -51,7 +51,7 @@
 
     public void skip(int i) {
         int res = mPos + i;
-        if ((res < 0) || (res >= mLen)) {
+        if ((res < 0) || (res > mLen)) {
             throw new RSIllegalArgumentException("out of range argument: " + i);
         }
         mPos = res;
