diff --git a/platform/util/src/com/intellij/ui/mac/foundation/Foundation.java b/platform/util/src/com/intellij/ui/mac/foundation/Foundation.java
index 35eec62..bd7d3cf 100644
--- a/platform/util/src/com/intellij/ui/mac/foundation/Foundation.java
+++ b/platform/util/src/com/intellij/ui/mac/foundation/Foundation.java
@@ -208,7 +208,7 @@
   }
 
   private static long convertCFEncodingToNS(long cfEncoding) {
-    return myFoundationLibrary.CFStringConvertEncodingToNSStringEncoding(cfEncoding) & 0xffffffffffl;  // trim to C-type limits
+    return myFoundationLibrary.CFStringConvertEncodingToNSStringEncoding(cfEncoding) & 0xffffffffffL;  // trim to C-type limits
   }
 
   public static void cfRetain(ID id) {
