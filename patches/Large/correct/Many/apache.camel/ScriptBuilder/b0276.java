diff --git a/components/camel-script/src/main/java/org/apache/camel/builder/script/ScriptBuilder.java b/components/camel-script/src/main/java/org/apache/camel/builder/script/ScriptBuilder.java
index b1ff52a..9d9d87a 100644
--- a/components/camel-script/src/main/java/org/apache/camel/builder/script/ScriptBuilder.java
+++ b/components/camel-script/src/main/java/org/apache/camel/builder/script/ScriptBuilder.java
@@ -454,7 +454,7 @@
     }
 
     protected boolean matches(E exchange, Object scriptValue) {
-        return ObjectConverter.toBoolean(scriptValue);
+        return ObjectConverter.toBool(scriptValue);
     }
 
     protected ScriptEngine createScriptEngine() {
