diff --git a/src/java/org/apache/solr/request/SpellCheckerRequestHandler.java b/src/java/org/apache/solr/request/SpellCheckerRequestHandler.java
index 3ad5df5..ba4fd9b 100644
--- a/src/java/org/apache/solr/request/SpellCheckerRequestHandler.java
+++ b/src/java/org/apache/solr/request/SpellCheckerRequestHandler.java
@@ -67,7 +67,7 @@
     public void init(NamedList args) {
         super.init(args);
         SolrParams p = SolrParams.toSolrParams(args);
-        restrictToField = p.get("termSourceField");
+        termSourceField = p.get("termSourceField");
         spellcheckerIndexDir = p.get("spellcheckerIndexDir");
         try {
             spellChecker = new SpellChecker(FSDirectory.getDirectory(spellcheckerIndexDir));
