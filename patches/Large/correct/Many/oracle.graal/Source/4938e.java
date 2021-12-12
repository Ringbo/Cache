diff --git a/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/source/Source.java b/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/source/Source.java
index ff945af..6a9e052 100644
--- a/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/source/Source.java
+++ b/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/source/Source.java
@@ -706,7 +706,7 @@
         private final String description;
         private final String code;
 
-        public LiteralSource(String description, String code) {
+        LiteralSource(String description, String code) {
             this.description = description;
             this.code = code;
         }
@@ -770,7 +770,7 @@
         private final String description;
         final List<CharSequence> codeList = new ArrayList<>();
 
-        public AppendableLiteralSource(String description) {
+        AppendableLiteralSource(String description) {
             this.description = description;
         }
 
@@ -833,7 +833,7 @@
 
         private String code = null;  // A cache of the file's contents
 
-        public FileSource(File file, String name, String path) {
+        FileSource(File file, String name, String path) {
             this.file = file.getAbsoluteFile();
             this.name = name;
             this.path = path;
@@ -938,7 +938,7 @@
         private final String path;  // Normalized path description of an actual file
         private String code;  // The file's contents, as provided by the client
 
-        public ClientManagedFileSource(File file, String name, String path, CharSequence chars) {
+        ClientManagedFileSource(File file, String name, String path, CharSequence chars) {
             this.file = file.getAbsoluteFile();
             this.name = name;
             this.path = path;
@@ -1035,7 +1035,7 @@
         private final String name;
         private String code;  // A cache of the source contents
 
-        public URLSource(URL url, String name) throws IOException {
+        URLSource(URL url, String name) throws IOException {
             this.url = url;
             this.name = name;
             URLConnection c = url.openConnection();
@@ -1143,7 +1143,7 @@
         private final int length;
         private final CharsetDecoder decoder;
 
-        public BytesSource(String name, byte[] bytes, int byteIndex, int length, Charset decoder) {
+        BytesSource(String name, byte[] bytes, int byteIndex, int length, Charset decoder) {
             this.name = name;
             this.bytes = bytes;
             this.byteIndex = byteIndex;
@@ -1256,7 +1256,7 @@
         // Is the final text character a newline?
         final boolean finalNL;
 
-        public TextMap(int[] nlOffsets, int textLength, boolean finalNL) {
+        TextMap(int[] nlOffsets, int textLength, boolean finalNL) {
             this.nlOffsets = nlOffsets;
             this.textLength = textLength;
             this.finalNL = finalNL;
