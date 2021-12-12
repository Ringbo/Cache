diff --git a/languagetool-dev/src/main/java/org/languagetool/dev/RuleOverview.java b/languagetool-dev/src/main/java/org/languagetool/dev/RuleOverview.java
index ec9cfab..ecae53f 100644
--- a/languagetool-dev/src/main/java/org/languagetool/dev/RuleOverview.java
+++ b/languagetool-dev/src/main/java/org/languagetool/dev/RuleOverview.java
@@ -281,11 +281,11 @@
     return maintainerInfo;
   }
 
-  private class JavaFilter implements FileFilter {
+  private static class JavaFilter implements FileFilter {
 
     private final String langName;
 
-    public JavaFilter(String langName) {
+    JavaFilter(String langName) {
       this.langName = langName;
     }
 
