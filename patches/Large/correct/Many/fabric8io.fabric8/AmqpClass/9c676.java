diff --git a/fabric-apollo/fabric-apollo-amqp-gen/src/main/java/org/fusesource/fabric/apollo/amqp/generator/AmqpClass.java b/fabric-apollo/fabric-apollo-amqp-gen/src/main/java/org/fusesource/fabric/apollo/amqp/generator/AmqpClass.java
index 74c9757..91cd93f 100644
--- a/fabric-apollo/fabric-apollo-amqp-gen/src/main/java/org/fusesource/fabric/apollo/amqp/generator/AmqpClass.java
+++ b/fabric-apollo/fabric-apollo-amqp-gen/src/main/java/org/fusesource/fabric/apollo/amqp/generator/AmqpClass.java
@@ -60,7 +60,7 @@
         this.restrictedType = type.getSource();
         this.label = type.getLabel();
         this.provides = type.getProvides();
-        if ( "frame".equals(provides) ) {
+        if ( "frame".equals(provides) || "sasl-frame".equals(provides) ) {
             isCommand = true;
             Generator.COMMANDS.add(this.name);
         }
