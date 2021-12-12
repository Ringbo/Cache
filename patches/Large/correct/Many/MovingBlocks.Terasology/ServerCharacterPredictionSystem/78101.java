diff --git a/engine/src/main/java/org/terasology/logic/characters/ServerCharacterPredictionSystem.java b/engine/src/main/java/org/terasology/logic/characters/ServerCharacterPredictionSystem.java
index d2bafb2..91906d2 100644
--- a/engine/src/main/java/org/terasology/logic/characters/ServerCharacterPredictionSystem.java
+++ b/engine/src/main/java/org/terasology/logic/characters/ServerCharacterPredictionSystem.java
@@ -131,7 +131,7 @@
         }
         CircularBuffer<CharacterStateEvent> stateBuffer = characterStates.get(entity);
         CharacterStateEvent lastState = stateBuffer.getLast();
-        float delta = input.getDelta() + lastState.getTime() - (time.getGameTimeInMs() + MAX_INPUT_OVERFLOW );
+        float delta = input.getDeltaMs() + lastState.getTime() - (time.getGameTimeInMs() + MAX_INPUT_OVERFLOW );
         if (recordAndReplayCurrentStatus.getStatus() == RecordAndReplayStatus.REPLAYING) {
             delta -= MAX_INPUT_OVERFLOW_REPLAY_INCREASE;
         }
