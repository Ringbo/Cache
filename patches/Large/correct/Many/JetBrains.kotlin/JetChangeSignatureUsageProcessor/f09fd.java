diff --git a/idea/src/org/jetbrains/kotlin/idea/refactoring/changeSignature/JetChangeSignatureUsageProcessor.java b/idea/src/org/jetbrains/kotlin/idea/refactoring/changeSignature/JetChangeSignatureUsageProcessor.java
index 4989708..b4c624b 100644
--- a/idea/src/org/jetbrains/kotlin/idea/refactoring/changeSignature/JetChangeSignatureUsageProcessor.java
+++ b/idea/src/org/jetbrains/kotlin/idea/refactoring/changeSignature/JetChangeSignatureUsageProcessor.java
@@ -593,7 +593,7 @@
                     if (processor.processUsage(javaChangeInfo, usage, beforeMethodChange, javaUsageInfos)) break;
                 }
                 if (usage instanceof OverriderUsageInfo) {
-                    PsiMethod overridingMethod = ((OverriderUsageInfo)usage).getElement();
+                    PsiMethod overridingMethod = ((OverriderUsageInfo)usage).getOverridingMethod();
                     if (overridingMethod != null) {
                         nullabilityPropagator.processMethod(overridingMethod);
                     }
