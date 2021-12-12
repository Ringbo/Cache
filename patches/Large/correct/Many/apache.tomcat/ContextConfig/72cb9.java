diff --git a/java/org/apache/catalina/startup/ContextConfig.java b/java/org/apache/catalina/startup/ContextConfig.java
index 296f69c..c610026 100644
--- a/java/org/apache/catalina/startup/ContextConfig.java
+++ b/java/org/apache/catalina/startup/ContextConfig.java
@@ -2023,16 +2023,16 @@
                     className), e);
             return;
         } catch (ClassNotFoundException e) {
-            log.warn(sm.getString("contextConfig.invalidSciHandlesTypes",
+            log.debug(sm.getString("contextConfig.invalidSciHandlesTypes",
                     className), e);
             return;
         } catch (ClassFormatError e) {
-            log.warn(sm.getString("contextConfig.invalidSciHandlesTypes",
+            log.debug(sm.getString("contextConfig.invalidSciHandlesTypes",
                     className), e);
             return;
         } catch (Throwable t) {
             ExceptionUtils.handleThrowable(t);
-            log.warn(sm.getString("contextConfig.invalidSciHandlesTypes",
+            log.debug(sm.getString("contextConfig.invalidSciHandlesTypes",
                     className), t);
             return;
         }
