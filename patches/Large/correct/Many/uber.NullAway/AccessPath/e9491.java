diff --git a/nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPath.java b/nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPath.java
index 7b0dd0f..86fa69e 100644
--- a/nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPath.java
+++ b/nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPath.java
@@ -50,7 +50,7 @@
  *
  * <p>We do not allow array accesses in access paths for the moment.
  */
-public class AccessPath {
+public final class AccessPath {
 
   private final Root root;
 
@@ -240,7 +240,7 @@
     if (this == o) {
       return true;
     }
-    if (o == null || getClass() != o.getClass()) {
+    if (!(o instanceof AccessPath)) {
       return false;
     }
 
