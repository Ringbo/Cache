diff --git a/languagetool-core/src/main/java/org/languagetool/JLanguageTool.java b/languagetool-core/src/main/java/org/languagetool/JLanguageTool.java
index e553fdc..d0281af 100644
--- a/languagetool-core/src/main/java/org/languagetool/JLanguageTool.java
+++ b/languagetool-core/src/main/java/org/languagetool/JLanguageTool.java
@@ -616,7 +616,7 @@
       if (disabledCategories.contains(category.getName())) {
         return true;
       }
-      if (category.isDefaultOff() && !enabledRuleCategories.contains(category.getId())) {
+      if (category.isDefaultOff() && !enabledRuleCategories.contains(category.getId()) && !enabledRules.contains(rule.getId())) {
         return true;
       }
     }
