diff --git a/core/src/com/google/zxing/oned/Code93Reader.java b/core/src/com/google/zxing/oned/Code93Reader.java
index c8fe2aa..1106d5e 100644
--- a/core/src/com/google/zxing/oned/Code93Reader.java
+++ b/core/src/com/google/zxing/oned/Code93Reader.java
@@ -88,8 +88,8 @@
       throw NotFoundException.getNotFoundInstance();
     }
 
-    if (result.length() < 4) {
-      // Almost surely a false positive
+    if (result.length() < 2) {
+      // false positive -- need at least 2 checksum digits
       throw NotFoundException.getNotFoundInstance();
     }
 
