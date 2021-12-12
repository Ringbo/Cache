diff --git a/src/edu/stanford/nlp/pipeline/CleanXmlAnnotator.java b/src/edu/stanford/nlp/pipeline/CleanXmlAnnotator.java
index 44fddeb..1c954bd 100644
--- a/src/edu/stanford/nlp/pipeline/CleanXmlAnnotator.java
+++ b/src/edu/stanford/nlp/pipeline/CleanXmlAnnotator.java
@@ -699,7 +699,7 @@
             currSectionCoreMap.set(CoreAnnotations.AuthorAnnotation.class, foundAuthor);
             // get author mention info
             Pattern p = Pattern.compile(foundAuthor);
-            Matcher matcher = p.matcher(sectionStartToken.word());
+            Matcher matcher = p.matcher(sectionStartTagToken.word());
             if (matcher.find()) {
               int authorMentionStart = matcher.start() + sectionStartTagCharBegin;
               int authorMentionEnd = matcher.end() + sectionStartTagCharBegin;
