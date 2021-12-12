diff --git a/jetty-spdy/spdy-core/src/main/java/org/eclipse/jetty/spdy/StandardSession.java b/jetty-spdy/spdy-core/src/main/java/org/eclipse/jetty/spdy/StandardSession.java
index a3db9e8..3146953 100644
--- a/jetty-spdy/spdy-core/src/main/java/org/eclipse/jetty/spdy/StandardSession.java
+++ b/jetty-spdy/spdy-core/src/main/java/org/eclipse/jetty/spdy/StandardSession.java
@@ -859,7 +859,7 @@
             // starvation (for the last frames sent) and stack overflow.
             // Therefore every some invocation, we dispatch to a new thread
             Integer invocations = handlerInvocations.get();
-            if (invocations >= 8)
+            if (invocations >= 4)
             {
                 execute(new Runnable()
                 {
@@ -881,7 +881,7 @@
                 }
                 finally
                 {
-                    handlerInvocations.set(invocations - 1);
+                    handlerInvocations.set(invocations);
                 }
             }
         }
