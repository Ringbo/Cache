diff --git a/src/edu/stanford/nlp/pipeline/StanfordCoreNLPServer.java b/src/edu/stanford/nlp/pipeline/StanfordCoreNLPServer.java
index f57ea4e..d94afd5 100644
--- a/src/edu/stanford/nlp/pipeline/StanfordCoreNLPServer.java
+++ b/src/edu/stanford/nlp/pipeline/StanfordCoreNLPServer.java
@@ -423,7 +423,7 @@
     if (language != null && !"default".equals(language)) {
       String languagePropertiesFile = LanguageInfo.getLanguagePropertiesFile(language);
       if (languagePropertiesFile != null) {
-        try (InputStream is = IOUtils.getInputStreamFromURLOrClasspathOrFileSystem(languagePropertiesFile)){
+        try (BufferedReader is = IOUtils.readerFromString(languagePropertiesFile)){
           Properties languageSpecificProperties = new Properties();
           languageSpecificProperties.load(is);
           PropertiesUtils.overWriteProperties(props,languageSpecificProperties);
