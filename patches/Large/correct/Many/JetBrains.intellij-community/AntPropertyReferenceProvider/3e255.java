diff --git a/plugins/ant/src/com/intellij/lang/ant/psi/impl/reference/providers/AntPropertyReferenceProvider.java b/plugins/ant/src/com/intellij/lang/ant/psi/impl/reference/providers/AntPropertyReferenceProvider.java
index 512893a..6d3fc95 100644
--- a/plugins/ant/src/com/intellij/lang/ant/psi/impl/reference/providers/AntPropertyReferenceProvider.java
+++ b/plugins/ant/src/com/intellij/lang/ant/psi/impl/reference/providers/AntPropertyReferenceProvider.java
@@ -89,7 +89,7 @@
           }
           ++endIndex;
         }
-        if (nestedBrackets > 0 || endIndex == value.length()) return;
+        if (nestedBrackets > 0 || endIndex > value.length()) return;
         if (endIndex >= startIndex) {
           final String propName = value.substring(startIndex, endIndex);
           if (project.isEnvironmentProperty(propName) && AntElementImpl.resolveProperty(element, propName) == null) {
