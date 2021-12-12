diff --git a/sonar-core/src/main/java/org/sonar/core/plugins/PluginClassloaders.java b/sonar-core/src/main/java/org/sonar/core/plugins/PluginClassloaders.java
index 90d4280..48e1867 100644
--- a/sonar-core/src/main/java/org/sonar/core/plugins/PluginClassloaders.java
+++ b/sonar-core/src/main/java/org/sonar/core/plugins/PluginClassloaders.java
@@ -134,10 +134,6 @@
       throw new SonarException("The plugin " + plugin.getKey() + " is not supported with Java " + SystemUtils.JAVA_VERSION_TRIMMED, e);
 
     } catch (Throwable e) {
-      // SONAR-3688
-      // Throwable is explicitely caught instead of Exception in order to log the plugins
-      // that are compiled for Java > 5. In such case java.lang.UnsupportedClassVersionError
-      // is raised. 
       throw new SonarException("Fail to build the classloader of " + plugin.getKey(), e);
     }
   }
@@ -162,10 +158,6 @@
       throw new SonarException("The plugin " + plugin.getKey() + " is not supported with Java " + SystemUtils.JAVA_VERSION_TRIMMED, e);
 
     } catch (Throwable e) {
-      // SONAR-3688
-      // Throwable is explicitely caught instead of Exception in order to log the plugins
-      // that are compiled for Java > 5. In such case java.lang.UnsupportedClassVersionError
-      // is raised. 
       throw new SonarException("Fail to extend the plugin " + plugin.getBasePlugin() + " for " + plugin.getKey(), e);
     }
   }
@@ -233,11 +225,7 @@
       throw new SonarException("The plugin " + plugin.getKey() + " is not supported with Java " + SystemUtils.JAVA_VERSION_TRIMMED, e);
 
     } catch (Throwable e) {
-      // SONAR-3688
-      // Throwable is explicitely caught instead of Exception in order to log the plugins
-      // that are compiled for Java > 5. In such case java.lang.UnsupportedClassVersionError
-      // is raised. 
-      throw new SonarException("Fail to load plugin " + metadata.getKey(), e);
+      throw new SonarException("Fail to load plugin " + plugin.getKey(), e);
     }
   }
 
