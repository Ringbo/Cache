diff --git a/src/edu/stanford/nlp/pipeline/CleanXmlAnnotator.java b/src/edu/stanford/nlp/pipeline/CleanXmlAnnotator.java
index 890ba0e..2846620 100644
--- a/src/edu/stanford/nlp/pipeline/CleanXmlAnnotator.java
+++ b/src/edu/stanford/nlp/pipeline/CleanXmlAnnotator.java
@@ -699,7 +699,7 @@
             currSectionCoreMap.set(CoreAnnotations.AuthorAnnotation.class, foundAuthor);
             // get author mention info
             if (foundAuthor != null) {
-              Pattern p = Pattern.compile(foundAuthor);
+              Pattern p = Pattern.compile(foundAuthor, Pattern.LITERAL);
               Matcher matcher = p.matcher(sectionStartTagToken.word());
               if (matcher.find()) {
                 int authorMentionStart = matcher.start() + sectionStartTagCharBegin;
