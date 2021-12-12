diff --git a/bundles/io/org.eclipse.smarthome.io.rest.voice/src/main/java/org/eclipse/smarthome/io/rest/voice/internal/VoiceResource.java b/bundles/io/org.eclipse.smarthome.io.rest.voice/src/main/java/org/eclipse/smarthome/io/rest/voice/internal/VoiceResource.java
index 7a89a38..d868403 100644
--- a/bundles/io/org.eclipse.smarthome.io.rest.voice/src/main/java/org/eclipse/smarthome/io/rest/voice/internal/VoiceResource.java
+++ b/bundles/io/org.eclipse.smarthome.io.rest.voice/src/main/java/org/eclipse/smarthome/io/rest/voice/internal/VoiceResource.java
@@ -121,7 +121,7 @@
         if (hli != null) {
             try {
                 hli.interpret(locale, text);
-                return Response.ok().build();
+                return Response.ok(null, MediaType.TEXT_PLAIN).build();
             } catch (InterpretationException e) {
                 return JSONResponse.createErrorResponse(Status.BAD_REQUEST, e.getMessage());
             }
@@ -144,7 +144,7 @@
         if (hli != null) {
             try {
                 hli.interpret(locale, text);
-                return Response.ok().build();
+                return Response.ok(null, MediaType.TEXT_PLAIN).build();
             } catch (InterpretationException e) {
                 return JSONResponse.createErrorResponse(Status.BAD_REQUEST, e.getMessage());
             }
