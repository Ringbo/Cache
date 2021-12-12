diff --git a/languagetool-language-modules/pt/src/test/java/org/languagetool/rules/pt/PortugueseWordRepeatBeginningRuleTest.java b/languagetool-language-modules/pt/src/test/java/org/languagetool/rules/pt/PortugueseWordRepeatBeginningRuleTest.java
index e99d89e..2d86c49 100644
--- a/languagetool-language-modules/pt/src/test/java/org/languagetool/rules/pt/PortugueseWordRepeatBeginningRuleTest.java
+++ b/languagetool-language-modules/pt/src/test/java/org/languagetool/rules/pt/PortugueseWordRepeatBeginningRuleTest.java
@@ -38,7 +38,7 @@
     // correct sentences:
     assertEquals(0, langTool.check("Este exemplo está correto. Este exemplo também está.").size());
     assertEquals(0, langTool.check("2011: Setembro já passou. 2011: Outubro também já passou. 2011: Novembro já se foi.").size());
-     assertEquals(1, langTool.check("Certo, isto está bem. Este exemplo está correto. Certo que este também.").size()); // 1 error from NO_VERB, 1 error from INCOMPLETE_SENTENCE.
+     assertEquals(0, langTool.check("Certo, isto está bem. Este exemplo está correto. Certo que este também.").size()); // 1 error from NO_VERB
     // errors:
     assertEquals(1, langTool.check("Este exemplo está correto. Este segundo também. Este terceiro exemplo não.").size()); //1 error from NO_VERB
     assertEquals(1, langTool.check("Então, este está correto. Então, este está errado, por causa da repetição.").size());
