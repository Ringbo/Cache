diff --git a/src/java/org/apache/cassandra/gms/EndpointState.java b/src/java/org/apache/cassandra/gms/EndpointState.java
index 14ab23f..5241c15 100644
--- a/src/java/org/apache/cassandra/gms/EndpointState.java
+++ b/src/java/org/apache/cassandra/gms/EndpointState.java
@@ -131,12 +131,12 @@
         isAGossiper_ = value;        
     }
 
-    public void setHasToken(boolean value)
+    void setHasToken(boolean value)
     {
         hasToken_ = value;
     }
 
-    public boolean hasToken()
+    boolean hasToken()
     {
         return hasToken_;
     }
