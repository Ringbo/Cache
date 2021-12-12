diff --git a/obex/javax/obex/ObexHelper.java b/obex/javax/obex/ObexHelper.java
index e6ade7b..f569595 100644
--- a/obex/javax/obex/ObexHelper.java
+++ b/obex/javax/obex/ObexHelper.java
@@ -875,7 +875,7 @@
      * @throws IllegalArgumentException if the byte array has an odd length
      */
     public static String convertToUnicode(byte[] b, boolean includesNull) {
-        if (b == null) {
+        if (b == null || b.length == 0) {
             return null;
         }
         int arrayLength = b.length;
