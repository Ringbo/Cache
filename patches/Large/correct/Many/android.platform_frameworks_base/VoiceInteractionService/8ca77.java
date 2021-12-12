diff --git a/core/java/android/service/voice/VoiceInteractionService.java b/core/java/android/service/voice/VoiceInteractionService.java
index 770d66c..b200356 100644
--- a/core/java/android/service/voice/VoiceInteractionService.java
+++ b/core/java/android/service/voice/VoiceInteractionService.java
@@ -128,7 +128,7 @@
         if (curComp == null) {
             return false;
         }
-        return curComp.equals(cur);
+        return curComp.equals(service);
     }
 
     /**
