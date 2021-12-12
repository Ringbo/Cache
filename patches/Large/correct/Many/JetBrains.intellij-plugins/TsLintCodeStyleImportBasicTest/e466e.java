diff --git a/tslint/test/src/com/intellij/lang/javascript/linter/tslint/TsLintCodeStyleImportBasicTest.java b/tslint/test/src/com/intellij/lang/javascript/linter/tslint/TsLintCodeStyleImportBasicTest.java
index 9a45f49..7f55957 100644
--- a/tslint/test/src/com/intellij/lang/javascript/linter/tslint/TsLintCodeStyleImportBasicTest.java
+++ b/tslint/test/src/com/intellij/lang/javascript/linter/tslint/TsLintCodeStyleImportBasicTest.java
@@ -27,20 +27,20 @@
 import org.junit.Assert;
 
 public class TsLintCodeStyleImportBasicTest extends LightPlatformCodeInsightFixtureTestCase {
-  public void testSimpleStringValue() throws Exception {
+  public void testSimpleStringValue() {
     doTestJson("{\"rules\": {\"semicolon\": [true,\"never\"]}}", (settings) -> {
       Assert.assertFalse(settings.getCustomSettings(TypeScriptCodeStyleSettings.class).USE_SEMICOLON_AFTER_STATEMENT);
     });
   }
 
-  public void testSimpleNumberValue() throws Exception {
+  public void testSimpleNumberValue() {
     doTestJson("{\"rules\": {\"max-line-length\": [true, 12]}}", (settings) -> {
       CommonCodeStyleSettings commonSettings = settings.getCommonSettings(JavaScriptSupportLoader.TYPESCRIPT);
       Assert.assertEquals(12, commonSettings.RIGHT_MARGIN);
     });
   }
 
-  public void testDisabledRule() throws Exception {
+  public void testDisabledRule() {
     doTestJson("{\"rules\": {\"semicolon\": false}}", (settings) -> {
       TypeScriptCodeStyleSettings tsSettings = settings.getCustomSettings(TypeScriptCodeStyleSettings.class);
       Assert.assertTrue(tsSettings.USE_SEMICOLON_AFTER_STATEMENT);
@@ -48,7 +48,7 @@
     });
   }
 
-  public void testDisabledRuleWithOptions() throws Exception {
+  public void testDisabledRuleWithOptions() {
     doTestJson("{\"rules\": {\"semicolon\": [false,\"never\"]}}", (settings) -> {
       TypeScriptCodeStyleSettings tsSettings = settings.getCustomSettings(TypeScriptCodeStyleSettings.class);
       Assert.assertTrue(tsSettings.USE_SEMICOLON_AFTER_STATEMENT);
@@ -56,7 +56,7 @@
     });
   }
 
-  public void testSeverityOff() throws Exception {
+  public void testSeverityOff() {
     doTestJson("{\n" +
                "  \"rules\": {\n" +
                "    \"semicolon\": {\n" +
@@ -71,7 +71,7 @@
     });
   }
 
-  public void testSeverityNone() throws Exception {
+  public void testSeverityNone() {
     doTestJson("{\n" +
                "  \"rules\": {\n" +
                "    \"semicolon\": {\n" +
@@ -86,7 +86,7 @@
     });
   }
 
-  public void testWithSeverityAndSingleStringOption() throws Exception {
+  public void testWithSeverityAndSingleStringOption() {
     doTestJson("{\n" +
                "  \"rules\": {\n" +
                "    \"semicolon\": {\n" +
@@ -101,7 +101,7 @@
     });
   }
   
-  public void testWithSeverityAndStringArrayOption() throws Exception {
+  public void testWithSeverityAndStringArrayOption() {
     doTestJson("{\n" +
                "  \"rules\": {\n" +
                "    \"semicolon\": {\n" +
@@ -116,7 +116,7 @@
     });
   }
 
-  public void testWithSeverityAndSingleNumberOption() throws Exception {
+  public void testWithSeverityAndSingleNumberOption() {
     doTestJson("{\n" +
                "  \"rules\": {\n" +
                "    \"max-line-length\": {\n" +
@@ -130,7 +130,7 @@
     });
   }
 
-  public void testWithSeverityAndArrayNumberOption() throws Exception {
+  public void testWithSeverityAndArrayNumberOption() {
     doTestJson("{\n" +
                "  \"rules\": {\n" +
                "    \"max-line-length\": {\n" +
@@ -144,7 +144,7 @@
     });
   }
 
-  public void testStringListRule() throws Exception {
+  public void testStringListRule() {
     doTestJson("{\n" +
                "  \"rules\": {\n" +
                "    \"import-blacklist\": [\n" +
@@ -159,14 +159,14 @@
     });
   }
 
-  public void testSimpleStringValueYaml() throws Exception {
+  public void testSimpleStringValueYaml() {
     doTestYaml("rules:\n" +
                "    semicolon: [true, \"never\"]", settings -> {
       Assert.assertFalse(settings.getCustomSettings(TypeScriptCodeStyleSettings.class).USE_SEMICOLON_AFTER_STATEMENT);
     });
   }
 
-  public void testSimpleNumberValueYaml() throws Exception {
+  public void testSimpleNumberValueYaml() {
     doTestYaml("rules:\n" +
                "    semicolon: [true, \"never\"]\n" +
                "    max-line-length: [true, 12]", settings -> {
@@ -175,7 +175,7 @@
     });
   }
 
-  public void testStringValueFromOptionsYaml() throws Exception {
+  public void testStringValueFromOptionsYaml() {
     doTestYaml("rules:\n" +
                "    semicolon:\n" +
                "        options:\n" +
@@ -184,7 +184,7 @@
     });
   }
 
-  public void testNumberValueFromOptionsYaml() throws Exception {
+  public void testNumberValueFromOptionsYaml() {
     doTestYaml("rules:\n" +
                "    max-line-length:\n" +
                "        options: 12", settings -> {
@@ -193,7 +193,7 @@
     }); 
   }
 
-  public void testNoneSeverityYaml() throws Exception {
+  public void testNoneSeverityYaml() {
     doTestYaml("rules:\n" +
                "    max-line-length:\n" +
                "        severity: \"none\"\n" +
@@ -203,7 +203,7 @@
     });
   }
 
-  public void testStringListRuleYaml() throws Exception {
+  public void testStringListRuleYaml() {
     doTestYaml("rules:\n" +
                "    import-blacklist:\n" +
                "        options:\n" +
@@ -214,16 +214,15 @@
     });
   }
 
-  private void doTestJson(@Language("JSON") String configText, Consumer<CodeStyleSettings> test) throws Exception {
+  private void doTestJson(@Language("JSON") String configText, Consumer<CodeStyleSettings> test) {
     doTest("tslint.json", configText, test);
   }
 
-  private void doTestYaml(@Language("YAML") String configText, Consumer<CodeStyleSettings> test) throws Exception {
+  private void doTestYaml(@Language("YAML") String configText, Consumer<CodeStyleSettings> test) {
     doTest("tslint.yaml", configText, test);
   }
 
-  private void doTest(String configFileName, String configText, Consumer<CodeStyleSettings> test)
-    throws Exception {
+  private void doTest(String configFileName, String configText, Consumer<CodeStyleSettings> test) {
     JSTestUtils.testWithTempCodeStyleSettings(getProject(), settings -> {
       PsiFile configFile = myFixture.configureByText(configFileName, configText);
       TsLintConfigWrapper config = TsLintConfigWrapper.Companion.getConfigForFile(configFile);
