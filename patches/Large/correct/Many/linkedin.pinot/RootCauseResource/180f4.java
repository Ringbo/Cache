diff --git a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/dashboard/resources/v2/RootCauseResource.java b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/dashboard/resources/v2/RootCauseResource.java
index dde9087..5ebe016 100644
--- a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/dashboard/resources/v2/RootCauseResource.java
+++ b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/dashboard/resources/v2/RootCauseResource.java
@@ -122,7 +122,7 @@
         try {
           return formatter.format(e);
         } catch (Exception ex) {
-          LOG.warn("Error applying formatter '{}'. Skipping.", ex);
+          LOG.warn("Error applying formatter '{}'. Skipping.", formatter.getClass().getName(), ex);
         }
       }
     }
