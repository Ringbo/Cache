diff --git a/truffle/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/JavaInterop.java b/truffle/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/JavaInterop.java
index 9fa9ddd..08643d8 100644
--- a/truffle/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/JavaInterop.java
+++ b/truffle/com.oracle.truffle.api.interop.java/src/com/oracle/truffle/api/interop/java/JavaInterop.java
@@ -366,8 +366,7 @@
             }
 
             if (Message.createExecute(0).equals(message)) {
-                List<Object> copy = new ArrayList<>(args.length + 1);
-                // copy.add(obj);
+                List<Object> copy = new ArrayList<>(args.length);
                 copy.addAll(Arrays.asList(args));
                 message = Message.createExecute(copy.size());
                 val = message(message, obj, copy.toArray());
@@ -376,9 +375,9 @@
 
             if (Message.createInvoke(0).equals(message)) {
                 List<Object> copy = new ArrayList<>(args.length + 1);
-                copy.add(obj);
+                copy.add(name);
                 copy.addAll(Arrays.asList(args));
-                message = Message.createInvoke(copy.size());
+                message = Message.createInvoke(args.length);
                 val = message(message, obj, copy.toArray());
                 return toJava(val, method);
             }
@@ -395,7 +394,7 @@
                     List<Object> callArgs = new ArrayList<>(args.length);
                     callArgs.add(name);
                     callArgs.addAll(Arrays.asList(args));
-                    ret = message(Message.createInvoke(callArgs.size()), obj, callArgs.toArray());
+                    ret = message(Message.createInvoke(args.length), obj, callArgs.toArray());
                 } catch (IllegalArgumentException ex) {
                     val = message(Message.READ, obj, name);
                     if (isPrimitive(val)) {
