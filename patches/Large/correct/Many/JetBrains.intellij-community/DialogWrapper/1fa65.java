diff --git a/platform/platform-api/src/com/intellij/openapi/ui/DialogWrapper.java b/platform/platform-api/src/com/intellij/openapi/ui/DialogWrapper.java
index 2c44329..db4a51c 100644
--- a/platform/platform-api/src/com/intellij/openapi/ui/DialogWrapper.java
+++ b/platform/platform-api/src/com/intellij/openapi/ui/DialogWrapper.java
@@ -1410,7 +1410,7 @@
           JRootPane rootPane = getRootPane();
           myValidationAlarm.addRequest(validateRequest, myValidationDelay,
                                        rootPane == null ? ModalityState.current() : ModalityState.stateForComponent(rootPane));
-        }, ModalityState.any(), __ -> !myDisposed);
+        }, ModalityState.any(), __ -> myDisposed);
       }
     }
     else {
