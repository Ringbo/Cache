diff --git a/java/idea-ui/src/com/intellij/util/descriptors/impl/ConfigFileInfoSetImpl.java b/java/idea-ui/src/com/intellij/util/descriptors/impl/ConfigFileInfoSetImpl.java
index ee77447..f3896e5 100644
--- a/java/idea-ui/src/com/intellij/util/descriptors/impl/ConfigFileInfoSetImpl.java
+++ b/java/idea-ui/src/com/intellij/util/descriptors/impl/ConfigFileInfoSetImpl.java
@@ -134,7 +134,7 @@
       final int id = Comparing.compare(o1.getMetaData().getId(), o2.getMetaData().getId());
       return id != 0? id : Comparing.compare(o1.getUrl(), o2.getUrl());
     });
-    sortedConfigFiles.addAll(myConfigFiles.collectValues());
+    sortedConfigFiles.addAll(myConfigFiles.values());
     for (ConfigFileInfo configuration : sortedConfigFiles) {
       final Element child = new Element(ELEMENT_NAME);
       final ConfigFileMetaData metaData = configuration.getMetaData();
