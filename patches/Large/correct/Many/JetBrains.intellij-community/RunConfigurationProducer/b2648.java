diff --git a/platform/lang-api/src/com/intellij/execution/actions/RunConfigurationProducer.java b/platform/lang-api/src/com/intellij/execution/actions/RunConfigurationProducer.java
index bfd391d..1fc442b 100644
--- a/platform/lang-api/src/com/intellij/execution/actions/RunConfigurationProducer.java
+++ b/platform/lang-api/src/com/intellij/execution/actions/RunConfigurationProducer.java
@@ -251,7 +251,7 @@
         return null;
       }
     }
-    catch (Exception e) {
+    catch (ClassCastException e) {
       LOG.error(myConfigurationFactory + " produced wrong type", e);
       return null;
     }
