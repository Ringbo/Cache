diff --git a/sonar-batch/src/main/java/org/sonar/batch/rule/RulesProfileWrapper.java b/sonar-batch/src/main/java/org/sonar/batch/rule/RulesProfileWrapper.java
index ffa23f3..7011138 100644
--- a/sonar-batch/src/main/java/org/sonar/batch/rule/RulesProfileWrapper.java
+++ b/sonar-batch/src/main/java/org/sonar/batch/rule/RulesProfileWrapper.java
@@ -80,7 +80,7 @@
       LOG.debug("Please update your plugin to support multi-language analysis", new SonarException("Please update your plugin to support multi-language analysis"));
       return "";
     }
-    return singleLanguageProfile.getName();
+    return singleLanguageProfile.getLanguage();
   }
 
   public RulesProfile getProfileByLanguage(String languageKey) {
