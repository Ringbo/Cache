diff --git a/hazelcast/src/main/java/com/hazelcast/examples/TestApp.java b/hazelcast/src/main/java/com/hazelcast/examples/TestApp.java
index c8b085e..e583dd5 100644
--- a/hazelcast/src/main/java/com/hazelcast/examples/TestApp.java
+++ b/hazelcast/src/main/java/com/hazelcast/examples/TestApp.java
@@ -631,7 +631,7 @@
     private void handleAtomicNumberSet(String[] args) {
         long v = 0;
         if (args.length > 1) {
-            v = Long.valueOf(args[1]);
+            v = Long.parseLong(args[1]);
         }
         getAtomicNumber().set(v);
         println(getAtomicNumber().get());
@@ -848,7 +848,7 @@
 
     protected void handleMapTryLock(String[] args) {
         String key = args[1];
-        long time = (args.length > 2) ? Long.valueOf(args[2]) : 0;
+        long time = (args.length > 2) ? Long.parseLong(args[2]) : 0;
         boolean locked;
         if (time == 0) {
             locked = getMap().tryLock(key);
@@ -971,7 +971,7 @@
 
     protected void handleMultiMapTryLock(String[] args) {
         String key = args[1];
-        long time = (args.length > 2) ? Long.valueOf(args[2]) : 0;
+        long time = (args.length > 2) ? Long.parseLong(args[2]) : 0;
         boolean locked;
         if (time == 0) {
             locked = getMultiMap().tryLock(key);
@@ -1019,7 +1019,7 @@
             if (timeout == null) {
                 println(lock.tryLock());
             } else {
-                long time = Long.valueOf(timeout);
+                long time = Long.parseLong(timeout);
                 try {
                     println(lock.tryLock(time, TimeUnit.SECONDS));
                 } catch (InterruptedException e) {
@@ -1232,7 +1232,7 @@
     protected void handleQOffer(String[] args) {
         long timeout = 0;
         if (args.length > 2) {
-            timeout = Long.valueOf(args[2]);
+            timeout = Long.parseLong(args[2]);
         }
         try {
             boolean offered = getQueue().offer(args[1], timeout, TimeUnit.SECONDS);
@@ -1253,7 +1253,7 @@
     protected void handleQPoll(String[] args) {
         long timeout = 0;
         if (args.length > 1) {
-            timeout = Long.valueOf(args[1]);
+            timeout = Long.parseLong(args[1]);
         }
         try {
             println(getQueue().poll(timeout, TimeUnit.SECONDS));
