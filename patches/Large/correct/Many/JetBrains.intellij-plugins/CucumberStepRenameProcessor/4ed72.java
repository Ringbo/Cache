diff --git a/cucumber/src/org/jetbrains/plugins/cucumber/psi/refactoring/rename/CucumberStepRenameProcessor.java b/cucumber/src/org/jetbrains/plugins/cucumber/psi/refactoring/rename/CucumberStepRenameProcessor.java
index f5ca2c0..04883d2 100644
--- a/cucumber/src/org/jetbrains/plugins/cucumber/psi/refactoring/rename/CucumberStepRenameProcessor.java
+++ b/cucumber/src/org/jetbrains/plugins/cucumber/psi/refactoring/rename/CucumberStepRenameProcessor.java
@@ -50,7 +50,7 @@
     final RegExpLexer lexer = new RegExpLexer(EnumSet.noneOf(RegExpCapability.class));
     lexer.start(source);
     IElementType previous = null;
-    final TokenSet toSkip = TokenSet.create(RegExpTT.CHARACTER, RegExpTT.CARET, RegExpTT.DOLLAR);
+    final TokenSet toSkip = TokenSet.create(RegExpTT.CHARACTER, RegExpTT.CARET, RegExpTT.DOLLAR, RegExpTT.REDUNDANT_ESCAPE);
 
     StringBuilder currentStaticText = new StringBuilder();
 
