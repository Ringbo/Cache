diff --git a/platform/lang-impl/src/com/intellij/ide/hierarchy/ExporterToTextFileHierarchy.java b/platform/lang-impl/src/com/intellij/ide/hierarchy/ExporterToTextFileHierarchy.java
index 4bed2c3..7ac4c24 100644
--- a/platform/lang-impl/src/com/intellij/ide/hierarchy/ExporterToTextFileHierarchy.java
+++ b/platform/lang-impl/src/com/intellij/ide/hierarchy/ExporterToTextFileHierarchy.java
@@ -27,7 +27,7 @@
     StringBuilder buf = new StringBuilder();
     StructureTreeModel currentBuilder = myHierarchyBrowserBase.getCurrentBuilder();
     LOG.assertTrue(currentBuilder != null);
-    appendNode(buf, currentBuilder.getRoot(), SystemProperties.getLineSeparator(), "");
+    appendNode(buf, currentBuilder.getRootImmediately(), SystemProperties.getLineSeparator(), "");
     return buf.toString();
   }
 
