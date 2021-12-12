diff --git a/tck/src/main/java/org/reactivestreams/tck/TestEnvironment.java b/tck/src/main/java/org/reactivestreams/tck/TestEnvironment.java
index a4ae700..ce0a5b9 100644
--- a/tck/src/main/java/org/reactivestreams/tck/TestEnvironment.java
+++ b/tck/src/main/java/org/reactivestreams/tck/TestEnvironment.java
@@ -908,7 +908,7 @@
         // we add the value to the queue such to wake up any expectCompletion which was triggered before complete() was called
         abq.add(value);
       } else {
-        env.flop(String.format("Cannot complete a promise more than once! Present value: %s, attempted to set: %s", value));
+        env.flop(String.format("Cannot complete a promise more than once! Present value: %s, attempted to set: %s", _value.get(), value));
       }
     }
 
