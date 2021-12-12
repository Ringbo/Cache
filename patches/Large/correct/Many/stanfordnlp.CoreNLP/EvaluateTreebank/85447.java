diff --git a/src/edu/stanford/nlp/parser/lexparser/EvaluateTreebank.java b/src/edu/stanford/nlp/parser/lexparser/EvaluateTreebank.java
index b3ea82f..0769e8c 100644
--- a/src/edu/stanford/nlp/parser/lexparser/EvaluateTreebank.java
+++ b/src/edu/stanford/nlp/parser/lexparser/EvaluateTreebank.java
@@ -101,7 +101,7 @@
    * TODO: pass this in rather than create it here if we wind up using
    * this in more place.  Right now it's only used in testOnTreebank.
    */
-  protected Function<List<? extends HasWord>, ArrayList<TaggedWord>> tagger;
+  protected Function<List<? extends HasWord>, List<TaggedWord>> tagger;
 
   public EvaluateTreebank(LexicalizedParser parser) {
     this(parser.getOp(), parser.lex, parser);
@@ -122,7 +122,7 @@
         Class[] argsClass = { String.class };
         Object[] arguments = { op.testOptions.taggerSerializedFile };
         System.err.printf("Loading tagger from serialized file %s ...\n",op.testOptions.taggerSerializedFile);
-        tagger = (Function<List<? extends HasWord>,ArrayList<TaggedWord>>) Class.forName("edu.stanford.nlp.tagger.maxent.MaxentTagger").getConstructor(argsClass).newInstance(arguments);
+        tagger = (Function<List<? extends HasWord>,List<TaggedWord>>) Class.forName("edu.stanford.nlp.tagger.maxent.MaxentTagger").getConstructor(argsClass).newInstance(arguments);
       } catch (RuntimeException e) {
         throw e;
       } catch (Exception e) {
