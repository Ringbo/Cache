diff --git a/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/FnApiWindowMappingFn.java b/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/FnApiWindowMappingFn.java
index ffc572a..edd0151 100644
--- a/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/FnApiWindowMappingFn.java
+++ b/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/FnApiWindowMappingFn.java
@@ -284,7 +284,7 @@
               + "the SDK harness but also received %s",
           outputValue);
       return sideInputWindow.getValue().getValue();
-    } catch (Exception e) {
+    } catch (Throwable e) {
       LOG.error("Unable to map main input window {} to side input window.", mainWindow, e);
       throw new IllegalStateException(e);
     }
