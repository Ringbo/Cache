diff --git a/src/functions/org/apache/jmeter/functions/Property2.java b/src/functions/org/apache/jmeter/functions/Property2.java
index da6c1bf..d77f1bf 100644
--- a/src/functions/org/apache/jmeter/functions/Property2.java
+++ b/src/functions/org/apache/jmeter/functions/Property2.java
@@ -114,7 +114,7 @@
 
     public Object clone()
     {
-        return new Property();
+        return new Property2();
     }
 
     public synchronized String execute(
