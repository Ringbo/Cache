diff --git a/examples/schema-import/src/main/java/org/apache/ignite/schema/DemoNode.java b/examples/schema-import/src/main/java/org/apache/ignite/schema/DemoNode.java
index 24a5486..7b8f832 100644
--- a/examples/schema-import/src/main/java/org/apache/ignite/schema/DemoNode.java
+++ b/examples/schema-import/src/main/java/org/apache/ignite/schema/DemoNode.java
@@ -32,6 +32,6 @@
     public static void main(String[] args) throws IgniteException {
         System.out.println(">>> Start demo node...");
 
-        Ignition.start();
+        Ignition.start("examples/config/example-ignite.xml");
     }
 }
