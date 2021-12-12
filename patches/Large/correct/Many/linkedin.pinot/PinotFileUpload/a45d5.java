diff --git a/pinot-controller/src/main/java/com/linkedin/pinot/controller/api/reslet/resources/PinotFileUpload.java b/pinot-controller/src/main/java/com/linkedin/pinot/controller/api/reslet/resources/PinotFileUpload.java
index 02e7160..4fdb5f0c 100644
--- a/pinot-controller/src/main/java/com/linkedin/pinot/controller/api/reslet/resources/PinotFileUpload.java
+++ b/pinot-controller/src/main/java/com/linkedin/pinot/controller/api/reslet/resources/PinotFileUpload.java
@@ -119,7 +119,7 @@
       }
       presentation = new StringRepresentation("this is a string");
     } catch (final Exception e) {
-      logger.error(e);
+      logger.error("Caught exception while processing get request", e);
     }
     return presentation;
   }
@@ -192,14 +192,14 @@
         setStatus(Status.SERVER_ERROR_INTERNAL);
       }
     } catch (final Exception e) {
-      logger.error(e);
+      logger.error("Caught exception in file upload", e);
       setStatus(Status.CLIENT_ERROR_UNPROCESSABLE_ENTITY);
     } finally {
       if ((tmpSegmentDir != null) && tmpSegmentDir.exists()) {
         try {
           FileUtils.deleteDirectory(tmpSegmentDir);
         } catch (final IOException e) {
-          logger.error(e);
+          logger.error("Caught exception in file upload", e);
         }
       }
       if ((dataFile != null) && dataFile.exists()) {
