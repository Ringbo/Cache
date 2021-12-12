diff --git a/src/edu/stanford/nlp/pipeline/StanfordCoreNLPClient.java b/src/edu/stanford/nlp/pipeline/StanfordCoreNLPClient.java
index 923242d..d6ee60a 100644
--- a/src/edu/stanford/nlp/pipeline/StanfordCoreNLPClient.java
+++ b/src/edu/stanford/nlp/pipeline/StanfordCoreNLPClient.java
@@ -35,11 +35,12 @@
   private static final Redwood.RedwoodChannels log = Redwood.channels(StanfordCoreNLPClient.class);
 
   /** A simple URL spec, for parsing backend URLs */
-  private static final Pattern URL_PATTERN = Pattern.compile("(?:(https?)://)?([^:]+):([0-9]+)?");
+  private static final Pattern URL_PATTERN = Pattern.compile("(?:(https?)://)?([^:]+)(?::([0-9]+))?");
 
   /**
    * Information on how to connect to a backend.
    * The semantics of one of these objects is as follows:
+   *
    * <ul>
    *   <li>It should define a hostname and port to connect to.</li>
    *   <li>This represents ONE thread on the remote server. The client should
@@ -453,7 +454,7 @@
         //    2. It must not throw an exception
         doAnnotation(annotation, backend, serverURL, message, 0);
       } catch (Throwable t) {
-        log.warn("Could not annotate via server! Trying to annotate locally...", t);
+        log.err("Could not annotate via server! Trying to annotate locally...", t);
         StanfordCoreNLP corenlp = new StanfordCoreNLP(properties);
         corenlp.annotate(annotation);
       } finally {
@@ -673,15 +674,16 @@
 
 
   /**
-   * This can be used just for testing or for command-line text processing.
+   * Client that runs data through a StanfordCoreNLPServer either just for testing or for command-line text processing.
    * This runs the pipeline you specify on the
-   * text in the file that you specify and sends some results to stdout.
+   * text in the file(s) that you specify (with -file or -filelist) and sends some results to stdout.
    * The current code in this main method assumes that each line of the file
    * is to be processed separately as a single sentence.
-   * <p>
+   * A site must be specified with a protocol like "https:" in front of it.
+   *
    * Example usage:<br>
-   * java -mx6g edu.stanford.nlp.pipeline.StanfordCoreNLP -props properties -backends site1:port1,site2,port2 <br>
-   *    or just -host name -port number
+   * java -mx6g edu.stanford.nlp.pipeline.StanfordCoreNLP -props properties -backends site1:port1,site2:port2 <br>
+   *    or just -host https://foo.bar.com [-port 9000]
    *
    * @param args List of required properties
    * @throws java.io.IOException If IO problem
