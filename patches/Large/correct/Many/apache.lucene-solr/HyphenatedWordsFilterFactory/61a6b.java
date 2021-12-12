diff --git a/src/java/org/apache/solr/analysis/HyphenatedWordsFilterFactory.java b/src/java/org/apache/solr/analysis/HyphenatedWordsFilterFactory.java
index c9944a9..bf97025 100755
--- a/src/java/org/apache/solr/analysis/HyphenatedWordsFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/HyphenatedWordsFilterFactory.java
@@ -24,7 +24,7 @@
  * Factory for HyphenatedWordsFilter
  */
 public class HyphenatedWordsFilterFactory extends BaseTokenFilterFactory {
-	public TokenStream create(TokenStream input) {
+	public HyphenatedWordsFilter create(TokenStream input) {
 		return new HyphenatedWordsFilter(input);
 	}
 }
