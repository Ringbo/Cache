diff --git a/stratosphere-runtime/src/main/java/eu/stratosphere/nephele/ipc/Server.java b/stratosphere-runtime/src/main/java/eu/stratosphere/nephele/ipc/Server.java
index 51a14d7..406d7be 100644
--- a/stratosphere-runtime/src/main/java/eu/stratosphere/nephele/ipc/Server.java
+++ b/stratosphere-runtime/src/main/java/eu/stratosphere/nephele/ipc/Server.java
@@ -949,10 +949,10 @@
 					responder.doRespond(call);
 				} catch (InterruptedException e) {
 					if (running) { // unexpected -- log it
-						LOG.info(getName() + " caught: ", e);
+						LOG.error(getName() + " caught: ", e);
 					}
 				} catch (Exception e) {
-					LOG.info(getName() + " caught: ", e);
+					LOG.error(getName() + " caught: ", e);
 				}
 			}
 			LOG.debug(getName() + ": exiting");
