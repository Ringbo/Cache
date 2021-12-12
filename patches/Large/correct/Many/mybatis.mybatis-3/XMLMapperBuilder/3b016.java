diff --git a/src/main/java/org/apache/ibatis/builder/xml/XMLMapperBuilder.java b/src/main/java/org/apache/ibatis/builder/xml/XMLMapperBuilder.java
index 71531d3..c48448a 100644
--- a/src/main/java/org/apache/ibatis/builder/xml/XMLMapperBuilder.java
+++ b/src/main/java/org/apache/ibatis/builder/xml/XMLMapperBuilder.java
@@ -106,7 +106,7 @@
   private void configurationElement(XNode context) {
     try {
       String namespace = context.getStringAttribute("namespace");
-      if (namespace.equals("")) {
+      if (namespace == null || namespace.equals("")) {
         throw new BuilderException("Mapper's namespace cannot be empty");
       }
       builderAssistant.setCurrentNamespace(namespace);
