diff --git a/src/main/java/org/apache/commons/lang3/tuple/Pair.java b/src/main/java/org/apache/commons/lang3/tuple/Pair.java
index 2bd364d..c5efb41 100644
--- a/src/main/java/org/apache/commons/lang3/tuple/Pair.java
+++ b/src/main/java/org/apache/commons/lang3/tuple/Pair.java
@@ -162,7 +162,7 @@
     /**
      * <p>Formats the receiver using the given format.</p>
      * 
-     * <p>This uses {@link Formattable} to perform the formatting. Two variable may
+     * <p>This uses {@link Formattable} to perform the formatting. Two variables may
      * be used to embed the left and right elements. Use {@code %1$} for the left
      * element (key) and {@code %2$} for the right element (value).
      * The default format used by {@code toString()} is {@code (%1$s,%2$s)}.</p>
@@ -170,7 +170,7 @@
      * @param format  the format string, optionally containing {@code %1$} and {@code %2$}, not null
      * @return the formatted string, not null
      */
-    public Object toString(String format) {
+    public String toString(String format) {
         return String.format(format, getLeft(), getRight());
     }
 
