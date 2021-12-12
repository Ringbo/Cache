diff --git a/sonar-plugin-api/src/main/java/org/sonar/api/server/rule/RulesDefinition.java b/sonar-plugin-api/src/main/java/org/sonar/api/server/rule/RulesDefinition.java
index 0e10bdb..cf8e802 100644
--- a/sonar-plugin-api/src/main/java/org/sonar/api/server/rule/RulesDefinition.java
+++ b/sonar-plugin-api/src/main/java/org/sonar/api/server/rule/RulesDefinition.java
@@ -773,12 +773,12 @@
     }
 
     /**
-     * Load description from a file available in classpath. Example : <code>setMarkdownDescription(getClass().getResource("/myrepo/Rule1234.md")</code>
+     * Load description from a file available in classpath. Example : {@code setMarkdownDescription(getClass().getResource("/myrepo/Rule1234.md")}
      */
     public NewRule setMarkdownDescription(@Nullable URL classpathUrl) {
       if (classpathUrl != null) {
         try {
-          setMarkdownDescription(IOUtils.toString(classpathUrl));
+          setMarkdownDescription(IOUtils.toString(classpathUrl, UTF_8));
         } catch (IOException e) {
           throw new IllegalStateException("Fail to read: " + classpathUrl, e);
         }
