diff --git a/plugins/gradle/src/org/jetbrains/plugins/gradle/service/resolve/GradleConfigurationsNonCodeMembersContributor.java b/plugins/gradle/src/org/jetbrains/plugins/gradle/service/resolve/GradleConfigurationsNonCodeMembersContributor.java
index 54de0da..b9d39d0 100644
--- a/plugins/gradle/src/org/jetbrains/plugins/gradle/service/resolve/GradleConfigurationsNonCodeMembersContributor.java
+++ b/plugins/gradle/src/org/jetbrains/plugins/gradle/service/resolve/GradleConfigurationsNonCodeMembersContributor.java
@@ -45,7 +45,7 @@
                                      PsiScopeProcessor processor,
                                      PsiElement place,
                                      ResolveState state) {
-    if (place == null) {
+    if (place == null || aClass == null) {
       return;
     }
 
