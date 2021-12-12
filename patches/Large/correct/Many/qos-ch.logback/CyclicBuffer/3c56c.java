diff --git a/logback-core/src/main/java/ch/qos/logback/core/helpers/CyclicBuffer.java b/logback-core/src/main/java/ch/qos/logback/core/helpers/CyclicBuffer.java
index fae7c73..622ebc1 100644
--- a/logback-core/src/main/java/ch/qos/logback/core/helpers/CyclicBuffer.java
+++ b/logback-core/src/main/java/ch/qos/logback/core/helpers/CyclicBuffer.java
@@ -82,7 +82,7 @@
    * is outside the range 0 to the number of elements currently in the buffer,
    * then <code>null</code> is returned.
    */
-  public Object get(int i) {
+  public E get(int i) {
     if (i < 0 || i >= numElems)
       return null;
 
