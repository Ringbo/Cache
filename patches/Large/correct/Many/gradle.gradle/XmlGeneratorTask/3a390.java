diff --git a/subprojects/ide/src/main/groovy/org/gradle/plugins/ide/api/XmlGeneratorTask.java b/subprojects/ide/src/main/groovy/org/gradle/plugins/ide/api/XmlGeneratorTask.java
index b263114..8168f9d 100644
--- a/subprojects/ide/src/main/groovy/org/gradle/plugins/ide/api/XmlGeneratorTask.java
+++ b/subprojects/ide/src/main/groovy/org/gradle/plugins/ide/api/XmlGeneratorTask.java
@@ -63,7 +63,7 @@
      */
     @Deprecated
     public void withXml(Closure closure) {
-        DeprecationLogger.nagUser("<someIdeTask>.withXml is deprecated! Moved to the relevant model object of eclipse/idea.\n"
+        DeprecationLogger.nagUserWith("<someIdeTask>.withXml is deprecated! Moved to the relevant model object of eclipse/idea.\n"
                 + "As a starting point, refer to the dsl guide for IdeaProject or EclipseProject");
         xmlTransformer.addAction(closure);
     }
@@ -80,7 +80,7 @@
      */
     @Deprecated
     public void withXml(Action<? super XmlProvider> action) {
-        DeprecationLogger.nagUser("<someIdeTask>.withXml is deprecated! Moved to the relevant model object of eclipse/idea.\n"
+        DeprecationLogger.nagUserWith("<someIdeTask>.withXml is deprecated! Moved to the relevant model object of eclipse/idea.\n"
                 + "As a starting point, refer to the dsl guide for IdeaProject or EclipseProject");
         xmlTransformer.addAction(action);
     }
