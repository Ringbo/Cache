diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/EqualsAvoidNullCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/EqualsAvoidNullCheck.java
index 32fd1cd..34d694a 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/EqualsAvoidNullCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/EqualsAvoidNullCheck.java
@@ -486,7 +486,7 @@
          * Creates new frame.
          * @param parent parent frame.
          */
-        public FieldFrame(FieldFrame parent) {
+        FieldFrame(FieldFrame parent) {
             this.parent = parent;
         }
 
