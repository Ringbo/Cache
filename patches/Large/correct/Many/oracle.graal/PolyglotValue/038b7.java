diff --git a/truffle/src/com.oracle.truffle.api.vm/src/com/oracle/truffle/api/vm/PolyglotValue.java b/truffle/src/com.oracle.truffle.api.vm/src/com/oracle/truffle/api/vm/PolyglotValue.java
index 1d6b173..db55a57 100644
--- a/truffle/src/com.oracle.truffle.api.vm/src/com/oracle/truffle/api/vm/PolyglotValue.java
+++ b/truffle/src/com.oracle.truffle.api.vm/src/com/oracle/truffle/api/vm/PolyglotValue.java
@@ -1738,7 +1738,7 @@
                     throw handleInvalidArity(e);
                 } catch (UnsupportedMessageException e) {
                     CompilerDirectives.transferToInterpreter();
-                    return polyglot.executeUnsupported(receiver);
+                    return polyglot.newInstanceUnsupported(receiver);
                 }
             }
 
