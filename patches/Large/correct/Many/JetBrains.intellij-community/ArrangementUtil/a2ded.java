diff --git a/platform/lang-api/src/com/intellij/psi/codeStyle/arrangement/ArrangementUtil.java b/platform/lang-api/src/com/intellij/psi/codeStyle/arrangement/ArrangementUtil.java
index 06a1fdd..52a494d 100644
--- a/platform/lang-api/src/com/intellij/psi/codeStyle/arrangement/ArrangementUtil.java
+++ b/platform/lang-api/src/com/intellij/psi/codeStyle/arrangement/ArrangementUtil.java
@@ -39,7 +39,7 @@
   public static ArrangementSettings readExternal(@NotNull Element element, @NotNull Language language) {
     ArrangementSettingsSerializer serializer = getSerializer(language);
     if (serializer == null) {
-      LOG.error("Can't find serializer for language: " + language.getDisplayName() + "(" + language.getID() + ")");
+      LOG.warn("Can't find serializer for language: " + language.getDisplayName() + "(" + language.getID() + ")");
       return null;
     }
 
