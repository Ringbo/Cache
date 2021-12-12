diff --git a/src/main/org/codehaus/groovy/vmplugin/v7/IndyInterface.java b/src/main/org/codehaus/groovy/vmplugin/v7/IndyInterface.java
index 799974a..71def44 100644
--- a/src/main/org/codehaus/groovy/vmplugin/v7/IndyInterface.java
+++ b/src/main/org/codehaus/groovy/vmplugin/v7/IndyInterface.java
@@ -239,7 +239,7 @@
                 } else {
                     ci.handle = LOOKUP.findVirtual(MetaClass.class, "invokeMethod", INVOKE_METHOD_SIGNATURE);
                     ci.handle = ci.handle.bindTo(mc).bindTo(receiver.getClass());
-                    ci.handle = MethodHandles.insertArguments(ci.handle, ci.handle.type().parameterCount()-2, true, false);
+                    ci.handle = MethodHandles.insertArguments(ci.handle, ci.handle.type().parameterCount()-2, false, true);
                     if (receiver instanceof GroovyObject) {
                         // if the meta class call fails we may still want to fall back to call
                         // GroovyObject#invokeMethod if the receiver is a GroovyObject
