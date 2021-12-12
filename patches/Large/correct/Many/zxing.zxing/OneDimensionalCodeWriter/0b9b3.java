diff --git a/core/src/main/java/com/google/zxing/oned/OneDimensionalCodeWriter.java b/core/src/main/java/com/google/zxing/oned/OneDimensionalCodeWriter.java
index 35d54be..e75ac3d 100644
--- a/core/src/main/java/com/google/zxing/oned/OneDimensionalCodeWriter.java
+++ b/core/src/main/java/com/google/zxing/oned/OneDimensionalCodeWriter.java
@@ -93,9 +93,10 @@
   }
 
   /**
-   * Throw IllegalArgumentException if input contains characters other than digits 0-9.
+   * @param contents string to check for numeric characters
+   * @throws IllegalArgumentException if input contains characters other than digits 0-9.
    */
-  protected static final void checkNumeric(String contents) throws IllegalArgumentException {
+  protected static void checkNumeric(String contents) {
     if (!NUMERIC.matcher(contents).matches()) {
       throw new IllegalArgumentException("Input should only contain digits 0-9");
     }
