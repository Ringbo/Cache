diff --git a/src/main/java/com/github/tomakehurst/wiremock/standalone/CommandLineOptions.java b/src/main/java/com/github/tomakehurst/wiremock/standalone/CommandLineOptions.java
index 2808b58..6355563 100644
--- a/src/main/java/com/github/tomakehurst/wiremock/standalone/CommandLineOptions.java
+++ b/src/main/java/com/github/tomakehurst/wiremock/standalone/CommandLineOptions.java
@@ -259,10 +259,10 @@
     public <T extends Extension> Map<String, T> extensionsOfType(Class<T> extensionType) {
         if (optionSet.has(EXTENSIONS)) {
             String classNames = (String) optionSet.valueOf(EXTENSIONS);
-            return (Map<String, T>) Maps.filterEntries(ExtensionLoader.loadExtension(classNames.split(",")), 
-                            new Predicate<Map.Entry<String, Object>>() {
+            return (Map<String, T>) Maps.filterEntries(ExtensionLoader.load(classNames.split(",")), 
+                            new Predicate<Map.Entry<String, Extension>>() {
                                 @Override
-                                public boolean apply(Map.Entry<String, Object> input) {
+                                public boolean apply(Map.Entry<String, Extension> input) {
                                     return input.getValue().getClass().isAssignableFrom(input.getValue().getClass());
                                 }
             });
