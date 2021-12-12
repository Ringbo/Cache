diff --git a/actor-sdk/sdk-core/runtime/runtime-android/src/main/java/im/actor/runtime/android/AndroidThreadingProvider.java b/actor-sdk/sdk-core/runtime/runtime-android/src/main/java/im/actor/runtime/android/AndroidThreadingProvider.java
index a49aff4..bdbc6ea 100644
--- a/actor-sdk/sdk-core/runtime/runtime-android/src/main/java/im/actor/runtime/android/AndroidThreadingProvider.java
+++ b/actor-sdk/sdk-core/runtime/runtime-android/src/main/java/im/actor/runtime/android/AndroidThreadingProvider.java
@@ -60,6 +60,6 @@
 
     @Override
     public long getSyncedCurrentTime() {
-        return System.currentTimeMillis() - syncDelta;
+        return System.currentTimeMillis() + syncDelta;
     }
 }
