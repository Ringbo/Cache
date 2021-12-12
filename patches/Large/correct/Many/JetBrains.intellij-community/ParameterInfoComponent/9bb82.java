diff --git a/platform/lang-impl/src/com/intellij/codeInsight/hint/ParameterInfoComponent.java b/platform/lang-impl/src/com/intellij/codeInsight/hint/ParameterInfoComponent.java
index 562e3aa..b1ad07f 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/hint/ParameterInfoComponent.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/hint/ParameterInfoComponent.java
@@ -328,7 +328,7 @@
                                                                  GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
           index += 1;
           flagsMap.clear();
-          curOffset = 1;
+          curOffset = 0;
           line = "";
           components.add(component);
         }
