diff --git a/logback-classic/src/main/java/org/slf4j/impl/StaticLoggerBinder.java b/logback-classic/src/main/java/org/slf4j/impl/StaticLoggerBinder.java
index d5e7811..004021d 100644
--- a/logback-classic/src/main/java/org/slf4j/impl/StaticLoggerBinder.java
+++ b/logback-classic/src/main/java/org/slf4j/impl/StaticLoggerBinder.java
@@ -91,7 +91,7 @@
             }
             contextSelectorBinder.init(defaultLoggerContext, KEY);
             initialized = true;
-        } catch (Throwable t) {
+        } catch (Exception t) {//do not swallow Errors
             // we should never get here
             Util.report("Failed to instantiate [" + LoggerContext.class.getName() + "]", t);
         }
