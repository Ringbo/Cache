diff --git a/subprojects/ide/src/main/groovy/org/gradle/plugins/ide/api/GeneratorTask.java b/subprojects/ide/src/main/groovy/org/gradle/plugins/ide/api/GeneratorTask.java
index d2346df..c7432d8 100644
--- a/subprojects/ide/src/main/groovy/org/gradle/plugins/ide/api/GeneratorTask.java
+++ b/subprojects/ide/src/main/groovy/org/gradle/plugins/ide/api/GeneratorTask.java
@@ -125,7 +125,7 @@
      */
     @Deprecated
     public void beforeConfigured(Closure closure) {
-        DeprecationLogger.nagUser("<someIdeTask>.beforeConfigured is deprecated! Replaced by beforeMerged() method placed on the relevant model object of eclipse/idea.\n"
+        DeprecationLogger.nagUserWith("<someIdeTask>.beforeConfigured is deprecated! Replaced by beforeMerged() method placed on the relevant model object of eclipse/idea.\n"
                 + "As a starting point, refer to the dsl guide for IdeaProject or EclipseProject");
         beforeConfigured.add(closure);
     }
@@ -144,7 +144,7 @@
      */
     @Deprecated
     public void beforeConfigured(Action<? super T> action) {
-        DeprecationLogger.nagUser("<someIdeTask>.beforeConfigured is deprecated! Replaced by beforeMerged() method placed on the relevant model object of eclipse/idea.\n"
+        DeprecationLogger.nagUserWith("<someIdeTask>.beforeConfigured is deprecated! Replaced by beforeMerged() method placed on the relevant model object of eclipse/idea.\n"
                 + "As a starting point, refer to the dsl guide for IdeaProject or EclipseProject");
         beforeConfigured.add(action);
     }
@@ -163,7 +163,7 @@
      */
     @Deprecated
     public void whenConfigured(Closure closure) {
-        DeprecationLogger.nagUser("<someIdeTask>.whenConfigured is deprecated! Replaced by whenMerged() method placed on the relevant model object of eclipse/idea.\n"
+        DeprecationLogger.nagUserWith("<someIdeTask>.whenConfigured is deprecated! Replaced by whenMerged() method placed on the relevant model object of eclipse/idea.\n"
                 + "As a starting point, refer to the dsl guide for IdeaProject or EclipseProject");
         afterConfigured.add(closure);
     }
@@ -182,7 +182,7 @@
      */
     @Deprecated
     public void whenConfigured(Action<? super T> action) {
-        DeprecationLogger.nagUser("<someIdeTask>.whenConfigured is deprecated! Replaced by whenMerged() method placed on the relevant model object of eclipse/idea.\n"
+        DeprecationLogger.nagUserWith("<someIdeTask>.whenConfigured is deprecated! Replaced by whenMerged() method placed on the relevant model object of eclipse/idea.\n"
                 + "As a starting point, refer to the dsl guide for IdeaProject or EclipseProject");
         afterConfigured.add(action);
     }
