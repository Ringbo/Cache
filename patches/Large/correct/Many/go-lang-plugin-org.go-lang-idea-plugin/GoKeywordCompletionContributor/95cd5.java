diff --git a/src/com/goide/completion/GoKeywordCompletionContributor.java b/src/com/goide/completion/GoKeywordCompletionContributor.java
index 8f29f38..29cd5cd 100644
--- a/src/com/goide/completion/GoKeywordCompletionContributor.java
+++ b/src/com/goide/completion/GoKeywordCompletionContributor.java
@@ -48,7 +48,8 @@
     extend(CompletionType.BASIC, importPattern(), new GoKeywordCompletionProvider(KEYWORD_PRIORITY, "import"));
     extend(CompletionType.BASIC, topLevelPattern(), new GoKeywordCompletionProvider(KEYWORD_PRIORITY, "const", "var", "func", "type"));
     extend(CompletionType.BASIC, insideBlockPattern(GoTypes.IDENTIFIER),
-           new GoKeywordCompletionProvider(KEYWORD_PRIORITY, "for", "const", "var", "return", "if", "switch", "go", "defer", "goto"));
+           new GoKeywordCompletionProvider(KEYWORD_PRIORITY, "type", "for", "const", "var", "return", "if", "switch", "go", "defer", 
+                                           "goto"));
     extend(CompletionType.BASIC, insideBlockPattern(GoTypes.IDENTIFIER),
            new GoKeywordCompletionProvider(KEYWORD_PRIORITY, EMPTY_INSERT_HANDLER, "fallthrough"));
     extend(CompletionType.BASIC, insideBlockPattern(GoTypes.IDENTIFIER),
