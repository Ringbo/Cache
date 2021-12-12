diff --git a/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/SubjectVerbAgreementRuleTest.java b/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/SubjectVerbAgreementRuleTest.java
index 895f5df..b60023e 100644
--- a/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/SubjectVerbAgreementRuleTest.java
+++ b/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/SubjectVerbAgreementRuleTest.java
@@ -287,7 +287,8 @@
         "Für in Österreich lebende Afrikaner und Afrikanerinnen ist dies nicht üblich.",
         "Von ursprünglich drei Almhütten ist noch eine erhalten.",
         "Einer seiner bedeutendsten Kämpfe war gegen den späteren Weltmeister.",
-        "Aufgrund stark schwankender Absatzmärkte war die GEFA-Flug Mitte der 90er Jahre gezwungen, ..."
+        "Aufgrund stark schwankender Absatzmärkte war die GEFA-Flug Mitte der 90er Jahre gezwungen, ...",
+        "Der Abzug der Besatzungssoldaten und deren mittlerweile ansässigen Angehörigen der Besatzungsmächte war vereinbart."
     );
     for (String sentence : sentences) {
       assertGood(sentence);
