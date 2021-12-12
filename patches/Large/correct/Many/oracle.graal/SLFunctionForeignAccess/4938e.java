diff --git a/truffle/com.oracle.truffle.sl/src/com/oracle/truffle/sl/runtime/SLFunctionForeignAccess.java b/truffle/com.oracle.truffle.sl/src/com/oracle/truffle/sl/runtime/SLFunctionForeignAccess.java
index 112cd1a..0f9874f 100644
--- a/truffle/com.oracle.truffle.sl/src/com/oracle/truffle/sl/runtime/SLFunctionForeignAccess.java
+++ b/truffle/com.oracle.truffle.sl/src/com/oracle/truffle/sl/runtime/SLFunctionForeignAccess.java
@@ -90,7 +90,7 @@
     private static class SLForeignCallerRootNode extends RootNode {
         @Child private SLDispatchNode dispatch = SLDispatchNodeGen.create();
 
-        public SLForeignCallerRootNode() {
+        SLForeignCallerRootNode() {
             super(SLLanguage.class, null, null);
         }
 
@@ -108,7 +108,7 @@
     }
 
     private static class SLForeignNullCheckNode extends RootNode {
-        public SLForeignNullCheckNode() {
+        SLForeignNullCheckNode() {
             super(SLLanguage.class, null, null);
         }
 
@@ -120,7 +120,7 @@
     }
 
     private static class SLForeignExecutableCheckNode extends RootNode {
-        public SLForeignExecutableCheckNode() {
+        SLForeignExecutableCheckNode() {
             super(SLLanguage.class, null, null);
         }
 
