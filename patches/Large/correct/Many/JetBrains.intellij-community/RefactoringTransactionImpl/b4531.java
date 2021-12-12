diff --git a/lang-impl/src/com/intellij/refactoring/listeners/impl/impl/RefactoringTransactionImpl.java b/lang-impl/src/com/intellij/refactoring/listeners/impl/impl/RefactoringTransactionImpl.java
index 0084551..f0f1e00 100644
--- a/lang-impl/src/com/intellij/refactoring/listeners/impl/impl/RefactoringTransactionImpl.java
+++ b/lang-impl/src/com/intellij/refactoring/listeners/impl/impl/RefactoringTransactionImpl.java
@@ -40,7 +40,7 @@
           listenerList.add(listener);
         }
       }
-      catch (Exception e) {
+      catch (Throwable e) {
         LOG.error(e);
       }
     }
@@ -72,7 +72,7 @@
             try {
               refactoringElementListener.elementMoved(newElement);
             }
-            catch (Exception e) {
+            catch (Throwable e) {
               LOG.error(e);
             }
           }
@@ -87,7 +87,7 @@
             try {
               refactoringElementListener.elementRenamed(newElement);
             }
-            catch (Exception e) {
+            catch (Throwable e) {
               LOG.error(e);
             }
           }
