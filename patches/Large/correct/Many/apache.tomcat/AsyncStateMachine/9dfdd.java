diff --git a/java/org/apache/coyote/AsyncStateMachine.java b/java/org/apache/coyote/AsyncStateMachine.java
index 1160f4a..00af3a3 100644
--- a/java/org/apache/coyote/AsyncStateMachine.java
+++ b/java/org/apache/coyote/AsyncStateMachine.java
@@ -325,7 +325,7 @@
     }
     
     
-    public void recycle() {
+    public synchronized void recycle() {
         asyncCtxt = null;
         state = AsyncState.DISPATCHED;
     }
