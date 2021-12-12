diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/Main.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/Main.java
index a6f302c..51cdd3f 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/Main.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/Main.java
@@ -102,7 +102,7 @@
       final String text = 
         getFilteredText(filename, encoding);
         if (!taggerOnly) {
-        Tools.checkText(text, lt);
+        Tools.checkText(text, lt, apiFormat);
         } else {
           Tools.tagText(text, lt);
         }                
@@ -193,7 +193,7 @@
   private static void exitWithUsageMessage() {
     System.out.println("Usage: java de.danielnaber.languagetool.Main " +
             "[-r|--recursive] [-v|--verbose] [-l|--language LANG] [-m|--mothertongue LANG] [-d|--disable RULES] " +
-            "[-e|--enable RULES] [-c|--encoding] [-u|--list-unknown] [-t|--taggeronly] [-b] <file>");
+    "[-e|--enable RULES] [-c|--encoding] [-u|--list-unknown] [-t|--taggeronly] [-b] [--api] <file>");
     System.exit(1);
   }
 
@@ -227,12 +227,12 @@
         recursive = true;
       } else if (args[i].equals("-d") || args[i].equals("--disable")) {
         if (enabledRules.length > 0)
-          throw new IllegalArgumentException("You cannot specifiy both enabled and disabled rules");
+          throw new IllegalArgumentException("You cannot specify both enabled and disabled rules");
         String rules = args[++i];
         disabledRules = rules.split(",");
       } else if (args[i].equals("-e") || args[i].equals("--enable")) {
         if (disabledRules.length > 0)
-          throw new IllegalArgumentException("You cannot specifiy both enabled and disabled rules");
+          throw new IllegalArgumentException("You cannot specify both enabled and disabled rules");
         String rules = args[++i];
         enabledRules = rules.split(",");
       } else if (args[i].equals("-l") || args[i].equals("--language")) {
