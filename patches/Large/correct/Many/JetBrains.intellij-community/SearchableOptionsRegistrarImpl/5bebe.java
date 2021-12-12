diff --git a/platform/platform-impl/src/com/intellij/ide/ui/search/SearchableOptionsRegistrarImpl.java b/platform/platform-impl/src/com/intellij/ide/ui/search/SearchableOptionsRegistrarImpl.java
index ca968e0..222146c 100644
--- a/platform/platform-impl/src/com/intellij/ide/ui/search/SearchableOptionsRegistrarImpl.java
+++ b/platform/platform-impl/src/com/intellij/ide/ui/search/SearchableOptionsRegistrarImpl.java
@@ -226,7 +226,7 @@
     if (helpIds != null) {
       for (Iterator<Configurable> it = contentHits.iterator(); it.hasNext();) {
         Configurable configurable = it.next();
-        if (CodeStyleFacade.getInstance(project).isUnsuitableCodestyleConfigurable(configurable)) {
+        if (CodeStyleFacade.getInstance(project).isUnsuitableCodeStyleConfigurable(configurable)) {
           it.remove();
           continue;
         }
