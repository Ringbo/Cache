diff --git a/plugin/src/test/java/org/elasticsearch/xpack/security/authc/esnative/ESNativeMigrateToolTests.java b/plugin/src/test/java/org/elasticsearch/xpack/security/authc/esnative/ESNativeMigrateToolTests.java
index 25ce51c..57f8cc4 100644
--- a/plugin/src/test/java/org/elasticsearch/xpack/security/authc/esnative/ESNativeMigrateToolTests.java
+++ b/plugin/src/test/java/org/elasticsearch/xpack/security/authc/esnative/ESNativeMigrateToolTests.java
@@ -69,7 +69,7 @@
     public void testRetrieveUsers() throws Exception {
         final Environment nodeEnvironment = nodeEnvironment();
         String home = Environment.PATH_HOME_SETTING.get(nodeEnvironment.settings());
-        String conf = nodeEnvironment.configFile().toString();
+        Path conf = nodeEnvironment.configFile();
         SecurityClient c = new SecurityClient(client());
         logger.error("--> creating users");
         int numToAdd = randomIntBetween(1,10);
@@ -90,16 +90,16 @@
 
         Settings.Builder builder = Settings.builder()
                 .put("path.home", home)
-                .put("path.conf", conf);
+                .put("path.conf", conf.toString());
         SecuritySettingsSource.addSSLSettingsForStore(builder,
             "/org/elasticsearch/xpack/security/transport/ssl/certs/simple/testnode.jks", "testnode");
         Settings settings = builder.build();
         logger.error("--> retrieving users using URL: {}, home: {}", url, home);
 
         OptionParser parser = muor.getParser();
-        OptionSet options = parser.parse("-u", username, "-p", password, "-U", url, "--path.conf", conf);
+        OptionSet options = parser.parse("-u", username, "-p", password, "-U", url);
         logger.info("--> options: {}", options.asMap());
-        Set<String> users = muor.getUsersThatExist(t, settings, new Environment(settings), options);
+        Set<String> users = muor.getUsersThatExist(t, settings, new Environment(settings, conf), options);
         logger.info("--> output: \n{}", t.getOutput());
         for (String u : addedUsers) {
             assertThat("expected list to contain: " + u + ", real list: " + users, users.contains(u), is(true));
@@ -139,7 +139,7 @@
         logger.error("--> retrieving roles using URL: {}, home: {}", url, home);
 
         OptionParser parser = muor.getParser();
-        OptionSet options = parser.parse("-u", username, "-p", password, "-U", url, "--path.conf", conf.toString());
+        OptionSet options = parser.parse("-u", username, "-p", password, "-U", url);
         Set<String> roles = muor.getRolesThatExist(t, settings, new Environment(settings, conf), options);
         logger.info("--> output: \n{}", t.getOutput());;
         for (String r : addedRoles) {
