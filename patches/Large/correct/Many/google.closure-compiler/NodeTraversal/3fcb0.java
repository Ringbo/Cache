diff --git a/src/com/google/javascript/jscomp/NodeTraversal.java b/src/com/google/javascript/jscomp/NodeTraversal.java
index 1a54086..0ac5ae8 100644
--- a/src/com/google/javascript/jscomp/NodeTraversal.java
+++ b/src/com/google/javascript/jscomp/NodeTraversal.java
@@ -271,7 +271,7 @@
     this.useBlockScope = scopeCreator.hasBlockScope();
   }
 
-  private void throwUnexpectedException(Exception unexpectedException) {
+  private void throwUnexpectedException(Throwable unexpectedException) {
     // If there's an unexpected exception, try to get the
     // line number of the code that caused it.
     String message = unexpectedException.getMessage();
@@ -307,7 +307,7 @@
       // null parent ensures that the shallow callbacks will traverse root
       traverseBranch(root, null);
       popScope();
-    } catch (Exception unexpectedException) {
+    } catch (Error | Exception unexpectedException) {
       throwUnexpectedException(unexpectedException);
     }
   }
@@ -326,7 +326,7 @@
       traverseBranch(root, scopeRoot);
 
       popScope();
-    } catch (Exception unexpectedException) {
+    } catch (Error | Exception unexpectedException) {
       throwUnexpectedException(unexpectedException);
     }
   }
@@ -362,7 +362,7 @@
       pushScope(s);
       traverseBranch(root, null);
       popScope();
-    } catch (Exception unexpectedException) {
+    } catch (Error | Exception unexpectedException) {
       throwUnexpectedException(unexpectedException);
     }
   }
@@ -437,7 +437,7 @@
       initScopeRoots(scopeRoot.getParent());
       // null parent ensures that the shallow callbacks will traverse root
       traverseBranch(scopeRoot, scopeRoot.getParent());
-    } catch (Exception unexpectedException) {
+    } catch (Error | Exception unexpectedException) {
       throwUnexpectedException(unexpectedException);
     }
   }
