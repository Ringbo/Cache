diff --git a/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/SubjectVerbAgreementRuleTest.java b/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/SubjectVerbAgreementRuleTest.java
index 7748642..dd34d24 100644
--- a/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/SubjectVerbAgreementRuleTest.java
+++ b/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/SubjectVerbAgreementRuleTest.java
@@ -379,7 +379,9 @@
         "Kommentare, Korrekturen, Kritik sind verboten.",
         "Letztere sind wichtig, um die Datensicherheit zu garantieren.",
         "Jüngere sind oft davon überzeugt, im Recht zu sein.",
-        "Verwandte sind selten mehr als Bekannte."
+        "Verwandte sind selten mehr als Bekannte.",
+        "Ursache waren die hohe Arbeitslosigkeit und die Wohnungsnot.",
+        "Ursache waren unter anderem die hohe Arbeitslosigkeit und die Wohnungsnot."
     );
     for (String sentence : sentences) {
       assertGood(sentence);
