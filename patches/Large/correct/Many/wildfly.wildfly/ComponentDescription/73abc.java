diff --git a/ee/src/main/java/org/jboss/as/ee/component/ComponentDescription.java b/ee/src/main/java/org/jboss/as/ee/component/ComponentDescription.java
index f9b99d2..76f83cc 100644
--- a/ee/src/main/java/org/jboss/as/ee/component/ComponentDescription.java
+++ b/ee/src/main/java/org/jboss/as/ee/component/ComponentDescription.java
@@ -543,7 +543,7 @@
                     configuration.getModuleName(),
                     configuration.getApplicationName()
             );
-            injectionConfiguration.getSource().getResourceValue(serviceBuilder, context, managedReferenceFactoryValue);
+            injectionConfiguration.getSource().getResourceValue(resolutionContext, serviceBuilder, context, managedReferenceFactoryValue);
         }
     }
 }
