diff --git a/src/java/com/cloudera/flume/handlers/endtoend/ValueDecorator.java b/src/java/com/cloudera/flume/handlers/endtoend/ValueDecorator.java
index cceb379..96f6142 100644
--- a/src/java/com/cloudera/flume/handlers/endtoend/ValueDecorator.java
+++ b/src/java/com/cloudera/flume/handlers/endtoend/ValueDecorator.java
@@ -50,7 +50,8 @@
       @Override
       public EventSinkDecorator<EventSink> build(Context context,
           String... argv) {
-        Preconditions.checkArgument(argv.length == 2);
+        Preconditions.checkArgument(argv.length == 2,
+            "usage: value(\"attr\", \"value\")");
         String attr = argv[0];
         String v = argv[1];
         return new ValueDecorator<EventSink>(null, attr, v.getBytes());
