diff --git a/subprojects/gradle-core/src/main/groovy/org/gradle/messaging/dispatch/DeferredConnection.java b/subprojects/gradle-core/src/main/groovy/org/gradle/messaging/dispatch/DeferredConnection.java
index dc6a8b6..53079c2 100755
--- a/subprojects/gradle-core/src/main/groovy/org/gradle/messaging/dispatch/DeferredConnection.java
+++ b/subprojects/gradle-core/src/main/groovy/org/gradle/messaging/dispatch/DeferredConnection.java
@@ -177,7 +177,7 @@
             LOGGER.error(String.format("Could not send message using %s. Discarding connection.", dispatch), throwable);
             lock.lock();
             try {
-                switch (receiveState) {
+                switch (dispatchState) {
                     case Connected:
                         setState(receiveState.onDispatchEndOfStream(), State.Stopped);
                         break;
