diff --git a/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/TruffleLanguage.java b/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/TruffleLanguage.java
index d324144..a0c7d58 100644
--- a/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/TruffleLanguage.java
+++ b/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/TruffleLanguage.java
@@ -470,7 +470,7 @@
             }
             try {
                 return target.call();
-            } catch (Exception ex) {
+            } catch (Throwable ex) {
                 throw new IOException(ex);
             }
         }
