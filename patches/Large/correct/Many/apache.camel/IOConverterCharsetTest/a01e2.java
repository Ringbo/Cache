diff --git a/camel-core/src/test/java/org/apache/camel/converter/IOConverterCharsetTest.java b/camel-core/src/test/java/org/apache/camel/converter/IOConverterCharsetTest.java
index 4d30291..fe74d75 100644
--- a/camel-core/src/test/java/org/apache/camel/converter/IOConverterCharsetTest.java
+++ b/camel-core/src/test/java/org/apache/camel/converter/IOConverterCharsetTest.java
@@ -31,7 +31,8 @@
     public void testToInputStreamFileWithCharsetUTF8() throws Exception {
         File file = new File("src/test/resources/org/apache/camel/converter/german.utf-8.txt");
         InputStream in = IOConverter.toInputStream(file, "UTF-8");
-        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
+        // need to specify the encoding of the input stream bytes
+        BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
         BufferedReader naiveReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
         try {   
             String line = reader.readLine();
@@ -48,7 +49,8 @@
     public void testToInputStreamFileWithCharsetLatin1() throws Exception {
         File file = new File("src/test/resources/org/apache/camel/converter/german.iso-8859-1.txt");
         InputStream in = IOConverter.toInputStream(file, "ISO-8859-1");
-        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
+        // need to specify the encoding of the input stream bytes
+        BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
         BufferedReader naiveReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "ISO-8859-1"));
         try {
             String line = reader.readLine();
