diff --git a/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/CorePlugin.java b/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/CorePlugin.java
index 826b347..5849d7c 100644
--- a/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/CorePlugin.java
+++ b/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/CorePlugin.java
@@ -365,7 +365,7 @@
       DescriptionWidget.class,
       ComplexityWidget.class,
       RulesWidget.class,
-      RulesWidget2.class,
+      IssuesBySeverity.class,
       SizeWidget.class,
       EventsWidget.class,
       CustomMeasuresWidget.class,
