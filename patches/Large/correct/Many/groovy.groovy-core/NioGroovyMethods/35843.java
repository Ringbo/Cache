diff --git a/subprojects/groovy-nio/src/main/java/org/codehaus/groovy/runtime/NioGroovyMethods.java b/subprojects/groovy-nio/src/main/java/org/codehaus/groovy/runtime/NioGroovyMethods.java
index c0242e0..287b1f2 100644
--- a/subprojects/groovy-nio/src/main/java/org/codehaus/groovy/runtime/NioGroovyMethods.java
+++ b/subprojects/groovy-nio/src/main/java/org/codehaus/groovy/runtime/NioGroovyMethods.java
@@ -455,7 +455,7 @@
     public static void write(Path self, String text) throws IOException {
         Writer writer = null;
         try {
-            writer = new OutputStreamWriter(Files.newOutputStream(self, CREATE, APPEND), Charset.defaultCharset());
+            writer = new OutputStreamWriter(Files.newOutputStream(self), Charset.defaultCharset());
             writer.write(text);
             writer.flush();
 
