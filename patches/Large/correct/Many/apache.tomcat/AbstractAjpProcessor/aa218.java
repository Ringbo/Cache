diff --git a/java/org/apache/coyote/ajp/AbstractAjpProcessor.java b/java/org/apache/coyote/ajp/AbstractAjpProcessor.java
index 0620661..9e1f0bd 100644
--- a/java/org/apache/coyote/ajp/AbstractAjpProcessor.java
+++ b/java/org/apache/coyote/ajp/AbstractAjpProcessor.java
@@ -772,8 +772,8 @@
                 } catch (Throwable t) {
                     ExceptionUtils.handleThrowable(t);
                     getLog().debug(sm.getString("ajpprocessor.request.prepare"), t);
-                    // 400 - Internal Server Error
-                    response.setStatus(400);
+                    // 500 - Internal Server Error
+                    response.setStatus(500);
                     getAdapter().log(request, response, 0);
                     error = true;
                 }
