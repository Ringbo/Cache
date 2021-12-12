diff --git a/src/java/voldemort/serialization/thrift/ThriftSerializer.java b/src/java/voldemort/serialization/thrift/ThriftSerializer.java
index b6ec8e6..1bb6e39 100644
--- a/src/java/voldemort/serialization/thrift/ThriftSerializer.java
+++ b/src/java/voldemort/serialization/thrift/ThriftSerializer.java
@@ -64,7 +64,7 @@
         }
         try {
             this.messageClass = (Class<T>) Class.forName(thriftInfo[0]);
-            T msgObj = messageClass.newInstance();
+            Object msgObj = messageClass.newInstance();
             if(!(msgObj instanceof TBase)) {
                 throw new IllegalArgumentException(thriftInfo[0]
                                                    + " is not a subtype of com.facebook.thrift.TBase");
