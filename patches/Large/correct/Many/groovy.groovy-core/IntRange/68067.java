diff --git a/src/main/groovy/lang/IntRange.java b/src/main/groovy/lang/IntRange.java
index 8666266..7044c09 100644
--- a/src/main/groovy/lang/IntRange.java
+++ b/src/main/groovy/lang/IntRange.java
@@ -34,7 +34,7 @@
  * @author <a href="mailto:james@coredevelopers.net">James Strachan</a>
  * @version $Revision$
  */
-public class IntRange extends AbstractList implements Range {
+public class IntRange extends AbstractList<Integer> implements Range<Integer> {
 
     /**
      * Iterates through each number in an <code>IntRange</code>.
@@ -226,7 +226,7 @@
     /**
      * {@inheritDoc}
      */
-    public Object get(int index) {
+    public Integer get(int index) {
         if (index < 0) {
             throw new IndexOutOfBoundsException("Index: " + index + " should not be negative");
         }
