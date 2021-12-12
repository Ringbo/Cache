diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tools/ReflectionUtils.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tools/ReflectionUtils.java
index e1ec465..2df0665 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tools/ReflectionUtils.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tools/ReflectionUtils.java
@@ -69,7 +69,7 @@
         if (resource.getProtocol().startsWith("jar")) {        
           // The LanguageTool ZIP contains two JARs with the core classes,
           // so ignore one of them to avoid rule duplication:
-          if (resource.getPath().endsWith("LanguageTool.uno.jar")) {
+          if (resource.getPath().contains("LanguageTool.uno.jar")) {
             continue;
           }
           findClassesInJar(packageName, classNameRegEx, subdirLevel, classExtends,
