diff --git a/truffle/com.oracle.truffle.api.interop/src/com/oracle/truffle/api/interop/ForeignAccess.java b/truffle/com.oracle.truffle.api.interop/src/com/oracle/truffle/api/interop/ForeignAccess.java
index 85d8b62..d06999e 100644
--- a/truffle/com.oracle.truffle.api.interop/src/com/oracle/truffle/api/interop/ForeignAccess.java
+++ b/truffle/com.oracle.truffle.api.interop/src/com/oracle/truffle/api/interop/ForeignAccess.java
@@ -603,7 +603,7 @@
         private final Class<?> baseClass;
         private final Factory10 factory;
 
-        public DelegatingFactory(Class<?> baseClass, Factory10 factory) {
+        DelegatingFactory(Class<?> baseClass, Factory10 factory) {
             this.baseClass = baseClass;
             this.factory = factory;
         }
