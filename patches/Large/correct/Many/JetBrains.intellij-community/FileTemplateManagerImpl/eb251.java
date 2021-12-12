diff --git a/platform/lang-impl/src/com/intellij/ide/fileTemplates/impl/FileTemplateManagerImpl.java b/platform/lang-impl/src/com/intellij/ide/fileTemplates/impl/FileTemplateManagerImpl.java
index dab65fc..32eb412 100644
--- a/platform/lang-impl/src/com/intellij/ide/fileTemplates/impl/FileTemplateManagerImpl.java
+++ b/platform/lang-impl/src/com/intellij/ide/fileTemplates/impl/FileTemplateManagerImpl.java
@@ -401,7 +401,7 @@
         final boolean reformat = Boolean.TRUE.toString().equals(child.getAttributeValue(ATTRIBUTE_REFORMAT));
         template.setReformatCode(reformat);
         if (template instanceof BundledFileTemplate) {
-          final boolean enabled = Boolean.getBoolean(child.getAttributeValue(ATTRIBUTE_ENABLED, "true"));
+          final boolean enabled = Boolean.parseBoolean(child.getAttributeValue(ATTRIBUTE_ENABLED, "true"));
           ((BundledFileTemplate)template).setEnabled(enabled);
         }
       }
