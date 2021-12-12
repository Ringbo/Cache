diff --git a/subprojects/core/src/main/groovy/org/gradle/api/internal/plugins/DefaultObjectConfigurationAction.java b/subprojects/core/src/main/groovy/org/gradle/api/internal/plugins/DefaultObjectConfigurationAction.java
index 991f247..31f7524 100755
--- a/subprojects/core/src/main/groovy/org/gradle/api/internal/plugins/DefaultObjectConfigurationAction.java
+++ b/subprojects/core/src/main/groovy/org/gradle/api/internal/plugins/DefaultObjectConfigurationAction.java
@@ -89,7 +89,7 @@
                 Project project = (Project) target;
                 project.getPlugins().apply(pluginClass);
             } else {
-                throw new UnsupportedOperationException();
+                throw new UnsupportedOperationException(String.format("Cannot apply plugin of class '%s' to '%s' (class: %s) as it is not a Project", pluginClass.getName(), target.toString(), target.getClass().getName()));
             }
         }
     }
@@ -100,7 +100,7 @@
                 Project project = (Project) target;
                 project.getPlugins().apply(pluginId);
             } else {
-                throw new UnsupportedOperationException();
+                throw new UnsupportedOperationException(String.format("Cannot apply plugin with id '%s' to '%s' (class: %s) as it is not a Project", pluginId, target.toString(), target.getClass().getName()));
             }
         }
     }
