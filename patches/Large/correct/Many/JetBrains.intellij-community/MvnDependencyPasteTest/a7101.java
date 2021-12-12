diff --git a/plugins/gradle/testSources/org/jetbrains/plugins/gradle/codeInsight/actions/MvnDependencyPasteTest.java b/plugins/gradle/testSources/org/jetbrains/plugins/gradle/codeInsight/actions/MvnDependencyPasteTest.java
index e22245e..1bafd79 100644
--- a/plugins/gradle/testSources/org/jetbrains/plugins/gradle/codeInsight/actions/MvnDependencyPasteTest.java
+++ b/plugins/gradle/testSources/org/jetbrains/plugins/gradle/codeInsight/actions/MvnDependencyPasteTest.java
@@ -60,13 +60,13 @@
 
     configureGradleFile();
     performPaste();
-    checkResultByText("dependencies {\n" +
+    checkResultByText(null, "dependencies {\n" +
                       "    <dependency>\n" +
                       "      <groupId>group</groupId>\n" +
                       "      <version>1.0</version>\n" +
                       "      <scope>runtime</scope>\n" +
                       "    </dependency>\n" +
-                      "}");
+                            "}", true);
   }
 
   public void test_AddCompile() {
