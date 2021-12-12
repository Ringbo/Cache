diff --git a/core-client/src/main/java/org/glassfish/jersey/client/ClientRequest.java b/core-client/src/main/java/org/glassfish/jersey/client/ClientRequest.java
index 2ecd5ae..22eaf69 100644
--- a/core-client/src/main/java/org/glassfish/jersey/client/ClientRequest.java
+++ b/core-client/src/main/java/org/glassfish/jersey/client/ClientRequest.java
@@ -450,7 +450,7 @@
             try {
                 commitStream();
             } catch (IOException e) {
-                LOGGER.log(Level.SEVERE, LocalizationMessages.ERROR_COMMITTING_OUTPUT_STREAM());
+                LOGGER.log(Level.SEVERE, LocalizationMessages.ERROR_COMMITTING_OUTPUT_STREAM(), e);
             }
         }
     }
