diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/vm/ImplicitExplicitExportTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/vm/ImplicitExplicitExportTest.java
index 03341e3..05df2ce 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/vm/ImplicitExplicitExportTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/vm/ImplicitExplicitExportTest.java
@@ -137,7 +137,7 @@
         final Map<String, String> implicit = new HashMap<>();
         final Env env;
 
-        public Ctx(Env env) {
+        Ctx(Env env) {
             this.env = env;
         }
 
