diff --git a/websockets-jsr/src/main/java/io/undertow/websockets/jsr/FrameHandler.java b/websockets-jsr/src/main/java/io/undertow/websockets/jsr/FrameHandler.java
index 7ea28e9..e382a2f 100644
--- a/websockets-jsr/src/main/java/io/undertow/websockets/jsr/FrameHandler.java
+++ b/websockets-jsr/src/main/java/io/undertow/websockets/jsr/FrameHandler.java
@@ -86,9 +86,9 @@
                     if (singleBuffer.remaining() > 1) {
                         final CloseReason.CloseCode code = CloseReason.CloseCodes.getCloseCode(singleBuffer.getShort());
                         final String reasonPhrase = singleBuffer.remaining() > 1 ? new UTF8Output(singleBuffer).extract() : null;
-                        session.close(new CloseReason(code, reasonPhrase));
+                        session.closeInternal(new CloseReason(code, reasonPhrase));
                     } else {
-                        session.close();
+                        session.closeInternal(new CloseReason(CloseReason.CloseCodes.NO_STATUS_CODE, null));
                     }
                 } catch (IOException e) {
                     invokeOnError(e);
