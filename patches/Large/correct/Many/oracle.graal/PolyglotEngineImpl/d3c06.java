diff --git a/truffle/src/com.oracle.truffle.api.vm/src/com/oracle/truffle/api/vm/PolyglotEngineImpl.java b/truffle/src/com.oracle.truffle.api.vm/src/com/oracle/truffle/api/vm/PolyglotEngineImpl.java
index 046e4be..b2d07bf 100644
--- a/truffle/src/com.oracle.truffle.api.vm/src/com/oracle/truffle/api/vm/PolyglotEngineImpl.java
+++ b/truffle/src/com.oracle.truffle.api.vm/src/com/oracle/truffle/api/vm/PolyglotEngineImpl.java
@@ -192,7 +192,7 @@
                 if (key.startsWith(OptionValuesImpl.SYSTEM_PROPERTY_PREFIX)) {
                     String engineKey = key.substring(OptionValuesImpl.SYSTEM_PROPERTY_PREFIX.length(), key.length());
                     if (!options.containsKey(engineKey)) {
-                        options.put(key, System.getProperty(key));
+                        options.put(engineKey, System.getProperty(key));
                     }
                 }
             }
