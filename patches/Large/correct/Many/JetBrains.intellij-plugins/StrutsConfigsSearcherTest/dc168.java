diff --git a/struts2/plugin/src-test/com/intellij/struts2/facet/ui/StrutsConfigsSearcherTest.java b/struts2/plugin/src-test/com/intellij/struts2/facet/ui/StrutsConfigsSearcherTest.java
index 67c7119..5332ea9 100644
--- a/struts2/plugin/src-test/com/intellij/struts2/facet/ui/StrutsConfigsSearcherTest.java
+++ b/struts2/plugin/src-test/com/intellij/struts2/facet/ui/StrutsConfigsSearcherTest.java
@@ -152,7 +152,7 @@
     assertEquals(1, map.get(myModule).size()); // /src/struts.xml
 
     final Map<VirtualFile, List<PsiFile>> configsInJars = configsSearcher.getJars();
-    assertEquals(2, configsInJars.size()); // default-xxx.xml in struts2-core.jar & xwork.jar
+    assertEquals(1, configsInJars.size()); // default-xxx.xml in struts2-core.jar
   }
 
 }
\ No newline at end of file
