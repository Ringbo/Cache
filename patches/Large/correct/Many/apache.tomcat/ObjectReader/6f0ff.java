diff --git a/java/org/apache/catalina/tribes/io/ObjectReader.java b/java/org/apache/catalina/tribes/io/ObjectReader.java
index 6ea307e..9d1b78a 100644
--- a/java/org/apache/catalina/tribes/io/ObjectReader.java
+++ b/java/org/apache/catalina/tribes/io/ObjectReader.java
@@ -82,7 +82,7 @@
         this.lastAccess = System.currentTimeMillis();
     }
 
-    public boolean isAccessed() {
+    public synchronized boolean isAccessed() {
         return this.accessed;
     }
 
@@ -150,7 +150,7 @@
         this.buffer = null;
     }
 
-    public long getLastAccess() {
+    public synchronized long getLastAccess() {
         return lastAccess;
     }
 
@@ -158,7 +158,7 @@
         return cancelled;
     }
 
-    public void setLastAccess(long lastAccess) {
+    public synchronized void setLastAccess(long lastAccess) {
         this.lastAccess = lastAccess;
     }
 
