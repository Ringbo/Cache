diff --git a/server/src/test-integration/java/com/thoughtworks/go/config/GoConfigMigrationIntegrationTest.java b/server/src/test-integration/java/com/thoughtworks/go/config/GoConfigMigrationIntegrationTest.java
index c4a2c57..9b28a37 100644
--- a/server/src/test-integration/java/com/thoughtworks/go/config/GoConfigMigrationIntegrationTest.java
+++ b/server/src/test-integration/java/com/thoughtworks/go/config/GoConfigMigrationIntegrationTest.java
@@ -366,10 +366,10 @@
     public void shouldMigrateToRevision34() throws Exception {
         final String content = IOUtils.toString(getClass().getResourceAsStream("svn-p4-with-parameterized-passwords.xml"), UTF_8);
 
-        String migratedContent = migrateXmlString(content, 22);
+        String migratedContent = migrateXmlString(content, 22, 34);
 
         String expected = content.replaceAll("#\\{jez_passwd\\}", "badger")
-                .replace("<cruise schemaVersion=\"22\">", "<cruise schemaVersion=\"" + GoConstants.CONFIG_SCHEMA_VERSION + "\">")
+                .replace("<cruise schemaVersion=\"22\">", "<cruise schemaVersion=\"34\">")
                 .replaceAll("##", "#");
         assertStringsIgnoringCarriageReturnAreEqual(expected, migratedContent);
     }
@@ -378,9 +378,9 @@
     public void shouldMigrateToRevision35_escapeHash() throws Exception {
         final String content = IOUtils.toString(getClass().getResourceAsStream("escape_param_for_nant_p4.xml"), UTF_8).trim();
 
-        String migratedContent = migrateXmlString(content, 22);
+        String migratedContent = migrateXmlString(content, 22, 35);
 
-        String expected = content.replace("<cruise schemaVersion=\"22\">", "<cruise schemaVersion=\"" + GoConstants.CONFIG_SCHEMA_VERSION + "\">")
+        String expected = content.replace("<cruise schemaVersion=\"22\">", "<cruise schemaVersion=\"35\">")
                 .replace("<view>##foo#</view>", "<view>####foo##</view>").replace("nantpath=\"#foo##\"", "nantpath=\"##foo####\"");
         assertStringsIgnoringCarriageReturnAreEqual(expected, migratedContent);
     }
