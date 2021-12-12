diff --git a/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java b/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
index aa4ec19..aad0f44 100644
--- a/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
+++ b/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
@@ -572,7 +572,7 @@
      * @param text
      * @return the Character object at the given index
      */
-    public static Object get(CharSequence text, int index) {
+    public static CharSequence get(CharSequence text, int index) {
         index = normaliseIndex(index, text.length());
         return text.subSequence(index, index + 1);
     }
@@ -580,7 +580,7 @@
     /**
      * Support the range subscript operator for String
      */
-    public static Object get(CharSequence text, Range range) {
+    public static CharSequence get(CharSequence text, Range range) {
         int from = normaliseIndex(InvokerHelper.asInt(range.getFrom()), text.length());
         int to = normaliseIndex(InvokerHelper.asInt(range.getTo()), text.length());
         int length = text.length();
@@ -677,11 +677,11 @@
     }
 
     /**
-     * Allows a List to be used as the indices to be used on a String
+     * Allows a List to be used as the indices to be used on a CharSequence
      * 
      * @returns a String of the values at the given indices
      */
-    public static String get(String self, Collection indices) {
+    public static CharSequence get(CharSequence self, Collection indices) {
         StringBuffer answer = new StringBuffer();
         for (Iterator iter = indices.iterator(); iter.hasNext();) {
             Object value = iter.next();
