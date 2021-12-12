diff --git a/src/edu/stanford/nlp/parser/nndep/DependencyParser.java b/src/edu/stanford/nlp/parser/nndep/DependencyParser.java
index 2ea6106..f306055 100644
--- a/src/edu/stanford/nlp/parser/nndep/DependencyParser.java
+++ b/src/edu/stanford/nlp/parser/nndep/DependencyParser.java
@@ -995,17 +995,17 @@
                 ? new BufferedReader(new InputStreamReader(System.in, encoding))
                 : IOUtils.readerFromString(inputFilename, encoding);
       } catch (IOException e) {
-        throw new RuntimeIOException(e);
+        throw new RuntimeIOException("No input file provided (use -parseFile)", e);
       }
 
       String outputFilename = props.getProperty("outFile");
       PrintWriter output;
       try {
-        output = outputFilename.equals("-")
+        output = outputFilename == null || outputFilename.equals("-")
             ? IOUtils.encodedOutputStreamPrintWriter(System.out, encoding, true)
             : IOUtils.getPrintWriter(outputFilename, encoding);
       } catch (IOException e) {
-        throw new RuntimeIOException(e);
+        throw new RuntimeIOException("Error opening output file", e);
       }
 
       parser.parseTextFile(input, output);
