diff --git a/struts2/plugin/src-test/com/intellij/struts2/dom/struts/StrutsIncludeTest.java b/struts2/plugin/src-test/com/intellij/struts2/dom/struts/StrutsIncludeTest.java
index 8025457..c112144 100644
--- a/struts2/plugin/src-test/com/intellij/struts2/dom/struts/StrutsIncludeTest.java
+++ b/struts2/plugin/src-test/com/intellij/struts2/dom/struts/StrutsIncludeTest.java
@@ -35,7 +35,7 @@
     final String path = myFixture.getTempDirPath();
     moduleBuilder.addContentRoot(path);
     new File(path + SOURCE_PATH).mkdir();
-    moduleBuilder.addSourceRoot(SOURCE_PATH);
+    moduleBuilder.addSourceRoot(SOURCE_DIR);
   }
 
   public void testInclude() throws Throwable {
