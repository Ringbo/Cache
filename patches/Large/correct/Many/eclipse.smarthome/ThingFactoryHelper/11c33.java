diff --git a/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/internal/ThingFactoryHelper.java b/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/internal/ThingFactoryHelper.java
index 7b0a1da..69660b6 100644
--- a/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/internal/ThingFactoryHelper.java
+++ b/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/internal/ThingFactoryHelper.java
@@ -159,7 +159,7 @@
                     return null;
             }
         } catch (NumberFormatException ex) {
-            LoggerFactory.getLogger(ThingFactory.class).warn("Could not parse default value '{}' as type '{}': {}",
+            LoggerFactory.getLogger(ThingFactoryHelper.class).warn("Could not parse default value '{}' as type '{}': {}",
                     defaultValue, parameterType, ex.getMessage(), ex);
             return null;
         }
