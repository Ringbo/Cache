diff --git a/mockserver-core/src/main/java/org/mockserver/configuration/ConfigurationProperties.java b/mockserver-core/src/main/java/org/mockserver/configuration/ConfigurationProperties.java
index decc3d4..9b747bb 100644
--- a/mockserver-core/src/main/java/org/mockserver/configuration/ConfigurationProperties.java
+++ b/mockserver-core/src/main/java/org/mockserver/configuration/ConfigurationProperties.java
@@ -272,7 +272,7 @@
                 setLevelMethod.invoke(logger, levelInstance);
             }
         } catch (Exception e) {
-            ConfigurationProperties.logger.info("Exception updating logging level using reflection, likely cause is Logback is not on the classpath", e);
+            ConfigurationProperties.logger.info("Exception updating logging level using reflection, likely cause is Logback is not on the classpath");
         }
 
 
@@ -291,7 +291,7 @@
                 currentLogLevelField.set(logger, logLevelInstance);
             }
         } catch (Exception e) {
-            ConfigurationProperties.logger.info("Exception updating logging level using reflection, likely cause is Logback is not on the classpath", e);
+            ConfigurationProperties.logger.info("Exception updating logging level using reflection, likely cause is Logback is not on the classpath");
         }
     }
 
