diff --git a/java/idea-ui/src/com/intellij/facet/impl/ui/libraries/LibraryOptionsPanel.java b/java/idea-ui/src/com/intellij/facet/impl/ui/libraries/LibraryOptionsPanel.java
index 4a51041..f6c59d3 100644
--- a/java/idea-ui/src/com/intellij/facet/impl/ui/libraries/LibraryOptionsPanel.java
+++ b/java/idea-ui/src/com/intellij/facet/impl/ui/libraries/LibraryOptionsPanel.java
@@ -102,7 +102,7 @@
       public int compare(LibraryEditor o1, LibraryEditor o2) {
         final String name1 = o1.getName();
         final String name2 = o2.getName();
-        return StringUtil.notNullize(name1).compareToIgnoreCase(StringUtil.notNullize(name2));
+        return -StringUtil.notNullize(name1).compareToIgnoreCase(StringUtil.notNullize(name2));
       }
     });
 
