diff --git a/src/main/java/org/apache/commons/lang3/AnnotationUtils.java b/src/main/java/org/apache/commons/lang3/AnnotationUtils.java
index 08cb5a0..431ead1 100644
--- a/src/main/java/org/apache/commons/lang3/AnnotationUtils.java
+++ b/src/main/java/org/apache/commons/lang3/AnnotationUtils.java
@@ -152,8 +152,9 @@
      * 
      * @param a the Annotation for a hash code calculation is desired, not null
      * @return the calculated hash code
-     * @throws IllegalAccessException if thrown during annotation access
-     * @throws InvocationTargetException if thrown during annotation access
+     * @throws RuntimeException if IllegalAccessException or InvocationTargetException 
+     * or any other Exception is thrown during annotation access
+     * @throws IllegalStateException if an annotation method invocation returns {@code null}
      */
     public static int hashCode(Annotation a) {
         int result = 0;
@@ -221,8 +222,7 @@
     }
 
     //besides modularity, this has the advantage of autoboxing primitives:
-    private static int hashMember(String name, Object value)
-            throws IllegalAccessException, InvocationTargetException {
+    private static int hashMember(String name, Object value) {
         int part1 = name.hashCode() * 127;
         if (value.getClass().isArray()) {
             return part1 ^ arrayMemberHash(value.getClass().getComponentType(), value);
