diff --git a/src/test/java/com/squareup/javawriter/JavaWriterTest.java b/src/test/java/com/squareup/javawriter/JavaWriterTest.java
index 1a7dd82..4990037 100644
--- a/src/test/java/com/squareup/javawriter/JavaWriterTest.java
+++ b/src/test/java/com/squareup/javawriter/JavaWriterTest.java
@@ -188,7 +188,7 @@
     javaWriter.emitPackage("com.squareup");
     javaWriter.beginType("com.squareup.Foo", "class", 0);
     javaWriter.beginMethod("int", "foo", 0, "java.lang.String", "s");
-    javaWriter.emitSingleLineCOmment("foo");
+    javaWriter.emitSingleLineComment("foo");
     javaWriter.emitStatement("int j = s.length() + %s", 13);
     javaWriter.endMethod();
     javaWriter.endType();
@@ -452,7 +452,7 @@
   }
 
   @Test public void eolComment() throws IOException {
-    javaWriter.emitSingleLineCOmment("foo");
+    javaWriter.emitSingleLineComment("foo");
     assertCode("// foo\n");
   }
 
