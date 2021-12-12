diff --git a/dexlib2/src/main/java/org/jf/dexlib2/util/Preconditions.java b/dexlib2/src/main/java/org/jf/dexlib2/util/Preconditions.java
index b9e2537..50508f0 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/util/Preconditions.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/util/Preconditions.java
@@ -136,7 +136,7 @@
     }
 
     public static int check3rcRegisterCount(int registerCount) {
-        if ((registerCount & 0xFFFFFF00) == 0) {
+        if ((registerCount & 0xFFFFFF00) != 0) {
             throw new IllegalArgumentException(
                     String.format("Invalid register count: %d. Must be between 0 and 255, inclusive.", registerCount));
         }
