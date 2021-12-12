diff --git a/src/main/java/org/apache/ibatis/builder/xml/XMLStatementBuilder.java b/src/main/java/org/apache/ibatis/builder/xml/XMLStatementBuilder.java
index 7d4f1c6..47608e6 100644
--- a/src/main/java/org/apache/ibatis/builder/xml/XMLStatementBuilder.java
+++ b/src/main/java/org/apache/ibatis/builder/xml/XMLStatementBuilder.java
@@ -169,7 +169,7 @@
       // skip this statement if there is a previous one with a not null databaseId
       id = builderAssistant.applyCurrentNamespace(id, false);
       if (this.configuration.hasStatement(id, false)) {
-        MappedStatement previous = this.configuration.getMappedStatement(id);
+        MappedStatement previous = this.configuration.getMappedStatement(id, false); // issue #2
         if (previous.getDatabaseId() != null) {
           return false;
         }
