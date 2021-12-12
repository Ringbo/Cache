diff --git a/platform/platform-tests/testSrc/com/intellij/openapi/components/impl/PathMacroManagerTest.java b/platform/platform-tests/testSrc/com/intellij/openapi/components/impl/PathMacroManagerTest.java
index 107dc97..bbe2f79 100644
--- a/platform/platform-tests/testSrc/com/intellij/openapi/components/impl/PathMacroManagerTest.java
+++ b/platform/platform-tests/testSrc/com/intellij/openapi/components/impl/PathMacroManagerTest.java
@@ -52,7 +52,7 @@
 @RunWith(JMock.class)
 public class PathMacroManagerTest {
   private static final String APP_HOME = FileUtil.toSystemIndependentName(PathManager.getHomePath());
-  private static final String USER_HOME = FileUtil.toSystemIndependentName(StringUtil.trimEnd(SystemProperties.getUserHome(), "/"));
+  private static final String USER_HOME = StringUtil.trimEnd(FileUtil.toSystemIndependentName(SystemProperties.getUserHome()), "/");
 
   private Module myModule;
   private ProjectEx myProject;
@@ -213,7 +213,7 @@
       String[] split = s.split(" -> ");
       String path = split[0];
       String replaced = split[1];
-      assertEquals(replaced, map.substitute(path, true));
+      assertEquals("For " + path, replaced, map.substitute(path, true));
     }
   }
 
