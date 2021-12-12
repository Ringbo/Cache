diff --git a/trunk/JLanguageTool/src/java/org/languagetool/rules/fr/QuestionWhitespaceRule.java b/trunk/JLanguageTool/src/java/org/languagetool/rules/fr/QuestionWhitespaceRule.java
index 2d55a65..e730c7a 100644
--- a/trunk/JLanguageTool/src/java/org/languagetool/rules/fr/QuestionWhitespaceRule.java
+++ b/trunk/JLanguageTool/src/java/org/languagetool/rules/fr/QuestionWhitespaceRule.java
@@ -32,6 +32,8 @@
  * A rule that matches spaces before ?,:,; and ! (required for correct French
  * punctuation).
  * 
+ * @see http://unicode.org/udhr/n/notes_fra.html
+ * 
  * @author Marcin Miłkowski
  */
 public class QuestionWhitespaceRule extends FrenchRule {
@@ -69,56 +71,62 @@
         if (token.equals("?")) {
           msg = "Point d'interrogation est précédé d'une espace fine insécable.";
           // non-breaking space
-          suggestionText = " ?";
+          suggestionText = " ?";
           fixLen = 1;
         } else if (token.equals("!")) {
           msg = "Point d'exclamation est précédé d'une espace fine insécable.";
           // non-breaking space
-          suggestionText = " !";
+          suggestionText = " !";
           fixLen = 1; 
         } else if (token.equals("»")) {
           msg = "Le guillemet fermant est précédé d'une espace fine insécable.";
           // non-breaking space
-          suggestionText = " »";
+          suggestionText = " »";
           fixLen = 1;
         } else if (token.equals(";")) {
           msg = "Point-virgule est précédé d'une espace fine insécable.";
           // non-breaking space
-          suggestionText = " ;";
+          suggestionText = " ;";
           fixLen = 1;
         } else if (token.equals(":")) {
           msg = "Deux-points sont précédé d'une espace fine insécable.";
           // non-breaking space
-          suggestionText = " :";
+          suggestionText = " :";
           fixLen = 1;
         }        
       } else {
+        // Stricly speaking, the character before ?!;: should be an
+        // "espace fine insécable" (U+202f).  In practise, an
+        // "espace insécable" (U+00a0) is also often used. Let's accept both.
         if (token.equals("?") && !prevToken.equals("!")
-            && !prevToken.equals("\u00a0")) {
+            && !prevToken.equals("\u00a0") && !prevToken.equals("\u202f")) {
           msg = "Point d'interrogation est précédé d'une espace fine insécable.";
           // non-breaking space
-          suggestionText = prevToken + " ?";
+          suggestionText = prevToken + " ?";
           fixLen = 1;
         } else if (token.equals("!") && !prevToken.equals("?")
-            && !prevToken.equals("\u00a0")) {
+            && !prevToken.equals("\u00a0") && !prevToken.equals("\u202f")) {
           msg = "Point d'exclamation est précédé d'une espace fine insécable.";
           // non-breaking space
-          suggestionText = prevToken + " !";
+          suggestionText = prevToken + " !";
           fixLen = 1;
-        } else if (token.equals(";") && !prevToken.equals("\u00a0")) {
+        } else if (token.equals(";")
+            && !prevToken.equals("\u00a0") && !prevToken.equals("\u202f")) {
           msg = "Point-virgule est précédé d'une espace fine insécable.";
           // non-breaking space
-          suggestionText = prevToken + " ;";
+          suggestionText = prevToken + " ;";
           fixLen = 1;
-        } else if (token.equals(":") && !prevToken.equals("\u00a0")) {
+        } else if (token.equals(":") 
+            && !prevToken.equals("\u00a0") && !prevToken.equals("\u202f")) {
           msg = "Deux-points précédés d'une espace fine insécable.";
           // non-breaking space
-          suggestionText = prevToken + " :";
+          suggestionText = prevToken + " :";
           fixLen = 1;
-        } else if (token.equals("»") && !prevToken.equals("\u00a0")) {
+        } else if (token.equals("»")
+            && !prevToken.equals("\u00a0") && !prevToken.equals("\u202f")) {
           msg = "Le guillemet fermant est précédé d'une espace fine insécable.";
           // non-breaking space
-          suggestionText = prevToken + " »";
+          suggestionText = prevToken + " »";
           fixLen = 1;
         }             
       } 
@@ -126,13 +134,13 @@
       if (StringTools.isEmpty(token) && prevToken.equals("«")) {
         msg = "Le guillemet ouvrant est suivi d'une espace fine insécable.";
         // non-breaking space
-        suggestionText = "« ";
+        suggestionText = "« ";
         fixLen = 1;
       }  else if (!StringTools.isEmpty(token) && !token.equals("\u00a0")
           && prevToken.equals("«")) {
         msg = "Le guillemet ouvrant est suivi d'une espace fine insécable.";
         // non-breaking space
-        suggestionText = "« ";
+        suggestionText = "« ";
         fixLen = 0;
       } 
 
