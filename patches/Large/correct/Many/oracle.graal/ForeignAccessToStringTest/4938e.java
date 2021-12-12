diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/interop/ForeignAccessToStringTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/interop/ForeignAccessToStringTest.java
index e0081a9..d957d53 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/interop/ForeignAccessToStringTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/interop/ForeignAccessToStringTest.java
@@ -42,7 +42,7 @@
     }
 
     private static class SimpleTestingFactory implements ForeignAccess.Factory {
-        public SimpleTestingFactory() {
+        SimpleTestingFactory() {
         }
 
         @Override
