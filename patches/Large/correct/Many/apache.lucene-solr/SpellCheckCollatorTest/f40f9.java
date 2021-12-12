diff --git a/solr/core/src/test/org/apache/solr/spelling/SpellCheckCollatorTest.java b/solr/core/src/test/org/apache/solr/spelling/SpellCheckCollatorTest.java
index ac7b19e..aad834b 100644
--- a/solr/core/src/test/org/apache/solr/spelling/SpellCheckCollatorTest.java
+++ b/solr/core/src/test/org/apache/solr/spelling/SpellCheckCollatorTest.java
@@ -376,7 +376,7 @@
   public void testContextSensitiveCollate() throws Exception {
     //                     DirectSolrSpellChecker   IndexBasedSpellChecker
     String[] dictionary = {"direct",                "default_teststop" };
-    for(int i=0 ; i<1 ; i++) {
+    for(int i=0 ; i<=1 ; i++) {
       assertQ(
         req(
           "q", "teststop:(flew AND form AND heathrow)",
