diff --git a/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/testing/testng/TestNGTestClassProcessor.java b/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/testing/testng/TestNGTestClassProcessor.java
index 0bddec1..9b0e138 100755
--- a/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/testing/testng/TestNGTestClassProcessor.java
+++ b/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/testing/testng/TestNGTestClassProcessor.java
@@ -144,7 +144,7 @@
         try {
             JavaReflectionUtil.method(TestNG.class, void.class, "setGroupByInstances", boolean.class).invoke(testNg, options.getGroupByInstances());
         } catch (NoSuchMethodException e) {
-            if (options.getPreserveOrder()) {
+            if (options.getGroupByInstances()) {
                 throw e;
             }
         }
