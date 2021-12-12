diff --git a/src/com/facebook/buck/jvm/java/TracingProcessorWrapper.java b/src/com/facebook/buck/jvm/java/TracingProcessorWrapper.java
index f29b7a9..901118f 100644
--- a/src/com/facebook/buck/jvm/java/TracingProcessorWrapper.java
+++ b/src/com/facebook/buck/jvm/java/TracingProcessorWrapper.java
@@ -57,7 +57,7 @@
         begin(AnnotationProcessingEvent.Operation.GET_SUPPORTED_OPTIONS);
     try {
       return innerProcessor.getSupportedOptions();
-    } catch (RuntimeException e) {
+    } catch (RuntimeException | Error e) {
       throw wrapAnnotationProcessorCrashException(e);
     } finally {
       end(started);
@@ -70,7 +70,7 @@
         begin(AnnotationProcessingEvent.Operation.GET_SUPPORTED_ANNOTATION_TYPES);
     try {
       return innerProcessor.getSupportedAnnotationTypes();
-    } catch (RuntimeException e) {
+    } catch (RuntimeException | Error e) {
       throw wrapAnnotationProcessorCrashException(e);
     } finally {
       end(started);
@@ -83,7 +83,7 @@
         begin(AnnotationProcessingEvent.Operation.GET_SUPPORTED_SOURCE_VERSION);
     try {
       return innerProcessor.getSupportedSourceVersion();
-    } catch (RuntimeException e) {
+    } catch (RuntimeException | Error e) {
       throw wrapAnnotationProcessorCrashException(e);
     } finally {
       end(started);
@@ -95,7 +95,7 @@
     AnnotationProcessingEvent.Started started = begin(AnnotationProcessingEvent.Operation.INIT);
     try {
       innerProcessor.init(processingEnv);
-    } catch (RuntimeException e) {
+    } catch (RuntimeException | Error e) {
       throw wrapAnnotationProcessorCrashException(e);
     } finally {
       end(started);
@@ -109,14 +109,14 @@
     AnnotationProcessingEvent.Started started = begin(AnnotationProcessingEvent.Operation.PROCESS);
     try {
       return innerProcessor.process(annotations, roundEnv);
-    } catch (RuntimeException e) {
+    } catch (RuntimeException | Error e) {
       throw wrapAnnotationProcessorCrashException(e);
     } finally {
       end(started);
     }
   }
 
-  private HumanReadableException wrapAnnotationProcessorCrashException(RuntimeException e) {
+  private HumanReadableException wrapAnnotationProcessorCrashException(Throwable e) {
     List<String> filteredStackTraceLines = getStackTraceEndingAtAnnotationProcessor(e);
 
     int maxLineLength = filteredStackTraceLines.stream().mapToInt(String::length).max().orElse(75);
@@ -132,7 +132,7 @@
     return new HumanReadableException(e, "\n" + messageBuilder.toString());
   }
 
-  private List<String> getStackTraceEndingAtAnnotationProcessor(RuntimeException e) {
+  private List<String> getStackTraceEndingAtAnnotationProcessor(Throwable e) {
     String[] stackTraceLines = Throwables.getStackTraceAsString(e).split("\n");
     List<String> filteredStackTraceLines = new ArrayList<>();
 
