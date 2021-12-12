diff --git a/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/VerbAgreementRule.java b/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/VerbAgreementRule.java
index 84af4e0..855139b 100644
--- a/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/VerbAgreementRule.java
+++ b/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/VerbAgreementRule.java
@@ -205,7 +205,9 @@
     if (posEr > 0 && !isNear(posPossibleVer3Sin, posEr) && !isQuotationMark(tokens[posEr-1])) {
       final int plus1 = ((posEr + 1) == tokens.length) ? 0 : +1;
       if (!verbDoesMatchPersonAndNumber(tokens[posEr-1], tokens[posEr+plus1], "3", "SIN") 
-              && !nextButOneIsModal(tokens, posEr) && !"äußerst".equals(finiteVerb.getToken())) {
+              && !nextButOneIsModal(tokens, posEr)
+              && !"äußerst".equals(finiteVerb.getToken())
+              && !"regen".equals(finiteVerb.getToken())) {  // "wo er regen Anteil nahm"
         ruleMatches.add(ruleMatchWrongVerbSubject(tokens[posEr], finiteVerb, "3:SIN"));
       }
     }
