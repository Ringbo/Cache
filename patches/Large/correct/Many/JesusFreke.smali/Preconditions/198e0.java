diff --git a/dexlib2/src/main/java/org/jf/dexlib2/util/Preconditions.java b/dexlib2/src/main/java/org/jf/dexlib2/util/Preconditions.java
index e7f6313..ab86b65 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/util/Preconditions.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/util/Preconditions.java
@@ -118,7 +118,7 @@
     }
 
     public static int checkShortCodeOffset(int offset) {
-        if (offset < -32768 || offset > 32768) {
+        if (offset < -32768 || offset > 32767) {
             throw new IllegalArgumentException(
                     String.format("Invalid code offset: %d. Must be between -32768 and 32767, inclusive.", offset));
         }
