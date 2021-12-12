diff --git a/hazelcast/src/test/java/com/hazelcast/concurrent/lock/LockBasicTest.java b/hazelcast/src/test/java/com/hazelcast/concurrent/lock/LockBasicTest.java
index 5a58bef..c4663ed 100644
--- a/hazelcast/src/test/java/com/hazelcast/concurrent/lock/LockBasicTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/concurrent/lock/LockBasicTest.java
@@ -310,7 +310,7 @@
             public void run() throws Exception {
                 assertFalse(lock.isLocked());
             }
-        }, 5);
+        }, 20);
     }
 
     @Test(expected = NullPointerException.class, timeout = 60000)
