diff --git a/fotoapparat/src/main/java/io/fotoapparat/hardware/v2/lens/operations/transformer/FocusResultTransformer.java b/fotoapparat/src/main/java/io/fotoapparat/hardware/v2/lens/operations/transformer/FocusResultTransformer.java
index 18354ec..ed1b7d7 100644
--- a/fotoapparat/src/main/java/io/fotoapparat/hardware/v2/lens/operations/transformer/FocusResultTransformer.java
+++ b/fotoapparat/src/main/java/io/fotoapparat/hardware/v2/lens/operations/transformer/FocusResultTransformer.java
@@ -17,10 +17,10 @@
     public FocusResultState transform(CaptureResult input) {
         Integer autoFocusState = input.get(CaptureResult.CONTROL_AF_STATE);
 
-        boolean lockSuceeded = autoFocusState != null && isFocusLocked(autoFocusState);
+        boolean lockSucceeded = autoFocusState != null && isFocusLocked(autoFocusState);
         boolean needsExposureMeasurement = needsExposureMeasurement(input);
 
-        return new FocusResultState(lockSuceeded, needsExposureMeasurement);
+        return new FocusResultState(lockSucceeded, needsExposureMeasurement);
     }
 
     private boolean needsExposureMeasurement(CaptureResult input) {
