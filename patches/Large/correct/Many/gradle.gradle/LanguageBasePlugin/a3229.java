diff --git a/subprojects/platform-base/src/main/java/org/gradle/language/base/plugins/LanguageBasePlugin.java b/subprojects/platform-base/src/main/java/org/gradle/language/base/plugins/LanguageBasePlugin.java
index 7bf945b..4dc9c5e 100644
--- a/subprojects/platform-base/src/main/java/org/gradle/language/base/plugins/LanguageBasePlugin.java
+++ b/subprojects/platform-base/src/main/java/org/gradle/language/base/plugins/LanguageBasePlugin.java
@@ -224,7 +224,7 @@
                     formatter.node("No buildable binaries found");
                     formatter.startChildren();
                     for (BinarySpecInternal binary : notBuildable) {
-                        formatter.node(binary.getName());
+                        formatter.node(binary.getDisplayName());
                         formatter.startChildren();
                         binary.getBuildAbility().explain(formatter);
                         formatter.endChildren();
