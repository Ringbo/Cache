diff --git a/src/plugin/languageidentifier/src/java/org/apache/nutch/analysis/lang/LanguageIdentifier.java b/src/plugin/languageidentifier/src/java/org/apache/nutch/analysis/lang/LanguageIdentifier.java
index 3c83a00..c11b22f 100644
--- a/src/plugin/languageidentifier/src/java/org/apache/nutch/analysis/lang/LanguageIdentifier.java
+++ b/src/plugin/languageidentifier/src/java/org/apache/nutch/analysis/lang/LanguageIdentifier.java
@@ -422,7 +422,7 @@
       if (analyzeLength != 0) {
           len = Math.min(len, analyzeLength - text.length());
       }
-      text.append(new String(buffer, 0, len));
+      text.append(new String(buffer, 0, len, "UTF-8"));
     }
     return identify(text);
   }
