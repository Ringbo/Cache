diff --git a/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/SubjectVerbAgreementRuleTest.java b/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/SubjectVerbAgreementRuleTest.java
index 6ea35b5..2e20984 100644
--- a/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/SubjectVerbAgreementRuleTest.java
+++ b/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/SubjectVerbAgreementRuleTest.java
@@ -407,7 +407,8 @@
         "Er ahnt nicht, dass sie und sein Sohn ein Paar sind.",
         "Die Ursachen der vorliegenden Durchblutungsstörung sind noch unbekannt.",
         "Der See und das Marschland sind ein Naturschutzgebiet",
-        "Details, Dialoge, wie auch die Typologie der Charaktere sind frei erfunden."
+        "Details, Dialoge, wie auch die Typologie der Charaktere sind frei erfunden.",
+        "Die internen Ermittler und auch die Staatsanwaltschaft sind nun am Zug."
     );
     for (String sentence : sentences) {
       assertGood(sentence);
