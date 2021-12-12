diff --git a/modules/core/src/test/java/org/apache/ignite/internal/GridProjectionLocalJobMultipleArgumentsSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/GridProjectionLocalJobMultipleArgumentsSelfTest.java
index 58ff1fb..356e002 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/GridProjectionLocalJobMultipleArgumentsSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/GridProjectionLocalJobMultipleArgumentsSelfTest.java
@@ -43,7 +43,7 @@
     private static final TcpDiscoveryIpFinder IP_FINDER = new TcpDiscoveryVmIpFinder(true);
 
     /** */
-    private static Collection<Integer> ids;
+    private static Collection<Object> ids;
 
     /** */
     private static AtomicInteger res;
@@ -90,7 +90,7 @@
         for (int i : F.asList(1, 2, 3)) {
             res.add(grid().compute().affinityCall(null, i, new IgniteCallable<Integer>() {
                 @Override public Integer call() {
-                    ids.add(System.identityHashCode(this));
+                    ids.add(this);
 
                     return 10;
                 }
@@ -108,7 +108,7 @@
         for (int i : F.asList(1, 2, 3)) {
             grid().compute().affinityRun(null, i, new IgniteRunnable() {
                 @Override public void run() {
-                    ids.add(System.identityHashCode(this));
+                    ids.add(this);
 
                     res.addAndGet(10);
                 }
@@ -125,8 +125,7 @@
     public void testCall() throws Exception {
         Collection<Integer> res = grid().compute().apply(new C1<Integer, Integer>() {
             @Override public Integer apply(Integer arg) {
-
-                ids.add(System.identityHashCode(this));
+                ids.add(this);
 
                 return 10 + arg;
             }
@@ -144,7 +143,7 @@
 
         Collection<Integer> res = grid().compute().apply(new C1<Integer, Integer>() {
             @Override public Integer apply(Integer arg) {
-                ids.add(System.identityHashCode(this));
+                ids.add(this);
 
                 return 10 + arg;
             }
