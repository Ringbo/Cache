diff --git a/streams/src/test/java/org/apache/kafka/streams/processor/internals/GlobalStateManagerImplTest.java b/streams/src/test/java/org/apache/kafka/streams/processor/internals/GlobalStateManagerImplTest.java
index 0519fb0..e9d61f5 100644
--- a/streams/src/test/java/org/apache/kafka/streams/processor/internals/GlobalStateManagerImplTest.java
+++ b/streams/src/test/java/org/apache/kafka/streams/processor/internals/GlobalStateManagerImplTest.java
@@ -214,7 +214,7 @@
         stateManager.initialize(context);
 
         final TheStateRestoreCallback stateRestoreCallback = new TheStateRestoreCallback();
-        stateManager.register(store1, false, stateRestoreCallback);
+        stateManager.register(store1, stateRestoreCallback);
 
         assertThat(stateRestoreListener.restoreStartOffset, equalTo(1L));
         assertThat(stateRestoreListener.restoreEndOffset, equalTo(5L));
