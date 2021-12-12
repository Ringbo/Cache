diff --git a/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/CorePlugin.java b/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/CorePlugin.java
index f599ea6..6e082c1 100644
--- a/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/CorePlugin.java
+++ b/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/CorePlugin.java
@@ -149,9 +149,9 @@
     extensions.add(CodeCoverageWidget.class);
     extensions.add(CommentsDuplicationsWidget.class);
     extensions.add(DescriptionWidget.class);
-    extensions.add(DefaultExtendedAnalysisWidget.class);
+    extensions.add(ComplexityWidget.class);
     extensions.add(RulesWidget.class);
-    extensions.add(DefaultStaticAnalysisWidget.class);
+    extensions.add(SizeWidget.class);
     extensions.add(EventsWidget.class);
     extensions.add(CustomMeasuresWidget.class);
 
