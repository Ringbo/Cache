diff --git a/rt/databinding/aegis/src/test/java/org/apache/cxf/aegis/services/Echo.java b/rt/databinding/aegis/src/test/java/org/apache/cxf/aegis/services/Echo.java
index 281c461..ac576c0 100644
--- a/rt/databinding/aegis/src/test/java/org/apache/cxf/aegis/services/Echo.java
+++ b/rt/databinding/aegis/src/test/java/org/apache/cxf/aegis/services/Echo.java
@@ -30,7 +30,7 @@
         return echo;
     }
     
-    public String simpleEcho(String string) {
+    public String simpleEcho(String string) throws Exception {
         return string;
     }
     @WebMethod
