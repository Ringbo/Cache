diff --git a/pinot-server/src/main/java/com/linkedin/pinot/server/starter/helix/SegmentMessageHandlerFactory.java b/pinot-server/src/main/java/com/linkedin/pinot/server/starter/helix/SegmentMessageHandlerFactory.java
index b8c310e..ddaf778 100644
--- a/pinot-server/src/main/java/com/linkedin/pinot/server/starter/helix/SegmentMessageHandlerFactory.java
+++ b/pinot-server/src/main/java/com/linkedin/pinot/server/starter/helix/SegmentMessageHandlerFactory.java
@@ -153,7 +153,9 @@
           _instanceDataManager.reloadSegment(_tableNameWithType, _segmentName);
         }
         helixTaskResult.setSuccess(true);
-      } catch (Exception e) {
+      } catch (Throwable e) {
+        // catch all Errors and Exceptions: if we only catch Exception, Errors go completely unhandled
+        // (without any corresponding logs to indicate failure!) in the callable path
         throw new RuntimeException(
             "Caught exception while reloading segment: " + _segmentName + " in table: " + _tableNameWithType, e);
       } finally {
