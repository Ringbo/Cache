diff --git a/core/src/main/java/tachyon/worker/DataServerMessage.java b/core/src/main/java/tachyon/worker/DataServerMessage.java
index 2c03f6f..e3da84b 100644
--- a/core/src/main/java/tachyon/worker/DataServerMessage.java
+++ b/core/src/main/java/tachyon/worker/DataServerMessage.java
@@ -222,7 +222,7 @@
    * Check if the message is ready. If not ready, it will throw a runtime exception.
    */
   public void checkReady() {
-    Preconditions.checkState(!mIsMessageReady, "Message is not ready.");
+    Preconditions.checkState(mIsMessageReady, "Message is not ready.");
   }
 
   /**
