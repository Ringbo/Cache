diff --git a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/updates/SequenceHandlerActor.java b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/updates/SequenceHandlerActor.java
index 831d631..96f33da 100644
--- a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/updates/SequenceHandlerActor.java
+++ b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/updates/SequenceHandlerActor.java
@@ -23,7 +23,7 @@
         this.processor.processWeakUpdate(update, date);
 
         Log.d(TAG, "Unlocking sequence in 1500 ms");
-        sender().send(new StashIgnore(new SequenceActor.UpdateProcessed()), 1500);
+        sender().send(new StashIgnore(new SequenceActor.UpdateProcessed()));
     }
 
     @Override
