diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocMethodCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocMethodCheckTest.java
index 38b8be4..d090042 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocMethodCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocMethodCheckTest.java
@@ -472,13 +472,13 @@
     @Test
     public void test_1168408_1() throws Exception {
         final String[] expected = {};
-        verify(checkConfig, getSrcPath("checks/javadoc/Input_01.java"), expected);
+        verify(checkConfig, getPath("checks/javadoc/Input_01.java"), expected);
     }
 
     @Test
     public void test_1168408_2() throws Exception {
         final String[] expected = {};
-        verify(checkConfig, getSrcPath("checks/javadoc/Input_02.java"), expected);
+        verify(checkConfig, getPath("checks/javadoc/Input_02.java"), expected);
     }
 
     @Test
@@ -486,7 +486,7 @@
         checkConfig.addAttribute("allowThrowsTagsForSubclasses", "true");
         checkConfig.addAttribute("allowUndeclaredRTE", "true");
         final String[] expected = {};
-        verify(checkConfig, getSrcPath("checks/javadoc/Input_03.java"), expected);
+        verify(checkConfig, getPath("checks/javadoc/Input_03.java"), expected);
     }
 
     @Test
