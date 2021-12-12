diff --git a/rt/transports/jms/src/main/java/org/apache/cxf/transport/jms/util/PollingMessageListenerContainer.java b/rt/transports/jms/src/main/java/org/apache/cxf/transport/jms/util/PollingMessageListenerContainer.java
index 8096eb3..c4276eb 100644
--- a/rt/transports/jms/src/main/java/org/apache/cxf/transport/jms/util/PollingMessageListenerContainer.java
+++ b/rt/transports/jms/src/main/java/org/apache/cxf/transport/jms/util/PollingMessageListenerContainer.java
@@ -65,12 +65,12 @@
                             if (session.getTransacted()) {
                                 session.commit();
                             }
-                        } catch (Exception e) {
+                        } catch (Throwable e) {
                             LOG.log(Level.WARNING, "Exception while processing jms message in cxf. Rolling back", e);
                             safeRollBack(session);
                         }
                     }
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     catchUnexpectedExceptionDuringPolling(null, e);
                 }
             }
@@ -83,7 +83,7 @@
                 if (session != null && session.getTransacted()) {
                     session.rollback();
                 }
-            } catch (Exception e1) {
+            } catch (Throwable e1) {
                 LOG.log(Level.WARNING, "Rollback of Local transaction failed", e1);
             }
         }
