diff --git a/languagetool-language-modules/nl/src/main/java/org/languagetool/rules/nl/DateCheckFilter.java b/languagetool-language-modules/nl/src/main/java/org/languagetool/rules/nl/DateCheckFilter.java
index 4b9c68b..0a9d395 100644
--- a/languagetool-language-modules/nl/src/main/java/org/languagetool/rules/nl/DateCheckFilter.java
+++ b/languagetool-language-modules/nl/src/main/java/org/languagetool/rules/nl/DateCheckFilter.java
@@ -77,7 +77,7 @@
     if (mon.startsWith("jul")) return 7;
     if (mon.startsWith("aug")) return 8;
     if (mon.startsWith("sep")) return 9;
-    if (mon.startsWith("okt")) return 10;
+    if (mon.startsWith("okt") || mon.startsWith("oct")) return 10;
     if (mon.startsWith("nov")) return 11;
     if (mon.startsWith("dec")) return 12;
     throw new RuntimeException("Could not find month '" + monthStr + "'");
