diff --git a/jetty-client/src/main/java/org/eclipse/jetty/client/HttpSender.java b/jetty-client/src/main/java/org/eclipse/jetty/client/HttpSender.java
index ca6a749..220d96a 100644
--- a/jetty-client/src/main/java/org/eclipse/jetty/client/HttpSender.java
+++ b/jetty-client/src/main/java/org/eclipse/jetty/client/HttpSender.java
@@ -182,9 +182,9 @@
                         StatefulExecutorCallback callback = new StatefulExecutorCallback(client.getExecutor())
                         {
                             @Override
-                            protected void pendingCompleted()
+                            protected void onSucceeded()
                             {
-                                LOG.debug("Write completed for {}", request);
+                                LOG.debug("Write succeeded for {}", request);
 
                                 if (!commit(request))
                                     return;
@@ -215,7 +215,7 @@
 
                         write(callback, header, chunk, expect100 ? null : contentInfo.content);
 
-                        if (callback.isPending())
+                        if (callback.process())
                         {
                             LOG.debug("Write pending for {}", request);
                             return;
@@ -464,7 +464,7 @@
             State previous = state.get();
             while (true)
             {
-                if (state.compareAndSet(previous, State.COMPLETE))
+                if (state.compareAndSet(previous, State.SUCCEEDED))
                     break;
                 previous = state.get();
             }
@@ -475,10 +475,10 @@
         @Override
         public final void run()
         {
-            pendingCompleted();
+            onSucceeded();
         }
 
-        protected abstract void pendingCompleted();
+        protected abstract void onSucceeded();
 
         @Override
         public final void failed(final Throwable x)
@@ -497,26 +497,26 @@
                     @Override
                     public void run()
                     {
-                        failed(x);
+                        onFailed(x);
                     }
                 });
             }
             else
             {
-                failed(x);
+                onFailed(x);
             }
         }
 
         protected abstract void onFailed(Throwable x);
 
-        public boolean isPending()
+        public boolean process()
         {
             return state.compareAndSet(State.INCOMPLETE, State.PENDING);
         }
 
         public boolean isSucceeded()
         {
-            return state.get() == State.COMPLETE;
+            return state.get() == State.SUCCEEDED;
         }
 
         public boolean isFailed()
@@ -526,7 +526,7 @@
 
         private enum State
         {
-            INCOMPLETE, PENDING, COMPLETE, FAILED
+            INCOMPLETE, PENDING, SUCCEEDED, FAILED
         }
     }
 
