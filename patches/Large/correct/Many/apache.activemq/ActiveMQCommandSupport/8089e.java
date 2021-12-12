diff --git a/activemq-karaf/src/main/java/org/apache/activemq/karaf/commands/ActiveMQCommandSupport.java b/activemq-karaf/src/main/java/org/apache/activemq/karaf/commands/ActiveMQCommandSupport.java
index 9822037..c05e7d0 100644
--- a/activemq-karaf/src/main/java/org/apache/activemq/karaf/commands/ActiveMQCommandSupport.java
+++ b/activemq-karaf/src/main/java/org/apache/activemq/karaf/commands/ActiveMQCommandSupport.java
@@ -41,7 +41,8 @@
 
         try {
             currentCommand.setCommandContext(context2);
-            arguments.add("--jmxlocal");
+            // must be added first
+            arguments.add(0, "--jmxlocal");
             currentCommand.execute(arguments);
             return null;
         } catch (Throwable e) {
