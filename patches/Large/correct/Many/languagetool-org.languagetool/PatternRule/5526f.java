diff --git a/languagetool-core/src/main/java/org/languagetool/rules/patterns/PatternRule.java b/languagetool-core/src/main/java/org/languagetool/rules/patterns/PatternRule.java
index 4c3d506..1deec98 100644
--- a/languagetool-core/src/main/java/org/languagetool/rules/patterns/PatternRule.java
+++ b/languagetool-core/src/main/java/org/languagetool/rules/patterns/PatternRule.java
@@ -244,7 +244,7 @@
         if (!element.getNegation() && !element.isRegularExpression() 
                 && !element.isReferenceElement() && !element.isInflected() && element.getMinOccurrence() > 0) {
           String str = element.getString();
-          if (!str.isEmpty()) {
+          if (!StringTools.isEmpty(str)) {
             tokenSet.add(str.toLowerCase());
           }
         }
