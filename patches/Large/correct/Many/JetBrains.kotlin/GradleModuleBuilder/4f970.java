diff --git a/idea/idea-gradle/src/org/jetbrains/kotlin/gradle/kdsl/GradleModuleBuilder.java b/idea/idea-gradle/src/org/jetbrains/kotlin/gradle/kdsl/GradleModuleBuilder.java
index 48be5be..7896378 100644
--- a/idea/idea-gradle/src/org/jetbrains/kotlin/gradle/kdsl/GradleModuleBuilder.java
+++ b/idea/idea-gradle/src/org/jetbrains/kotlin/gradle/kdsl/GradleModuleBuilder.java
@@ -133,7 +133,7 @@
       moduleName = getName();
     }
     else {
-      moduleName = ModuleGrouperKt.isQualifiedModuleNamesEnabled() && StringUtil.isNotEmpty(myProjectId.getGroupId())
+      moduleName = ModuleGrouperKt.isQualifiedModuleNamesEnabled(myWizardContext.getProject()) && StringUtil.isNotEmpty(myProjectId.getGroupId())
                    ? (myProjectId.getGroupId() + '.' + myProjectId.getArtifactId())
                    : myProjectId.getArtifactId();
     }
