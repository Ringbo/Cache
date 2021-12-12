diff --git a/h2o-core/src/main/java/water/RPC.java b/h2o-core/src/main/java/water/RPC.java
index c0deeef..a2c6aa8 100644
--- a/h2o-core/src/main/java/water/RPC.java
+++ b/h2o-core/src/main/java/water/RPC.java
@@ -391,7 +391,7 @@
           if( _client._heartbeat._client ) // Dead client will not accept a TCP ACK response?
             this.CAS_DT(dt,null);          // cancel the ACK
           try { Thread.sleep(100); } catch (InterruptedException ignore) {}
-        } catch( Exception e ) { // Custom serializer just barfed?
+        } catch( Throwable e ) { // Custom serializer just barfed?
           Log.err(e);            // Log custom serializer exception
           ab.drainClose();
         }
