diff --git a/java/idea-ui/src/com/intellij/platform/templates/RemoteTemplatesFactory.java b/java/idea-ui/src/com/intellij/platform/templates/RemoteTemplatesFactory.java
index 6912b7c..afa6761 100644
--- a/java/idea-ui/src/com/intellij/platform/templates/RemoteTemplatesFactory.java
+++ b/java/idea-ui/src/com/intellij/platform/templates/RemoteTemplatesFactory.java
@@ -105,7 +105,7 @@
 
   @NotNull
   private static MultiMap<String, ArchivedProjectTemplate> create(@NotNull Element element) throws IOException, JDOMException {
-    MultiMap<String, ArchivedProjectTemplate> map = MultiMap.createSmart();
+    MultiMap<String, ArchivedProjectTemplate> map = MultiMap.create();
     for (ArchivedProjectTemplate template : createGroupTemplates(element)) {
       map.putValue(template.getCategory(), template);
     }
