diff --git a/driver-core/src/test/functional/com/mongodb/binding/SimpleSessionContext.java b/driver-core/src/test/functional/com/mongodb/binding/SimpleSessionContext.java
index 341c78f..8541bca 100644
--- a/driver-core/src/test/functional/com/mongodb/binding/SimpleSessionContext.java
+++ b/driver-core/src/test/functional/com/mongodb/binding/SimpleSessionContext.java
@@ -39,7 +39,7 @@
 
     @Override
     public boolean hasSession() {
-        return false;
+        return true;
     }
 
     @Override
