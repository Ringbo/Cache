diff --git a/src/test/java/net/sf/jabref/logic/l10n/LocalizationParser.java b/src/test/java/net/sf/jabref/logic/l10n/LocalizationParser.java
index fc32e2e..c887dde 100644
--- a/src/test/java/net/sf/jabref/logic/l10n/LocalizationParser.java
+++ b/src/test/java/net/sf/jabref/logic/l10n/LocalizationParser.java
@@ -180,7 +180,7 @@
                 .collect(Collectors.toList());
     }
 
-    private static class JavaLocalizationEntryParser {
+    static class JavaLocalizationEntryParser {
 
         private static final String INFINITE_WHITESPACE = "\\s*";
         private static final String DOT = "\\.";
