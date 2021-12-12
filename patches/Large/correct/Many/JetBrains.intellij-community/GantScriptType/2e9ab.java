diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/gant/GantScriptType.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/gant/GantScriptType.java
index e8f36cb..faac54d 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/gant/GantScriptType.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/gant/GantScriptType.java
@@ -65,7 +65,7 @@
 
   @Override
   public boolean isConfigurationByLocation(@NotNull GroovyScriptRunConfiguration existing, @NotNull Location place) {
-    final String params = existing.getProgramParameters();
+    final String params = existing.getScriptParameters();
     final String s = getTargetName(place);
     return s != null && params != null && (params.startsWith(s + " ") || params.equals(s));
   }
