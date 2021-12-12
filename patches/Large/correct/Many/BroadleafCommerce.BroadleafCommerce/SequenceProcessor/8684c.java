diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/workflow/SequenceProcessor.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/workflow/SequenceProcessor.java
index 585fd48..e7bedae 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/workflow/SequenceProcessor.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/workflow/SequenceProcessor.java
@@ -94,10 +94,10 @@
                                 errorHandler.handleError(context, th);
                             }
                         } catch (RuntimeException e) {
-                            LOG.error("An exception was caught while attempting to handle an activity generated exception", th);
+                            LOG.error("An exception was caught while attempting to handle an activity generated exception", e);
                             throw e;
                         } catch (WorkflowException e) {
-                            LOG.error("An exception was caught while attempting to handle an activity generated exception", th);
+                            LOG.error("An exception was caught while attempting to handle an activity generated exception", e);
                             throw e;
                         }
                     }
