diff --git a/baksmali/src/main/java/org/jf/baksmali/Renderers/IntegerRenderer.java b/baksmali/src/main/java/org/jf/baksmali/Renderers/IntegerRenderer.java
index 30b764d..22beaac 100644
--- a/baksmali/src/main/java/org/jf/baksmali/Renderers/IntegerRenderer.java
+++ b/baksmali/src/main/java/org/jf/baksmali/Renderers/IntegerRenderer.java
@@ -45,6 +45,6 @@
 
     public static void writeUnsignedTo(IndentingWriter writer, int val) throws IOException {
         writer.write("0x");
-        writer.printUnsignedLongAsHex(val & 0xFFFFFFFF);
+        writer.printUnsignedLongAsHex(val & 0xFFFFFFFFL);
     }
 }
