diff --git a/plugins/yaml/src/org/jetbrains/yaml/YAMLUtil.java b/plugins/yaml/src/org/jetbrains/yaml/YAMLUtil.java
index 7b82849..7d131cd 100644
--- a/plugins/yaml/src/org/jetbrains/yaml/YAMLUtil.java
+++ b/plugins/yaml/src/org/jetbrains/yaml/YAMLUtil.java
@@ -72,7 +72,8 @@
       for (YAMLPsiElement child : list) {
         if (child instanceof YAMLKeyValue){
           final YAMLKeyValue yamlKeyValue = (YAMLKeyValue)child;
-          if (name.equals(yamlKeyValue.getKeyText())){
+          // We use null as wildcard
+          if (name == null || name.equals(yamlKeyValue.getKeyText())){
             return yamlKeyValue;
           }
         }
