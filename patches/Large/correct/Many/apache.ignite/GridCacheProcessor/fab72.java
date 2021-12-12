diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProcessor.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProcessor.java
index 0acfe90..f32fb7e 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProcessor.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProcessor.java
@@ -2870,7 +2870,7 @@
 
                                 sendActivationResponse(req.requestId(), req.initiatingNodeId(), null);
                             }
-                            catch (IgniteCheckedException e) {
+                            catch (Exception e) {
                                 sendActivationResponse(req.requestId(), req.initiatingNodeId(), e);
                             }
                         }
@@ -4113,7 +4113,7 @@
 
         boolean failed = false;
 
-        final boolean isServerNode = !ctx.config().isClientMode();
+        final boolean isServerNode = !ctx.clientNode();
 
         glStLock.lock();
 
@@ -4144,7 +4144,7 @@
 
             ctx.service().onUtilityCacheStarted();
         }
-        catch (IgniteCheckedException e) {
+        catch (Exception e) {
             U.error(log, e);
 
             failed = true;
@@ -4181,7 +4181,7 @@
                         cacheReadyFut.onDone();
 
                     }
-                    catch (IgniteCheckedException e) {
+                    catch (Exception e) {
                         U.error(log, e);
 
                         //send fail to node which invoke activate
