diff --git a/components/camel-jmx/src/test/java/org/apache/camel/component/jmx/JMXObjectPropertiesTest.java b/components/camel-jmx/src/test/java/org/apache/camel/component/jmx/JMXObjectPropertiesTest.java
index 2851fd2..4eb9597 100644
--- a/components/camel-jmx/src/test/java/org/apache/camel/component/jmx/JMXObjectPropertiesTest.java
+++ b/components/camel-jmx/src/test/java/org/apache/camel/component/jmx/JMXObjectPropertiesTest.java
@@ -43,7 +43,7 @@
     protected void initRegistry() {
         Map<String, String> ht = new Hashtable<>();
         ht.put("name", "simpleBean");
-        getRegistry().put("myTable", ht);
+        getRegistry().bind("myTable", ht);
     }
 
 }
