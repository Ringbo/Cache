diff --git a/languagetool-language-modules/pt/src/main/java/org/languagetool/language/Portuguese.java b/languagetool-language-modules/pt/src/main/java/org/languagetool/language/Portuguese.java
index c96451e..0458aa7 100644
--- a/languagetool-language-modules/pt/src/main/java/org/languagetool/language/Portuguese.java
+++ b/languagetool-language-modules/pt/src/main/java/org/languagetool/language/Portuguese.java
@@ -119,8 +119,8 @@
             //Specific to Portuguese:
             new PostReformPortugueseCompoundRule(messages),
             new PortugueseReplaceRule(messages),
-            new PortugueseWordRepeatRule(messages, this),
-            new PortugueseWrongWordInContextRule(messages)
+            new PortugueseWordRepeatRule(messages, this)
+            //new PortugueseWrongWordInContextRule(messages)
     );
   }
 
