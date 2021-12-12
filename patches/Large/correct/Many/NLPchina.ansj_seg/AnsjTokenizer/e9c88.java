diff --git a/plugin/ansj_lucene5_plugin/src/main/java/org/ansj/lucene/util/AnsjTokenizer.java b/plugin/ansj_lucene5_plugin/src/main/java/org/ansj/lucene/util/AnsjTokenizer.java
index 52bd2ba..06122fa 100644
--- a/plugin/ansj_lucene5_plugin/src/main/java/org/ansj/lucene/util/AnsjTokenizer.java
+++ b/plugin/ansj_lucene5_plugin/src/main/java/org/ansj/lucene/util/AnsjTokenizer.java
@@ -11,7 +11,7 @@
 import org.apache.lucene.analysis.tokenattributes.OffsetAttribute;
 import org.apache.lucene.analysis.tokenattributes.PositionIncrementAttribute;
 
-public class AnsjTokenizer extends Tokenizer {
+public final class AnsjTokenizer extends Tokenizer {
 	// 当前词
 	private final CharTermAttribute termAtt = addAttribute(CharTermAttribute.class);
 	// 偏移量
@@ -33,7 +33,7 @@
 	}
 
 	@Override
-	public boolean incrementToken() throws IOException {
+	public final boolean incrementToken() throws IOException {
 		clearAttributes();
 		int position = 0;
 		Term term = null;
