diff --git a/plugins/gradle/testSources/org/jetbrains/plugins/gradle/GradleProjectWizardTest.java b/plugins/gradle/testSources/org/jetbrains/plugins/gradle/GradleProjectWizardTest.java
index 1f83bfb..b8ff35f 100644
--- a/plugins/gradle/testSources/org/jetbrains/plugins/gradle/GradleProjectWizardTest.java
+++ b/plugins/gradle/testSources/org/jetbrains/plugins/gradle/GradleProjectWizardTest.java
@@ -36,7 +36,7 @@
         if (step instanceof ProjectTypeStep) {
           assertTrue(((ProjectTypeStep)step).setSelectedTemplate("Gradle", null));
           List<ModuleWizardStep> steps = myWizard.getSequence().getSelectedSteps();
-          assertEquals(4, steps.size());
+          assertEquals(3, steps.size());
         }
       }
     });
