diff --git a/subprojects/core/src/main/java/org/gradle/api/internal/CompositeDomainObjectSet.java b/subprojects/core/src/main/java/org/gradle/api/internal/CompositeDomainObjectSet.java
index 843144d..2e51c29 100644
--- a/subprojects/core/src/main/java/org/gradle/api/internal/CompositeDomainObjectSet.java
+++ b/subprojects/core/src/main/java/org/gradle/api/internal/CompositeDomainObjectSet.java
@@ -209,7 +209,7 @@
         }
 
         @Override
-        public <TT> TT[] toArray(TT[] a) {
+        public <V> V[] toArray(V[] a) {
             throw new UnsupportedOperationException();
         }
 
