diff --git a/lucene/expressions/src/test/org/apache/lucene/expressions/js/TestCustomFunctions.java b/lucene/expressions/src/test/org/apache/lucene/expressions/js/TestCustomFunctions.java
index d9b6ba5..ed6d897 100644
--- a/lucene/expressions/src/test/org/apache/lucene/expressions/js/TestCustomFunctions.java
+++ b/lucene/expressions/src/test/org/apache/lucene/expressions/js/TestCustomFunctions.java
@@ -163,7 +163,7 @@
   }
   
   /** Classloader that can be used to create a fake static class that has one method returning a static var */
-  static class Loader extends ClassLoader implements Opcodes {
+  static final class Loader extends ClassLoader implements Opcodes {
     Loader(ClassLoader parent) {
       super(parent);
     }
@@ -227,7 +227,7 @@
     
     // use our classloader, not the foreign one, which should fail!
     try {
-      JavascriptCompiler.compile("bar()", functions, thisLoader);
+      JavascriptCompiler.compile("bar()", mixedFunctions, thisLoader);
       fail();
     } catch (IllegalArgumentException e) {
       assertTrue(e.getMessage().contains("is not declared by a class which is accessible by the given parent ClassLoader"));
