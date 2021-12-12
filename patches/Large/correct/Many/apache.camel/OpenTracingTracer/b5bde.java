diff --git a/components/camel-opentracing/src/main/java/org/apache/camel/opentracing/OpenTracingTracer.java b/components/camel-opentracing/src/main/java/org/apache/camel/opentracing/OpenTracingTracer.java
index f3d15d4..3ae9fc1 100644
--- a/components/camel-opentracing/src/main/java/org/apache/camel/opentracing/OpenTracingTracer.java
+++ b/components/camel-opentracing/src/main/java/org/apache/camel/opentracing/OpenTracingTracer.java
@@ -242,7 +242,8 @@
                     managedSpan.deactivate();
                 }
             } catch (Throwable t) {
-                LOG.error("OpenTracing: Failed to capture tracing data", t);
+                // This exception is ignored
+                LOG.warn("OpenTracing: Failed to capture tracing data", t);
             }
         }
 
@@ -283,7 +284,8 @@
                     LOG.trace("OpenTracing: start server span=" + span);
                 }
             } catch (Throwable t) {
-                LOG.error("OpenTracing: Failed to capture tracing data", t);
+                // This exception is ignored
+                LOG.warn("OpenTracing: Failed to capture tracing data", t);
             }
         }
 
@@ -303,7 +305,8 @@
                     LOG.warn("OpenTracing: could not find managed span for exchange=" + exchange);
                 }
             } catch (Throwable t) {
-                LOG.error("OpenTracing: Failed to capture tracing data", t);
+                // This exception is ignored
+                LOG.warn("OpenTracing: Failed to capture tracing data", t);
             }
         }
     }
@@ -327,7 +330,8 @@
                     span.log(fields);
                 }
             } catch (Throwable t) {
-                LOG.error("OpenTracing: Failed to capture tracing data", t);
+                // This exception is ignored
+                LOG.warn("OpenTracing: Failed to capture tracing data", t);
             }
             return message;
         }
