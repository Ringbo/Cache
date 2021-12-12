diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/design/FinalClassCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/design/FinalClassCheck.java
index aac168a..6826004 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/design/FinalClassCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/design/FinalClassCheck.java
@@ -134,12 +134,12 @@
         }
 
         /** Adds private ctor. */
-        void reportPrivateCtor() {
+        private void reportPrivateCtor() {
             withPrivateCtor = true;
         }
 
         /** Adds non-private ctor. */
-        void reportNonPrivateCtor() {
+        private void reportNonPrivateCtor() {
             withNonPrivateCtor = true;
         }
 
@@ -147,7 +147,7 @@
          *  Does class have private ctors.
          *  @return true if class has private ctors
          */
-        boolean isWithPrivateCtor() {
+        private boolean isWithPrivateCtor() {
             return withPrivateCtor;
         }
 
@@ -155,7 +155,7 @@
          *  Does class have non-private ctors.
          *  @return true if class has non-private ctors
          */
-        boolean isWithNonPrivateCtor() {
+        private boolean isWithNonPrivateCtor() {
             return withNonPrivateCtor;
         }
 
@@ -163,7 +163,7 @@
          *  Is class declared as final.
          *  @return true if class is declared as final
          */
-        boolean isDeclaredAsFinal() {
+        private boolean isDeclaredAsFinal() {
             return declaredAsFinal;
         }
 
@@ -171,7 +171,7 @@
          *  Is class declared as abstract.
          *  @return true if class is declared as final
          */
-        boolean isDeclaredAsAbstract() {
+        private boolean isDeclaredAsAbstract() {
             return declaredAsAbstract;
         }
     }
