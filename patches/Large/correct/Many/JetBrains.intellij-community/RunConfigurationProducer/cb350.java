diff --git a/platform/lang-api/src/com/intellij/execution/actions/RunConfigurationProducer.java b/platform/lang-api/src/com/intellij/execution/actions/RunConfigurationProducer.java
index bea5f3d..6969af3 100644
--- a/platform/lang-api/src/com/intellij/execution/actions/RunConfigurationProducer.java
+++ b/platform/lang-api/src/com/intellij/execution/actions/RunConfigurationProducer.java
@@ -79,7 +79,7 @@
        return null;
      }
     }
-    catch (ClassCastException e) {
+    catch (Exception e) {
       LOG.error(myConfigurationFactory + " produced wrong type", e);
       return null;
     }
