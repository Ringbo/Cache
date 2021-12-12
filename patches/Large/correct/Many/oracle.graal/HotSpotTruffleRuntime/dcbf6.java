diff --git a/graal/com.oracle.graal.truffle.hotspot/src/com/oracle/graal/truffle/hotspot/HotSpotTruffleRuntime.java b/graal/com.oracle.graal.truffle.hotspot/src/com/oracle/graal/truffle/hotspot/HotSpotTruffleRuntime.java
index 358056c..1999554 100644
--- a/graal/com.oracle.graal.truffle.hotspot/src/com/oracle/graal/truffle/hotspot/HotSpotTruffleRuntime.java
+++ b/graal/com.oracle.graal.truffle.hotspot/src/com/oracle/graal/truffle/hotspot/HotSpotTruffleRuntime.java
@@ -77,7 +77,7 @@
     }
 
     private Map<OptimizedCallTarget, Future<?>> compilations = newIdentityMap();
-    private final ThreadPoolExecutor compileQueue;
+    private final ExecutorService compileQueue;
 
     private final Map<RootCallTarget, Void> callTargets = Collections.synchronizedMap(new WeakHashMap<RootCallTarget, Void>());
     private static final long THREAD_EETOP_OFFSET = eetopOffset();
@@ -111,8 +111,7 @@
             }
         }
         selectedProcessors = Math.max(1, selectedProcessors);
-        compileQueue = new ThreadPoolExecutor(selectedProcessors, selectedProcessors, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(), factory);
-
+        compileQueue = Executors.newFixedThreadPool(selectedProcessors, factory);
     }
 
     @Override
