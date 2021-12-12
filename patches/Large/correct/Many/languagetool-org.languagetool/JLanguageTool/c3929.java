diff --git a/languagetool-core/src/main/java/org/languagetool/JLanguageTool.java b/languagetool-core/src/main/java/org/languagetool/JLanguageTool.java
index 7cc4957..131871a 100644
--- a/languagetool-core/src/main/java/org/languagetool/JLanguageTool.java
+++ b/languagetool-core/src/main/java/org/languagetool/JLanguageTool.java
@@ -1183,7 +1183,7 @@
           throw e;
         } catch (Exception e) {
           throw new RuntimeException("Could not check sentence (language: " + language + "): '"
-                  + StringUtils.abbreviate(analyzedSentence.toTextString(), 200) + "'", e);
+                  + StringUtils.abbreviate(analyzedSentence.toTextString(), 500) + "'", e);
         }
       }
       return ruleMatches;
