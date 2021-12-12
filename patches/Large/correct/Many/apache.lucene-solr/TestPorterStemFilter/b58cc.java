diff --git a/src/test/org/apache/lucene/analysis/TestPorterStemFilter.java b/src/test/org/apache/lucene/analysis/TestPorterStemFilter.java
index d377577..471ac08 100644
--- a/src/test/org/apache/lucene/analysis/TestPorterStemFilter.java
+++ b/src/test/org/apache/lucene/analysis/TestPorterStemFilter.java
@@ -33,11 +33,11 @@
    * Run the stemmer against all strings in voc.txt
    * The output should be the same as the string in output.txt
    */
-  public void testPorterStemFilter() throws IOException {
+  public void testPorterStemFilter() throws Exception {
     Tokenizer tokenizer = new KeywordTokenizer(new StringReader(""));
     TokenStream filter = new PorterStemFilter(tokenizer);   
     ZipFile zipFile = new ZipFile(
-        new File(getClass().getResource("porterTestData.zip").getFile()));
+        new File(getClass().getResource("porterTestData.zip").toURI()));
     InputStream voc = zipFile.getInputStream(zipFile.getEntry("voc.txt"));
     InputStream out = zipFile.getInputStream(zipFile.getEntry("output.txt"));
     BufferedReader vocReader = new BufferedReader(new InputStreamReader(
