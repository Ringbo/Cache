diff --git a/ethereumj-core/src/main/java/org/ethereum/config/SystemProperties.java b/ethereumj-core/src/main/java/org/ethereum/config/SystemProperties.java
index 3646464..84d7d82 100644
--- a/ethereumj-core/src/main/java/org/ethereum/config/SystemProperties.java
+++ b/ethereumj-core/src/main/java/org/ethereum/config/SystemProperties.java
@@ -198,7 +198,7 @@
             Config testUserConfig = ConfigFactory.parseResources("test-user.conf");
             logger.info("Config (" + (testUserConfig.entrySet().size() > 0 ? " yes " : " no  ") + "): test properties from resource 'test-user.conf'");
             String file = System.getProperty("ethereumj.conf.file");
-            Config cmdLineConfigFile = mergeConfigs(res, s -> ConfigFactory.parseFile(new File(s)));
+            Config cmdLineConfigFile = mergeConfigs(file, s -> ConfigFactory.parseFile(new File(s)));
             logger.info("Config (" + (cmdLineConfigFile.entrySet().size() > 0 ? " yes " : " no  ") + "): user properties from -Dethereumj.conf.file file(s) '" + file + "'");
             logger.info("Config (" + (apiConfig.entrySet().size() > 0 ? " yes " : " no  ") + "): config passed via constructor");
             config = apiConfig
