diff --git a/common/src/main/java/tachyon/security/authorization/FsAction.java b/common/src/main/java/tachyon/security/authorization/FsAction.java
index a35b659..3c2cc4c 100644
--- a/common/src/main/java/tachyon/security/authorization/FsAction.java
+++ b/common/src/main/java/tachyon/security/authorization/FsAction.java
@@ -16,10 +16,9 @@
 package tachyon.security.authorization;
 
 /**
- * File system actions, e.g. read, write, etc.
+ * POSIX style file system actions, e.g. read, write, etc.
  */
 public enum FsAction {
-  // POSIX style
   NONE("---"),
   EXECUTE("--x"),
   WRITE("-w-"),
@@ -35,7 +34,7 @@
   /** Retain reference to value array. */
   private static final FsAction[] SVALS = values();
 
-  private FsAction(String s) {
+  FsAction(String s) {
     mSymbol = s;
   }
 
@@ -44,7 +43,7 @@
   }
 
   /**
-   * Return true if this action implies that action.
+   * Returns true if this action implies that action.
    * @param that
    */
   public boolean implies(FsAction that) {
