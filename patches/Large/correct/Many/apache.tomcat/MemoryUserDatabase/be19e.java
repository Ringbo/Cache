diff --git a/java/org/apache/catalina/users/MemoryUserDatabase.java b/java/org/apache/catalina/users/MemoryUserDatabase.java
index 01c9894..0d8556f 100644
--- a/java/org/apache/catalina/users/MemoryUserDatabase.java
+++ b/java/org/apache/catalina/users/MemoryUserDatabase.java
@@ -329,7 +329,7 @@
         }
 
         MemoryUser user = new MemoryUser(this, username, password, fullName);
-        readLock.unlock();
+        readLock.lock();
         try {
             users.put(user.getUsername(), user);
         } finally {
