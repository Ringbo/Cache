diff --git a/bundles/config/org.eclipse.smarthome.config.core/src/main/java/org/eclipse/smarthome/config/core/Configuration.java b/bundles/config/org.eclipse.smarthome.config.core/src/main/java/org/eclipse/smarthome/config/core/Configuration.java
index 982a7b6..6c4f665 100644
--- a/bundles/config/org.eclipse.smarthome.config.core/src/main/java/org/eclipse/smarthome/config/core/Configuration.java
+++ b/bundles/config/org.eclipse.smarthome.config.core/src/main/java/org/eclipse/smarthome/config/core/Configuration.java
@@ -71,7 +71,7 @@
                             value = bdValue.doubleValue();
                         } else if (typeName.equalsIgnoreCase("Long")) {
                             value = bdValue.longValue();
-                        } else if (typeName.equalsIgnoreCase("Integer")) {
+                        } else if (typeName.equalsIgnoreCase("Integer") || typeName.equalsIgnoreCase("int")) {
                             value = bdValue.intValue();
                         }
                     }
