diff --git a/languagetool-server/src/main/java/org/languagetool/server/LanguageToolHttpHandler.java b/languagetool-server/src/main/java/org/languagetool/server/LanguageToolHttpHandler.java
index 63a34bd..c15ca37 100644
--- a/languagetool-server/src/main/java/org/languagetool/server/LanguageToolHttpHandler.java
+++ b/languagetool-server/src/main/java/org/languagetool/server/LanguageToolHttpHandler.java
@@ -101,7 +101,7 @@
           if (referrer != null && referrer.startsWith(ref)) {
             errorMessage = "Error: Access with referrer " + referrer + " denied.";
           } else if (origin != null && origin.startsWith(ref)) {
-            errorMessage = "Error: Access with origin " + referrer + " denied.";
+            errorMessage = "Error: Access with origin " + origin + " denied.";
           }
         }
         if (errorMessage != null) {
